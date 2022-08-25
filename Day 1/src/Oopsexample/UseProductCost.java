package Oopsexample;

public class UseProductCost {

	public static void main(String[] args) {
		
		String [] a=args[0].split(" ");
		
		int b=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[1]);
		ProductCost pro=new ProductCost ();
		System.out.println(pro.findPrice(b)+" "+pro.findPrice(b,c));
		//System.out.println(pro.findPrice(b,c));
		
		
	}
}
