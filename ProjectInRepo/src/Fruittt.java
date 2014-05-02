import java.io.*;

class Seed implements Serializable
{}

public class Fruittt extends Seed implements Serializable {
    Seed s = new Seed();
    public static void main(String... args){
        Fruittt f = new Fruittt();
        try {
            FileOutputStream fos = new FileOutputStream("fruit.out");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            System.out.println("Here");
            os.writeObject(f);
            System.out.println("There");
            os.close() ;
            System.out.println("Serialization done");
        } catch (Exception e ) {
            System.out.println("Exception..." + e);
        }
    }
}
