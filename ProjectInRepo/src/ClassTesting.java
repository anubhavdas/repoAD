class upper1 {
	int i = 100;
	
	void method() {
		System.out.println("In upper");
	}}

class suber1 extends upper1 {
	int i = 20;
	
	void method() {
		System.out.println("In suber");
	}}

public class ClassTesting {
	
	public static void main(String[] args) {

		upper1 u1 = new upper1();
		System.out.println(u1.i);
		u1.method();
		
		suber1 s1 = new suber1();
		System.out.println(s1.i);
		s1.method();
		
		upper1 u2 = new suber1();
		System.out.println(u2.i);
		u2.method();
	}}
