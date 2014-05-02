import java.io.*;
public class FileE {
    public static void main(String argv[]){
	FileE m=new FileE();
	System.out.println(m.amethod());
    }
    public int amethod() {
	try {
	    FileInputStream dis=new FileInputStream("Hello.txt");
	    return 21;
	}catch (FileNotFoundException fne) {
	    System.out.println("No such file found");
	    return -11;
	}
	catch(IOException ioe) {}
	finally{
	    System.out.println("Doing finally");
	}
	System.out.println("Does it come here?");
	return 0;
    }

}
