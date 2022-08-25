package Examples;

public class UseCycle {

	public static void main(String [] args) {
		
		Cycle c1=new Cycle ();
		c1.brand="SHENGMILO";
		c1.price=4000;
		c1.color="Black";
		c1.tax=500;
		c1.netPrice=c1.price+c1.tax;
		

		Cycle c2=new Cycle ();
		c2.brand="NINEYONE";
		c2.price=2000;
		c2.color="White";
		c2.tax=200;
		c2.netPrice=c2.price+c2.tax;
		

		Cycle c3=new Cycle ();
		c3.brand="HardelyDevidson";
		c3.price=15000;
		c3.color="Red";
		c3.tax=2000;
		c3.netPrice=c3.price+c3.tax;
//		
//		Cycle [] cycles={c1,c2,c3};   bulk initialization
//		for(int i=0;i<cycles.length;i++) {
//			if(cycles[i].price<5000) {
//				System.out.println("BRAND="+cycles[i].brand+","+"COLOR="+cycles[i].color+","+"NETPRICE="+cycles[i].netPrice);
//			}
//		}
		
//		for(Cycle x :  cycles) {
//			System.out.println("BRAND="+x.brand+","+"COLOR="+x.color+","+"NETPRICE="+x.netPrice);
//		}		
//		
		Cycle [] cycles=new Cycle [3]; // individual
	  cycles[0]=c1;
	  cycles[1]=c2;
	  cycles[2]=c3;
//	  
//  for(int i=0;i<cycles.length;i++) {
//	  System.out.println(cycles[i].color+cycles[i].brand+cycles[i].price);
//  }
//	  for(Cycle x : cycles ) {
//		  System.out.println(x.color);
//	  }
//	
	  
	  
	}	
}

