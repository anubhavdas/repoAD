import java.io.*;
class Cat implements Serializable {
	public int num; 
	} // 1
public class SerializeCat {
public static void main(String[] args) {
Cat c = new Cat(); // 2
c.num = 9;
System.out.println(c);
try {
FileOutputStream fs = new FileOutputStream("testSer.ser");
ObjectOutputStream os = new ObjectOutputStream(fs);
os.writeObject(c); // 3
os.close();
} catch (Exception e) { e.printStackTrace(); }
try {
	System.out.println(c.num);
FileInputStream fis = new FileInputStream("testSer.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
c = (Cat) ois.readObject(); // 4
System.out.println(c);
System.out.println(c.num);
ois.close();
} catch (Exception e) { e.printStackTrace(); }
}
}