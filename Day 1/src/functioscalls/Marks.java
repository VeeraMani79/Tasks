package functioscalls;

public class Marks {

	public int findTotalMarks(int tamil,int english,int maths) {

		return tamil+english+maths;
	}
	
	public String  findAverageMark(int tamil,int english,int maths) {
		int ave=(tamil+english+maths)/3;
		return "The Average marks is "+ave;
	}
		
	
}
