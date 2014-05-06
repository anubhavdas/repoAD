import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

  private List<Integer> list;
  private static final int SIZE = 10;

  public ListOfNumbers () {
    list = new ArrayList<Integer>(SIZE);
      for (int i = 0; i < SIZE; i++) {
        list.add(new Integer(i));
    }
  }

  public void writeList() {
	  try {
    PrintWriter out = new PrintWriter(
      new FileWriter("OutFile.txt"));

    for (int i = 0; i < SIZE; i++) {
      out.println("Value at: " + i + " = " + list.get(i));
    }
    out.close();
	  }
	  catch (Exception e) {
		  System.out.println(e);
	  }
    
  }
}
