class Mammal1{
         Mammal1(Mammal1 m){
         System.out.println("Mammal eats food");
         }
      }
      class Cattle1 extends Mammal1{
         Cattle1(Cattle1 c){
         System.out.println("Cattle eats hay");
         }
      }

      class Horse1 extends Cattle1{
          Horse1(Horse1 h){
          System.out.println("Horse eats hay");
          }
      }
      public class TestExample11{
        public static void main(String[] args){
          Mammal1 m = new Mammal1();
          Mammal1 h = new Horse1();
          Cattle1 c = new Horse1();
          System.out.println("End");
        //  c.eat(h);
        }
      }

