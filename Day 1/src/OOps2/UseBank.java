package OOps2;

public class UseBank {

	public static void main(String[] args) {
		Bank ba = new Bank();
		System.out.println(ba.findLoanEligibility());
		System.out.println(ba.findLoanEligibility(25000));
		System.out.println(ba.findLoanEligibility(25000, 1000000));
	}
}