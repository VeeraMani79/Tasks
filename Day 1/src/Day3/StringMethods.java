package Day3;

public class StringMethods {
public static void main(String[]args) {
	
	String name = "Veeramani";
    
	int s= name.length()-1;
    char []a= name.toCharArray();
  
	System.out.println(name.equalsIgnoreCase("veera"));
	System.out.println(name.contains("i"));
	System.out.println(name.concat("veera"));
	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.startsWith("v"));
	System.out.println(name.endsWith("i"));
	System.out.println(name.indexOf("m"));
	System.out.println(name.charAt(s));
	System.out.println(name.charAt(5));
	System.out.println(name.substring(4,8));
    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    System.out.println(a[3]);
    System.out.println(a[4]);
    System.out.println(a[5]);
    System.out.println(a[6]);
    System.out.println(a[7]);
    System.out.println(a[8]);
    
    
    
}
}
