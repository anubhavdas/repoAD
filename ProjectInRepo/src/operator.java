
public class operator {

	public static void main(String[] args) {
		
		int i = -1;
		
		System.out.println(i<<1);
		System.out.println(i>>1);
		System.out.println("-1>>>1");
		System.out.println(i>>>1);
		
		int y = -2;
		
		System.out.println(y<<1);
		System.out.println(y>>1);
		
		System.out.println("-2>>>1");
		System.out.println(y>>>1);
			
		int ab = -6;
		System.out.println(ab<<1);
		System.out.println(ab>>1);
		
		System.out.println("-5>>>1");
		System.out.println(-5>>>1);
		
		int a = 1;
		
//		System.out.println(a<<1);
//		System.out.println("hello");
//		System.out.println(a>>1);
		
		System.out.println("11>>>1");
		System.out.println(11>>>1);
		
		int b = 2;
		
		//System.out.println(b<<1);
		//System.out.println(b>>1);
		System.out.println("b>>>1");
		System.out.println(b>>>1);
		System.out.println(9 ^ 2);
		System.out.println(20 ^ 2);

		 	int value1 = 1;
	        int value2 = 2;
	        if((value1 == 1) && (value2 == 2))
	            System.out.println("value1 is 1 AND value2 is 2");
	        if((value1 == 1) | (value2++ == 1))
	            System.out.println("value1 is 1 OR value2 is 1");
	        	System.out.println(value2);
	        int bitmask = 0x0F0F;
	        int val = 0x2222;
	        // prints "2"
	        System.out.println(val & bitmask);

	        
		
	}
	
}
