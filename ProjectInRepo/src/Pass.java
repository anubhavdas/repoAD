public class Pass{
    static int j=20;
    public static void main(String argv[]){
	int i=10;
	//Pass p = new Pass();
	amethod(i);
	System.out.println(i);
	System.out.println(j);
    }

    public static void amethod(int i){
	i=i*2;
	j=j*2;
    }
}
