
public class char1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//char ch1 = "a";
		//char ch2 = '\'';
		//char ch3 = 'cafe';
		//char ch4 = "cafe";
		//char ch5 = '\ucafe';
		//char ch6 = '\u101010';
		//char ch7 = (char)true;	
		//System.out.println("ch1 " + ch1);
		//System.out.println("ch2 " + ch2);
		//System.out.println("ch3 " + ch3);
		//System.out.println("ch4 " + ch4);
		//System.out.println("ch5 " + ch5);
		//System.out.println("ch6 " + ch6);
		//System.out.println("ch7 " + ch7);	
		
		
		String s1 = new String("JunkValue");
		Boolean b1 = new Boolean(s1);
	//	boolean b2 = "Junk";
		System.out.println("s1 " + s1);
		System.out.println("b1 " + b1);
		if(s1.equals(b1)) {
			System.out.println("Equal:");
		}
		else {
		System.out.println("NotEqual");
		}
	
		String foo = "blue";
		Boolean[] bar = new Boolean[1];
		System.out.println(bar[0]);
	//	if(bar[0]){
	//		System.out.println("Inside");
	//	}
		
	}

}
