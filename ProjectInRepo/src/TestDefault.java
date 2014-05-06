public class TestDefault {
    public static void main(String [] args) {
        int index=1, num=0;
        switch(index)
        {
            case 2  : num+=2;
            default : num+=4;
            case 3  : num+=3;
                      break;
            case 0  : num+=5;
        }
        System.out.printf("%d",num);
    }
}
