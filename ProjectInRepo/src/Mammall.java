import java.io.*;

class Super implements Serializable{ 
	String bodyType = "Super";
}
class Animal extends Super {//implements Serializable{
	String bodyType="Animal";
    }

public class Mammall extends Animal implements Serializable {
//	Super s = new Super();
	Animal a = new Animal();
    String name;
    Mammall(String bt, String nm) {
        bodyType = bt;
        name = nm;
        
    }
    public static void main(String [] args) {
    	Mammall ml = new Mammall("Mammall", "Tiger");
        
        try {
        FileOutputStream fos = new FileOutputStream("animal.bin");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(ml); os.close ();
    } catch (Exception ex) { ex.printStackTrace(); }
    
        try {
        FileInputStream fis = new FileInputStream("animal.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ml = (Mammall) ois.readObject(); ois.close();
        System.out.println("Later : " + ml.bodyType + " " + ml.name);
    } catch (Exception ex) {ex.printStackTrace(); }
    }}
