package OOps3;

public class Programmer extends Employee1 {
	
	String name;
	int id;
	int salaryPerHour;
	int workingHour;
	String jobRole;
	
	public int calculateSalaryPerDay(int salaryPerHour,int workingHour) {
		return salaryPerHour*workingHour;
	}

}
