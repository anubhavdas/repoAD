 interface AB{
 public void innerMeth();
 }
        public class TestExample3 {
   AB a;
   int memVar = 1;
          void aMethod(){
                 a = new AB(){
                 public void innerMeth(){
                 System.out.println(memVar);
                 } };
    }

           public static void main(String[] args){
            TestExample3 t = new TestExample3();
             t.a.innerMeth();
            }
          }

