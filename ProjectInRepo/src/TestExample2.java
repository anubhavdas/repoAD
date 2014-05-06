interface AA{
 public void method1();
 }
 
class One implements AA{
 public void method1(){
	 System.out.println("hello : ONE");
 	}
 }
 class Two extends One{
	 public void method1(){
System.out.println("hello : TWO");
 }
 }
 
 public class TestExample2 extends Two{
 public static void main(String[] args)
 {
 //AA a  = new AA();
 AA a;
 One o = new One();
 o.method1();
 Two t = new Two();
 a = t;
 a.method1();
 }
 }
