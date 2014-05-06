/*public class Birthday {
	void calling(String name, int age) {
		System.out.println("Birthday Birthday" + name + age);
	}}*/
/*  public class AD extends Birthday{
	void calling(String name, int age) {
		System.out.println("AD Birthday" + name  + age);
	}}*/

public class BBClass {
	public static void main(String[] args) {

		Birthday happy = new AD();
		happy.calling("ANUBHAV", 20);
		
		Birthday b = new Birthday();
		b.calling("MyName", 22);
		
		AD a = (AD) new Birthday();
		a.calling("YourName", 24);
}}