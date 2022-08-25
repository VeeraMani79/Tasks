package functioscalls;

public class Student {

	public void displayMarks(int tamilmarks, int englishmarks, int mathsmarks) {

		System.out.println("Tamil marks is=" + tamilmarks);
		System.out.println("English marks is=" + englishmarks);
		System.out.println("Math marks is=" + englishmarks);
	}

	public void findTotal(int tamilmarks, int englishmarks, int mathsmarks) {
		System.out.println(tamilmarks + englishmarks + mathsmarks);
	}
	
	public void findMaxmarks (int tamilmarks,int englishmarks) {
		if(tamilmarks>englishmarks) {
	System.out.println(tamilmarks+" tamil marks is heighest");
		}
		else {
			System.out.println(englishmarks+" english marks is highest");
		}
	}
}
