package veera;

public class BuferAppendMethod {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");  //append method
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
	}
}
