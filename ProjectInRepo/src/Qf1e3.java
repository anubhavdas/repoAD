class Base {
    int i;
    Base() {
    	System.out.println("Base cons");
    	add(1); 
    	}
    void add(int v) {
    	i += v; 
    	System.out.println("Base Add:" + i);
    	}
    
    void print() { System.out.println(i); }
}

class Extension extends Base {
    Extension() {
    	System.out.println("Extension cons");
    	add(2); 
    	}
    void add(int v) { 
    	i += v*2; 
    	System.out.println("Extension Add:" + i);
    	}
}

public class Qf1e3 {
    public static void main(String[] args) {
        bogo(new Extension());
    }
    static void bogo(Base b) {
    	System.out.println("Here");
        b.add(8);
        System.out.println("There");
        b.print();
    }
}
