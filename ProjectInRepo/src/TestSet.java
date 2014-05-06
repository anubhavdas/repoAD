import java.util.Set;
 import java.util.LinkedHashSet;
 public class TestSet {
	 static boolean b1,b2,b3,b4;
     public static void main(String[] args){
         Set s = new LinkedHashSet();
         try {
         b1 = s.add("Windows");
         if (b1)
        	 System.out.println("Added Windows");
         else 
        	 System.out.println("Skipped Windows");
         b2 = s.add("Mac");
         if (b2)
        	 System.out.println("Added Mac");
         else 
        	 System.out.println("Skipped Mac");
         b3 = s.add("Mac");
         if (b3)
        	 System.out.println("Added Mac");
         else 
        	 System.out.println("Skipped Mac");
         b4 = s.add("Unix");
         if (b4)
        	 System.out.println("Added Unix");
         else 
        	 System.out.println("Skipped Unix");
         }
         finally {}
         System.out.println(b1);
         System.out.println(b2);
         System.out.println(b3);
         System.out.println(b4);
        System.out.println(s);
    }
}
