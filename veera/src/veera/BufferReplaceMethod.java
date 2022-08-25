package veera;

public class BufferReplaceMethod {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello"); // replace method
		sb.replace(1, 3, "Java");
		System.out.println(sb);// prints HJavalo
	}
}
