
public class LongInt {
	public static void main(String[] args) {

/*		byte b1 = 5;
		short s1 = b1;
		
		short s2 = 16;
		//byte b2 = s2;
		
		int i1 = 10;
		//int i2 = 10F;
		//int i3 = 10D;
		//int i4 = 10.56;
		
		long l1 = 10;
		long l2 = 10L;
		//long l3 = 10.0;
		//long l4 = 10F;
		//long l5 = 10.0F;
		
		float f1 = 10.0F;
		float f2 = 10L;
		//float f3 = 10.0;
		//float f4 = 10.0D;
		float f5 = 10;
				
		double d1 = 15D; System.out.println(d1);
		double d2 = 15.0; System.out.println(d2);
		double d3 = 15F; System.out.println(d3);
		double d4 = 15L; System.out.println(d4);
*/		
		byte a = 3; // No problem, 3 fits in a byte
		byte b = 8; // No problem, 8 fits in a byte
		//byte c = a + b;
		byte c1 = (byte)(a+ b);
		
		int x = a;
		System.out.println(x);
		
		short s = (short) 1000056L;
		System.out.println("s : " + s);
		
		float f5 = (float)32.3;
		float f6 = 32.3f;
		System.out.println("f5 :" + f5);
		
		byte b7 = 3;
		//byte b8 = b7 + 5;
		b7 += 5;
	}

}
