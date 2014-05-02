public class TestString {
    public static void main(String[] args){
     String s1 = new String("Hello");
     String s2 = "Hello";
     String s3 = "Hello";
     System.out.printf("%b,%b,%b", (s1==s2), (s2==s3), s1.equals(s2));
     
    }
}
