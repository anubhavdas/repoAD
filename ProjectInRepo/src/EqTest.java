public class EqTest{
	 public static void main(String argv[]){
		 EqTest e=new EqTest();
 	}

	EqTest(){
		 String s="Java";
		 String s2="java";
		     
		 	 if (s==s2)
			 System.out.println("s==s2 Equal");
		     else			 
			 System.out.println("s==s2 Not equal");
			 
			 if(s.equalsIgnoreCase(s2)) 
			 System.out.println("s.equalsIgnoreCase(s2) Equal");
			 else			 
			 System.out.println("s.equalsIgnoreCase(s2) Not equal"); 
	}
}
