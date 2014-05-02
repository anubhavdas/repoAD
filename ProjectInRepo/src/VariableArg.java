class abcd {
	public void calc(int... var) {
			for (int i=0; i<var.length; i++) {
			System.out.println(var[i]);
		}	}  }

public class VariableArg {
	static boolean b;
	static Boolean B;
	public static void main(String[] args) {

		double d = 0x45;
		System.out.println("d : "+d);
		float f = 0xff;
		System.out.println("f : "+f);
		int i = 0x56;
		System.out.println("i : " + i);
		
		System.out.println("b:" + b);
		System.out.println("B:" + B);
		
		B = null;
	//	b = (boolean) null;
		//System.out.println(b);
		
		abcd a = new abcd();
		a.calc(12,45,52,'c');
	}
}
