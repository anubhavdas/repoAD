import java.util.*;

public class InstanceOf {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		System.out.println("h instanceof Object " + h instanceof Object);
		//System.out.println(h instanceof TreeSet);
		System.out.println(h instanceof Set);
		System.out.println(h instanceof SortedSet);
		System.out.println(h instanceof LinkedHashSet);
		
		System.out.println("------");
		
		LinkedHashSet l = new LinkedHashSet();
		System.out.println(l instanceof Object);
		System.out.println(l instanceof Set);
		System.out.println(l instanceof SortedSet);
		System.out.println(l instanceof LinkedHashSet);
		System.out.println(l instanceof HashSet);
		System.out.println("------");
		int [] nums = new int[3];
		System.out.println(nums instanceof Object);
		
	}

}
