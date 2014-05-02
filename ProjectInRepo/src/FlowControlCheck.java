public class FlowControlCheck
 {
     public static void main(String... args)
     {
         long num=8;
         while(num) {
             if(num == 7)
                 break;
             num--;
        }
        System.out.printf("num=%d", num);
    }
}
