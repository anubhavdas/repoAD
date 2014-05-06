
public class Field {
	
//	abstract int i1;
	volatile int i2 ;
//	native int i3;
	transient volatile static private int pv = 10;
//	synchronized int i4;
	static boolean b;
	
	public static void main(String[] args) {
//	System.out.println(b); //false
	boolean[] boo = new boolean[1];
	System.out.println(boo[0]); //false

	int[] i = new int[3];
	System.out.println(i.length); //3
	pv = ++pv;
	System.out.println(pv);
	}

}
