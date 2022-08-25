package Exception_examples;

public class Example6 {

	public static void main(String [] args ) {
		
		try {
		String convert=null;
		int a=Integer.parseInt(convert);
		int b=20;
		int c=30;
		int d=0;
		d=b/c;
		System.out.println(d);
		System.out.println();
		int[] x= {a,b,c};
		if(x[0]>x[1]) {
			System.out.println(x[0]+"is greater");
		}
		else {												//using multi catch exception
			System.out.println(x[1]+" is greater");
		}
		
	}catch(NumberFormatException d) {
		System.out.println(d);
		System.out.println("Number format Exception");
	}catch(NullPointerException f) {
		System.out.println(f);
		System.out.println("is not null point");
	}
}
}
