class Base{
}
class Derived extends Base{
}    
     public class TestExample5 {
       public static void main(String[] args){
        //   Derived d = (Derived) new Base();
    	//   Derived d = new Base();
    	   Base b = (Base)new Derived();       
     }

}