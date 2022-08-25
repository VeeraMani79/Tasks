package JavaRecursion;

public class Factorial {
	public static void main(String[] args) {

		long factorial = factorialProgram(3);
		System.out.println(factorial);
	}

	// using recursive
	public static long factorialProgram(long n) {
		if (n <= 1) {
			return 1;

		} else {
			return n * factorialProgram(n - 1);
		}
	}

}
