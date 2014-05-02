import java.util.*;

public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector(3);
	//	v[1] = 10;
		v.addElement(50);
		v.add(20);
		System.out.println(v);
		
		HashMap hm = new HashMap();
		hm.put("Key", "value");		
		
		HashSet hs = new HashSet();
		hs.add(10);
		
		ArrayList al = new ArrayList();
		al.add(20);
	//	al.add(5, "element");
	}

}
