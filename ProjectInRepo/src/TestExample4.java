class Rectangle{
           public int area(int length , int width) {
        	   System.out.println("Rect");
             return  length * width;
           } }

         class Square extends Rectangle{
            public int area(long length , long width) {
            	System.out.println("Square");
            return  (int) Math.pow(length ,2);
           } 
            
         void method() {
        	 System.out.println("method");
         }
         }
         
        class TestExample4{
          public static void main(String args[]) {
          // Square r = new Square();
          // System.out.println(r.area(5 , 4));
          // System.out.println(r.area(5L , 4L));
        	  Rectangle r = new Square ();
        	  System.out.println(r.area(5,4));
              System.out.println(r.area(5L,4L));
        	  
          }
        }

