package OOps3;

public class UseProgrammer {

	public static void main(String[] args) {
		
		Programmer pm=new Programmer();
		
		String name="veera";
		int id=615;
		int salaryPerHour=60;
		int workingHour=8;
		String jobRole="Manager";
		System.out.println("JOB ROLE="+pm.getWork(jobRole));
		System.out.println("Name="+name+"\n"+"Id="+id+"\n"+"PerdaySalary="+pm.calculateSalaryPerDay(salaryPerHour, workingHour));
		
	}
}
