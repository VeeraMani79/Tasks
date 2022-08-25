package functioscalls;

public class College {

	String name;
	int code;
	int fees;
	char grade;

	public char findGradeOfHighfeesCollege(College [] cl) {
		int max=0;
		char maxGrade=' ';
		for(int i=0;i<cl.length;i++) {
			if(max<cl[i].fees) {
				max=cl[i].fees;
				maxGrade=cl[i].grade;
			}	
		}
		return maxGrade;					

}
	public College findMinimumfeesCollege(College[] cl) {
		
		int min =cl[0].fees;
		College c=cl[0];;
		for(int i=0;i<cl.length;i++) {
		if (min>cl[i].fees) {
			min=cl[i].fees;
			c=cl[i];
		}
	}
	return c;
}
}	

