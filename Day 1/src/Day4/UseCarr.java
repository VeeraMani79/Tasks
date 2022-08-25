package Day4;

public class UseCarr {
		public static void main(String[] args) {
			Carr c1=new Carr ();
			c1.brand=args[0];
			c1.model=args[1];
			c1.enginecc=Integer.parseInt(args[2]);
			c1.price=Integer.parseInt(args[3]);
			c1.taxPercentage=Integer.parseInt(args[4]);
			c1.netprice=Integer.parseInt(args[5]);
			int netprice1=c1.taxPercentage+c1.netprice;
			Carr c2=new Carr ();
			c2.brand=args[0];
			c2.model=args[1];
			c2.enginecc=Integer.parseInt(args[2]);
			c2.price=Integer.parseInt(args[3]);
			c2.taxPercentage=Integer.parseInt(args[4]);
			c2.netprice=Integer.parseInt(args[5]);
			int netprice2=c2.taxPercentage+c2.netprice;
			Carr c3=new Carr ();
			c3.brand=args[0];
			c3.model=args[1];
			c3.enginecc=Integer.parseInt(args[2]);
			c3.price=Integer.parseInt(args[3]);
			c3.taxPercentage=Integer.parseInt(args[4]);
			c3.netprice=Integer.parseInt(args[5]);
			
			int netprice3=c3.taxPercentage+c3.netprice;
			
			
			System.out.println("Barands:"+c1.brand+","+c2.brand+","+c3.brand);
			System.out.println("EngineCC:"+c1.enginecc+","+c2.enginecc+","+c3.enginecc);
			System.out.println("Netprices:"+netprice1+","+netprice2+","+netprice3);
			System.out.println("Models;"+c1.model+","+c2.model+","+c3.model);
	
			
			
}
}