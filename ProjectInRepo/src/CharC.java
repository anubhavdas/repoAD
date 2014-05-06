public class CharC {
        public static void main(String[] args){
         CharC t = new CharC();
         char c = 4 * 4;
         System.out.println(c);
         String s = "bead";
         s = t.pearl(s);
         System.out.println(s);
         System.out.println(Byte.parseByte(s,c));
        }
        String pearl(String s){
         return s.substring(0,1);
          }
        }

