public class Q76a9 {
    static String f() {
        String a = "hello";
        String b = "bye";            // (0)
        String c = b + "!";          // (1)
        String d = b;                // (2)

        b = a;                       // (3)
        d = a;                       // (4)
        return c;                    // (5)
    }

    public static void main(String[] args) {
        String msg = f();
        System.out.println(msg);     // (6)
    }
}
