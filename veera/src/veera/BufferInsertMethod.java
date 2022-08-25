package veera;

public class BufferInsertMethod {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");// now original string is changed // insert method
		System.out.println(sb);// prints HJavaello
	}
}
  