package OOps2;

public class Bank {

	public int findLoanEligibility() {
		return 30000;
	}

	public int findLoanEligibility(int salary) {
		return (salary * 10) + 30000;
	}

	public int findLoanEligibility(int salary, int propertyAmount) {
		return (salary *10)+ (propertyAmount / 5)+30000;
	}
}
