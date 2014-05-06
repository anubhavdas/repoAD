
public class tuna {

	private String firstName;
	private String lastName;
	private static int members;
	static final int XYZ = 5;
	public int b;
	
	tuna(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		members++;		
		int a;
		a++;
		b++;
		
	}
	
	String getfirstName(){
		return firstName;
	}
	
	String getlastName(){
		return lastName;
	}
	
	static int getMembers() {
		return members;
	}
	
}
