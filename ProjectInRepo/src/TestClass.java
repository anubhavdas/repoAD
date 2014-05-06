abstract class A {
    abstract int compute (int x, int y);
    abstract int getArea();
}

class B extends A {
    int compute (int x, int y) { return x+y; }
}

public class TestClass {
 public static void main(String[] args) {
     B b = new B();
     int result = b.compute(1, 2);
     System.out.println(result);
 }
}