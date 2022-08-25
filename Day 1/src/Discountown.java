
public class Discountown {
public static void main(String[]args){
	String name= "t shirt";
	String brand= "fanideaaz";
	String color="balck";
	char size= 'L';
	int originalAmount= 550;
	int tax = 25;
	int discount= 15;
	
	int taxAmount= originalAmount*tax/100;
	int discountAmount= originalAmount*discount/100;
	int netPrice = originalAmount+tax-discount;
	
	 System.out.println("name:"+name);
	 System.out.println("brand:"+brand);
	 System.out.println("color:"+color);
	 System.out.println("size:"+size);
	 System.out.println("taxAmount:"+taxAmount);
	 System.out.println("discountAmount:"+discountAmount);
	 System.out.println("netPrice:"+netPrice);

	 
	 
	
			

	
	
		
	
	
	
	
	
}
}
