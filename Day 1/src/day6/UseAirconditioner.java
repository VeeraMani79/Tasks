package day6;

public class UseAirconditioner {
 public static void main(String[] args) {
	
	String  a =args[0];
	String []b=a.split(",");
 Airconditioner ac=new Airconditioner();
 
	ac.brand=b[0];
    int c=Integer.parseInt(b[1]);
     ac.price=c;
	ac.isAutomatic=Boolean.parseBoolean(b[2]);
	
	if((ac.brand.equals('a'))||(ac.brand.equals('e'))||(ac.brand.equals('i'))||(ac.brand.equals('o'))||(ac.brand.equals('u'))) {
		
	System.out.println("barnd is dosent contain vowels ");
	}
	else {
		System.out.println("brand is contain vowels ");
	}
	

	
}
}