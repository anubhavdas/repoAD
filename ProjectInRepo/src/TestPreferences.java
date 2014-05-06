import static java.lang.System.out;
import java.util.prefs.*;

public class TestPreferences {
    public static void main(String... args) {
        PrefListener listener = new PrefListener();
        Preferences rootNode = Preferences.userRoot().node("Sports");
        rootNode.addNodeChangeListener(listener);
        rootNode.addPreferenceChangeListener(listener);
        
        try {
            Preferences node1 = rootNode.node("Node1");
            //node1.put("game", "chess");

            Preferences node2 = node1.node("Node2");
            node1.addPreferenceChangeListener(listener);
            node2.put("numsquares", "64");
            node2.addPreferenceChangeListener(listener);
            node1.put("game", "chess");
            rootNode.put("numplayers", "2");
            node2.put("numsquares", "644");
        } catch (Exception ex) {}
    }
}

class PrefListener implements NodeChangeListener, PreferenceChangeListener {
    public void preferenceChange(PreferenceChangeEvent pce) {
    	out.printf("Changed preference at Node: %s, key: %s, value: %s\n", pce.getNode().name(), pce.getKey(), pce.getNewValue());
    }
    public void childAdded(NodeChangeEvent nceEvt) {
        out.printf("Child: ");
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
}
