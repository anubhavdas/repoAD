
abstract class BaseAbstractClass
  {
     abstract int getIndex();
  }
  public class MyAbstractClass extends BaseAbstractClass
  {
    private int index = 5;
    public int getIndex(){ 
    	return index;
    	}

public static void main(String[] args)
   {
	MyAbstractClass mac = new MyAbstractClass();
	System.out.println(mac.getIndex());
   }
}