
public class AssignmentClass {

	static double a; static float b; static int c; static char d = 'a';
	
	public static void main(String[] args) {

	a = b = c = d;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println((a+b+c+d) == 4 * 'a');
		
	}

}
