import java.util.HashMap;


public class MaPDel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm  = new HashMap();
		hm.put("K1", "Val1");
		
		HashMap hm1 = null;
		System.out.println(hm);
		if ( hm != null) { 
			hm.clear();
			System.out.println("cleared");
			}
		
		System.out.println("here");
		System.out.println(hm);
		
		/*hm.put("K1", "Val1");
		hm.put("K2", "Val2");
		
		System.out.println("Is " +hm.isEmpty());
		System.out.println("hm is :" + hm.size());
		System.out.println("hm is :" + hm);
		hm.clear();
		System.out.println("Is " +hm.isEmpty());
		System.out.println("hm is :" + hm.size());*/
	}

}
