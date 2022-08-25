package veera;

public class BufferDeleteMethod {
	public static void main(String args[]) { // delete method
		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo
	}
}
