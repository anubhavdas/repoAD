class Fruit {
 Fruit(int type) {
  System.out.println("Fruit:" + type);
 }}

class Apple extends Fruit {
 Apple() {
  super(25);
  System.out.println("Apple");
 }}

public class TestFruit {
    public static void main(String[] args){
        Apple a = new Apple();
        System.out.println("---------------------------");
    	Fruit f = new Fruit(67);
    }
}