public class Q8499 {
    public static void main(String[] args) {
        double d = -2.9;
        int i = (int) d;
        
        System.out.println("(int) Math.ceil(d) : "  + (int)Math.ceil(d));
        System.out.println("(int) Math.abs(d) : " + (int) Math.abs(d));
        System.out.println("i : " + i);        
        i *= (int) Math.ceil(d);
        System.out.println(i);
        i *= (int) Math.abs(d);
        System.out.println(i);
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = s1.append("World");
        System.out.println(s2);
    }
}
