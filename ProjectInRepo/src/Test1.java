import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
    public static void main(String[] args){
        try
        {
         FileReader fr = new FileReader("nonExistentFile");
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("FileNotFoundException");
        }
    }
}
