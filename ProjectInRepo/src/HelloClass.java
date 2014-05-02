class Fruity {
 Fruity(int type) {
  System.out.println("Fruit with Types :" + 10);
 }
 
 Fruity() {
	 System.out.println("Fruit without types");
 }
}

class Appley extends Fruity {
 Appley() {
	 super(10);
  System.out.println("Apple without types");
 }
// Appley(int type) {
//	 System.out.println("Apple with types");
// }
 
}

public class HelloClass {
    public static void main(String[] args){
     Appley a = new Appley();
    }
}