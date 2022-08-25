
public class exrsize {
public static void main(String[]args) {
	String carName= "nissan";
	int model = 2018;
	String color= "red";
	String weight="1000kg";
	int originalPrice=45000;
	int tax=500;
	int discount= 1000;
	
	int taxAmount=originalPrice* tax/100;
	int discountAmount=originalPrice* discount/100;
	int netprice= originalPrice+tax-discount;
	
	
	 System.out.println("carName:"+carName);
	 System.out.println("model:"+model);
	 System.out.println("color:"+color);
	 System.out.println("weight:"+weight);
	 System.out.println("originalPrice:"+originalPrice);
	 System.out.println("taxAmount:"+taxAmount);
	 System.out.println("discountAmount:"+discountAmount);
	 System.out.println("netprice:"+netprice);




	
			
	
	
	
}
}
