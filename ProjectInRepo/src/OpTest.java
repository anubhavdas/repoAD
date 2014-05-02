public class OpTest {
    public static void main(String[] args) {
        long a = 0x12;
        long b = 0x31;
        long c = a | b;
        System.out.println(c);
        
        long aa = 21;
        long bb = 42;
        Boolean cc = ((aa == 21) && (bb == 42));
     //   long cc = ((aa == 21) & (bb == 42));
        System.out.println("Hello :" + cc);
    }
}
