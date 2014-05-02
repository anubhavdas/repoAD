		class Mammal{
         void eat(Mammal m){
         System.out.println("Mammal eats food");
         }
      }
		
		class Cattle extends Mammal{
         void eat(Cattle c){
         System.out.println("Cattle eats hay");
         }
      }
		
		class Horse extends Cattle{
          void eat(Horse h){
          System.out.println("Horse eats hay");
          }
      }
		
      public class TestExample1{
        public static void main(String[] args){
        /*	Cattle c = new Cattle();
        	c.eat(c);
        	Horse h = new Horse();
        	h.eat(c);*/
          Mammal m1 = new Horse();
          Cattle c1 = new Horse();
          Horse h1 = new Horse();
         // m1.eat(h1);
         // m1.eat(c1);
         // c1.eat(m1);
          m1.eat(c1);
        }
      }

