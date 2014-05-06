         
public class Test {

	public static void main(String args[]){
		class Foo {
	
	volatile int v=10;
    transient float f=10.5f;
   // int native n=5;
    static final short s=29;
    
        	 public int i = 3;
        //	 float[]= new float(3);
        	 float[] f1 = new float[3];
        	 
        //	 float f2[] = new float[];
        	 float f22[] = new float[3];
        	 float f222[] = new float[]{1,2,3};
        	 
        	 float f3[] = new float[3];
        	 float[] f4 = new float[3];
        	 
        	 float f5[] = {1.0f, 2.0f};
        	 
         }
         Object o = (Object)new Foo();
         Foo foo = (Foo)o;
         System.out.println(foo.i);
         
         }
     }
