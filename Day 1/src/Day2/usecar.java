package Day2;

public class usecar {
public static void main(String[]args) {
	car c1= new car();
	c1.brand= "bmw";
	c1.price=400000;
	c1.taxAmount=5000;
	c1.netPrice=c1.price+c1.taxAmount;
	c1.rating= 5.5f;
	c1.batType='a';
	c1.engineCcno= 123456790087l;
	c1.airBag=true;
	
	car c2= new car();
	c2.brand= "bmw";
	c2.price=400000;
	c2.taxAmount=5000;
	c2.netPrice=c2.price+c2.taxAmount;
	c2.rating= 5.5f;
	c2.batType='a';
	c2.engineCcno= 123456790087l;
	c2.airBag=true;
	
	
	car c3= new car();
	c3.brand= "bmw";
	c3.price=400000;
	c3.taxAmount=5000;
	c3.netPrice=c3.price+c3.taxAmount;
	c3.rating= 5.5f;
	c3.batType='a';
	c3.engineCcno= 123456790087l;
	c3.airBag=true;
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.println("brand=" +c1.brand+","+"price=" +c1.price+","+"taxAmount=" +c1.taxAmount+","+"netPrice=" +c1.netPrice+","+"rating=" +c1.rating+","+"batType=" +c1.batType+","+"engineCcno=" +c1.engineCcno+","+"airbag=" +c1.airBag+",");
	

	System.out.println("brand=" +c2.brand+","+"price=" +c2.price+","+"taxAmount=" +c2.taxAmount+","+"netPrice=" +c2.netPrice+","+"rating=" +c2.rating+","+"batType=" +c2.batType+","+"engineCcno=" +c2.engineCcno+","+"airbag=" +c1.airBag+",");
	

	System.out.println("brand=" +c3.brand+","+"price=" +c3.price+","+"taxAmount=" +c3.taxAmount+","+"netPrice=" +c3.netPrice+","+"rating=" +c3.rating+","+"batType=" +c3.batType+","+"engineCcno=" +c3.engineCcno+","+"airbag=" +c3.airBag+",");
	
	
	
	
	
	
}
}
