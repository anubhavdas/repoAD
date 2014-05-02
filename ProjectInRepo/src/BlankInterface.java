interface inter {}

class impl implements inter {
	void me() {
		System.out.println("me");
	}}

class BlankInterface extends impl {
	static String name;
	public static void main (String args[]) {
		
		impl i = new BlankInterface();		
		i.me();
	///	BlankInterface b = (BlankInterface) new impl();
		BlankInterface bl = new BlankInterface();
	//	i = bl;
	//	bl = (BlankInterface) i;
	//	bl.me();
	///	bl = i;
		
//		bl.methodInClass(name);
		impl ii = new impl();
		bl = (BlankInterface) ii;
//		ii = bl;
//		ii.me();
//		bl.me();
	}
	public void methodInClass (String myname) {
		System.out.println(myname);
	}
	void me() {
		System.out.println("meeee");
	}}