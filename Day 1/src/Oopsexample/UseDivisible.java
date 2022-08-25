package Oopsexample;

public class UseDivisible {

	public static void main(String[] args) {
		
		String [] a=args[0].split(" ");
		
		int b=Integer.parseInt(args[0]);
		int c=Integer.parseInt(args[1]);
		int d=Integer.parseInt(args[2]);
		int e=Integer.parseInt(args[3]);
	    int f=Integer.parseInt(args[4]);
	    
	    Divisible div=new Divisible ();
	   System.out.println(div.findTwoOrThreeDivisible(b, e)+" "+div.findTwoOrThreeDivisible(d, e, f));
	}
}