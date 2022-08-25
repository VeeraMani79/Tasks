package functioscalls;

public class UseCollege {
 
	public static void main(String[] args) {
		
		College clg1=new College ();
		
		clg1.name="IIT";
		clg1.code=7589;
		clg1.fees=90000;
		clg1.grade='1';
		
College clg2=new College ();
		
		clg2.name="NIT";
		clg2.code=3789;
		clg2.fees=80000;
		clg2.grade='2';
		
College clg3=new College ();
		
		clg3.name="MIT";
		clg3.code=7809;
		clg3.fees=95000;
		clg3.grade='3';
		
  College [] colleges= {clg1,clg2,clg3};
 College grade=clg1.findMinimumfeesCollege(colleges);
 System.out.println("min clg fee="+grade.fees);
 
		
		
		
		
	}
}
