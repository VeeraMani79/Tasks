package Day2;

public class useSaree {
public static void main(String[]args) {
	
	saree s1=new saree();
	
	s1.material="cooton";
	s1.color= "red";
	s1.price= 500;
	s1.discountAmount=50;
	s1.netPrice=s1.price-s1.discountAmount;
	s1.rating=4.5f;
	s1.grade='a';
	s1.barcodeNo=12345678989l;
	s1.qua=true;
	
	   
	System.out.println("material="+s1.material+","+"color="+s1.color+","+"price="+s1.price+","+"discountAmount="+s1.discountAmount+","+"netprice="+s1.netPrice+","+"rating="+s1.rating+","+"grade="+s1.grade+","+"barcodeNo="+s1.barcodeNo+","+"qua="+s1.qua+",");
	
	
	
	
	
	
	
	
	
}
}
