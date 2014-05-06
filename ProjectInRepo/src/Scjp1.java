import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

  public class Scjp1{
     public static void main(String[] args)
     {
     Integer int1 = new Integer(10);
     Vector vec1 = new Vector();
     LinkedList list = new LinkedList();
     vec1.add(int1);
     list.add(int1);
     if(vec1.equals(list)) System.out.println("equal");
     else                  System.out.println("not equal");
     
   //  System.out.println(int1);
   //  System.out.println(vec1.elementAt(0));
     
     Integer a = new Integer(4);
     Integer b = new Integer(8);
     Integer c = new Integer(4);
     HashSet hs = new HashSet();
     hs.add(a);
     hs.add(b);
     hs.add(c);
     System.out.println("HashSet : " + hs);

    
         Integer aa = new Integer(9);
         Integer bb = new Integer(4);
         Integer cc = new Integer(7);
         Integer dd = new Integer(4);
         TreeSet ts = new TreeSet();
         ts.add(aa);
         ts.add(bb);
         ts.add(cc);
         ts.add(dd);
         System.out.println("TreeSet : " + ts);
             
         Integer ab = new Integer(8);
         Integer bc = new Integer(4);
         Integer cd = new Integer(4);
         Integer de = new Integer(5);
         Vector vec = new Vector();
         Iterator itr;
         vec.add(ab);
         vec.add(bc);
         vec.add(cd);
         vec.add(de);
         System.out.println("Vec: " + vec);
         
         
      }
  } 

