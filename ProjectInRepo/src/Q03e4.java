public class Q03e4 {
    public static void main(String[] args) {
        String space = " ";

        String composite = space + space + "hello" + space + space + space;
        composite.concat("world");
        System.out.println(composite);
        
        composite = composite.concat("world");
        System.out.println(composite);
        
        composite = composite.replace("o", "O");
        System.out.println(composite);
        
        composite = composite.trim();
        //composite.trim();

        System.out.println(composite.length());
    }
}
