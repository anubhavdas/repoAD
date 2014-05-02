
public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

String command1 = "/eniq/sw/bin/engine -e reloadConfig";
String command2 = "/eniq/sw/bin/scheduler activate	";

//String s = "Config";

if(command1.contains("-e reloadConfig")) {
	System.out.println("TRUE");
}
else {
	System.out.println("FALSE");
}

System.err.println("Connection to scheduler failed. (Connection)");

	}

}
