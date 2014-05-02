public class TestAutoBoxing {
    public static void main(String... args) {
        short s1=2;
        short s2=2;
        short s3=100;
        calculate(s1, s2);
        calculate(s1, s2, s3);
        byte b1 = 5;
        byte b2 = 6;
        calculate(b1,b2);
    }
    static void calculate(Short s1, Short s2){
        System.out.println("Using Boxing ...");
    }
 //   static void calculate(int i, long l){
 //       System.out.println("Using Widening ...");
 //   }
    static void calculate (int... var) {
        System.out.println("Using Variable Argument Lists ...");
    }
}
