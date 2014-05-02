public class Q4a39 {
    int a = 1;
    int b = 1;
    int c = 1;
    class Inner {
        int a = 2;

        int get() {
            int c = 3;
            c = Q4a39.this.a;
            return c;
        }
    }

    Q4a39() {
        Inner i = new Inner();
        System.out.println(i.get());
    }

    public static void main(String[] args) {
        new Q4a39();
    }
}
