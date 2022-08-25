package Day4;

public class Lms4 {
public static void main(String[]args) {
	
	String[] a= args[0].split(",");
	
	
	String b =a[0];
	float c=Float.parseFloat(a[1]);
	float d =Float.parseFloat(a[2]);
	String e=a[3];
	
	

	System.out.println("object= " +b);
	System.out.println("height= " +c);
	System.out.println("weight= " +d);
	System.out.println("brand= " +e);
	
			
	
	System.out.println(b.toUpperCase());
	System.out.println(e.toLowerCase());
	
	
	
	
	
}
}
