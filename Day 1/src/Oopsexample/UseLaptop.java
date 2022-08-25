package Oopsexample;

public class UseLaptop {

	public static void main(String [] args) {
		
		String a="dell";
		int b=50000;
		String c="ghjj5";
		int d =9;
		boolean e=true;
		boolean f=false;
		
		Laptop lap=new Laptop ();
		System.out.println("NAME="+a+", "+"PRICE="+b+", "+"PROCESSOR="+c+", "+"TYPE="+lap.findTpyeOfLaptop(d)+", "+"TOUCH="+e+", "+"PRTABLR="+f+"");
		
	}
}
