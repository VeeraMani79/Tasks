package Oopsexample;

public class Divisible {

	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
	
	public String findTwoOrThreeDivisible(int number1,int number2) {
		int num=number1+number2;
		if(num%2==0&&num%3==0) {
			return "TwoThreeDivisible";
		}
		else {
			return "Not Divisible";
			
		}
	}
	public String findTwoOrThreeDivisible(int number3,int number4,int number5) {
		int num=number3+number4+number5;
		if(num%2==0&&num%3==0) {
			return "TWo Three Divisible";
			
		}
		else {
			return "Not divissbel";
			
		}
	}
}
