
public class Assert1 {

	public static void main(String[] args) {
	
		Assert1 as = new Assert1();
		as.method();
	}
	
		void method () {
			try {
				
		for(int i = 1; i < 4; i++)
			  for(int j = 1; j < 4; j++)
			    if(i == j)
			       assert i!=j ;//: "i : " + i + " j : " + j;
		System.out.println("Here");
		//int ii = (Integer) null;
		//System.out.println(ii);
		}
		catch(Exception e) {
			System.out.println("e occurred : " + e);
		}
		}
	}


	