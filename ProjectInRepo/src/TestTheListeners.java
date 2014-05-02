import java.util.prefs.*;

public class TestTheListeners {
   public static void main(String[] args) {
      MyListener listener = new MyListener();
      // Create a node for testing 
      Preferences listeningNode = Preferences.userRoot().node("listening");
      listeningNode.addNodeChangeListener(listener);
      listeningNode.addPreferenceChangeListener(listener);

      try {
         listeningNode.put("key1", "bar");
         listeningNode.putInt("key1", 8276);
         listeningNode.clear();

         Preferences test1 = listeningNode.node("test1");
       //  test1.addNodeChangeListener(listener); //Try commenting this line
         Preferences test2 = test1.node("test2");

         test2.removeNode();
         test1.removeNode();
      } catch(BackingStoreException bsEx) { // Ignore it
      }
      try {
         Thread.sleep(5000);
      } catch(InterruptedException iEx) { // Ignore it as well
      }
   }
}

class MyListener implements NodeChangeListener, PreferenceChangeListener {
   public void childAdded(NodeChangeEvent nceEvt) {
      System.out.print("Child: ");
      System.out.print(nceEvt.getChild().name());
      System.out.print(" added to Parent: ");
      System.out.println(nceEvt.getParent().name());
   }
   public void childRemoved(NodeChangeEvent nceEvt) {
      System.out.print("Child: ");
      System.out.print(nceEvt.getChild().name());
      System.out.print(" removed from Parent: ");
      System.out.println(nceEvt.getParent().name());
   }
   public void preferenceChange(PreferenceChangeEvent pceEvt) {
      System.out.print("Preference change at Node: ");
      System.out.print(pceEvt.getNode().name());
      System.out.print(" key: " + pceEvt.getKey());
      System.out.println(" value: " + pceEvt.getNewValue());
   }
}
