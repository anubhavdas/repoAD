import java.io.*;

public class ThrowsEx {

	public static void main(String[] args) {

		ThrowsEx te = new ThrowsEx();
		try {
			System.out.println("Printing " + te.method());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}		
		int method () throws FileNotFoundException { 
			try {
				int i = 10;
			FileInputStream dis=new FileInputStream("Hello.txt");
			}
			catch (Exception e) {
				throw new FileNotFoundException();
			}
			finally {
				System.out.println("Final");
				return 10;
			}
			
		}

}
