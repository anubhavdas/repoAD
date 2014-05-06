import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal123 implements Serializable{
	String bodyType="Animal";
    }

public class Serial extends Animal123 implements Serializable {
	//Animal123 a = new Animal123();
    String name;
    Serial(String bt, String nm) {
        bodyType = bt;
        name = nm;
        
    }
    public static void main(String [] args) {
    	Serial ss = new Serial("Mammall", "Tiger");
        
        try {
        FileOutputStream fos = new FileOutputStream("animal.bin");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(ss);
        os.close ();
    } catch (Exception ex) { 
     ex.printStackTrace(); 
 }
    try {
        FileInputStream fis = new FileInputStream("animal.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ss = (Serial) ois.readObject();
        ois.close();
        System.out.println("Later : " + ss.bodyType + " " + ss.name);
    } catch (Exception ex) {
     ex.printStackTrace();
 }

    
    }
}
