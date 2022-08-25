package Day2;

public class UseMobile {
public static void main(String[]args) {

	Mobile m1 = new Mobile ();
	
	m1.price=25500;
	m1.model="nokia";
	m1.discount=30;
	m1.netPrice=m1.price-(m1.price*m1.discount/100);
	m1.color="white";
 	m1.type='c';
 	m1.quality=true;
 	m1.serialNo=672126897157318l;
 	m1.weight=15.555f;
 	
 	
 	Mobile m2=new Mobile();
 	m2.price= 35000;
 	m2.model="china";
 	m2.discount=25;
 	m2.netPrice=m2.price-(m2.price*m2.discount/100);
 	m2.color="black";
 	m2.type='b';
 	m2.quality= false;
 	m2.serialNo=575768398919l;
 	m2.weight=30.4f;
 	
 	
 	
 	System.out.println("price =" +" "+m1.price+","+"model =" +" "+m1.model+","+"netPrice = "+" "+m1.netPrice);

	System.out.println("price =" +" "+m2.price+","+"model = "+" "+m2.model+","+"netprice = "+" "+m2.netPrice);
	
	
	
	
}
}