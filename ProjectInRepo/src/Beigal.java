/*public class Dog {
	Dog (String name) {
		System.out.println("Dog:" + name);
	}}*/
//Legal cons in Beigal
public class Beigal extends Dog{
//	Beigal(String name) {
//		super(name);
//		System.out.println("Is this called?");
//	}
	Beigal() {
		super("fodo");
		System.out.println("Beigal");
	}

public static void main(String[] args) {
//Beigal b = new Beigal();
//Dog d = new Dog("cons");
Dog d2 = new Beigal();
//Dog d1 = new Dog();
	}}