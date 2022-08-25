package Exception_examples;

public class Example1 {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		 int a=10;
		 int b=5;
		 int c=0;
		try {    //  using try exception
			 c=a/b;
			 System.out.println(c);
		 }catch (ArithmeticException e) { //using catch exception Arithmetic exception
			 System.out.println(e);
			 System.out.println("Please Don't Using devide by 0");
		 }
		System.out.println("Hi");
	
}
}

