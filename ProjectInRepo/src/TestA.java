class C {
 C() {
  System.out.println("C");
 }
}

class D extends C {
 D() {
  System.out.println("D");
 }
 
 D(int x) {
	 this();
  System.out.println("DD :" + x);
  
 }
}

public class TestA {
    public static void main(String[] args){
    //	D d = new D();
    //	C c  = new C();
    	
    //	C c1 = new C();
    //	System.out.println("---");
    //	C c = new D();
    //	System.out.println("World");
    //	D d = new D();
    //	System.out.println("Hello");
    	D d1 = new D(5);
    	
    }
}