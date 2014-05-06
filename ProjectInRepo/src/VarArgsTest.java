public class VarArgsTest {
     public void invoke(Float f, Float g) {
         System.out.println("Float and Float invoked");
     }
     
     public void invoke(Float f, float ... g) {
         System.out.println("Float and variable args invoked");
     }
     
     public void invoke(int f, int g) {
         System.out.println("Int and int invoked");
     }
     
     public static void main(String[] args) {
         new VarArgsTest().invoke(67.3f, 27.8f, 34.5f);
         
         new VarArgsTest().invoke(67.3f, 27.8f);
         
         new VarArgsTest().invoke(67, 27);
    }
 }
