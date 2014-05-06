
public class Byte1 {

	public static void main(String[] args) {

		byte[] data = new byte[] {};
		System.out.println(data);
		if (data.length == 0) {
			System.out.println("failed");
		}
		
		final byte[] bytes = (byte[]) data;
		if (bytes[0] == 0) {
		System.out.println(bytes);
		}
	}

}
