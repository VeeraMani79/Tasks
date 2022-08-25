package MehodloadingandMethosoverridding;

public class Bank3 {

	public int loan() {
		return 30000;
	}
	public int loan(int salary) {
		return 30000+salary;
	}
	public int loan(int salary,int interest) {
		return 30000+salary+(salary*interest/100);
	}

}
