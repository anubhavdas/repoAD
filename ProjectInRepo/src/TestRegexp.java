import java.util.*;
import java.util.Set;
import java.util.SortedSet;
import java.util.regex.*;
class TestRegexp {
	char ch='t';
	String chs = "t";
	short s = 139;
	int i= 65530;
	long l=0xFACEL;
	
    public final static String PATTERN="\\D+";
    public final static String INPUT_STRING="opq23x445y";
    //public final static String INPUT_STRING="abcdefgh";
    public static void main(String[] args) {
  /*      Pattern p = Pattern.compile(PATTERN);
        System.out.println(p);
        Matcher m = p.matcher(INPUT_STRING);
        boolean b = false;
        while(b = m.find()) {
    //    	System.out.print("\n" + "-------------");
            System.out.println("m.start : " + m.start());
            System.out.println("m.end : " + m.end());
            System.out.println("m.group : " + m.group());
            System.out.println("m.groupCount : " + m.groupCount());
            System.out.println("m.pattern : " + m.pattern());
            System.out.println("m.hashCode : " + m.hashCode());
            System.out.println("m.toString : " + m.toString());
            System.out.println("m.regionEnd : " + m.regionEnd());
            System.out.println("m.regionStart : " + m.regionStart());
        } */
        
        System.out.println("st".concat("ep"));
        System.out.println("st"+"ep");
        System.out.println('s'+'t'+'e'+'p');
  //      System.out.println("st" + new String('e' + 'p'));
        
  //      String s = new String('e' + 'p');
        String s11 = new String("e" + "p");
        
        Object a  = new HashSet();
        System.out.println((a instanceof Set));
        System.out.println((a instanceof HashSet));
        System.out.println(a instanceof SortedSet);
        System.out.println(a instanceof TreeSet);
        System.out.println(a instanceof LinkedHashSet);
    }
}