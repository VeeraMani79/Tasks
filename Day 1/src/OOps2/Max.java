package OOps2;

public class Max {

	public String findMax(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1 + "this is the maxmum Value";

		} else if (num2 > num1 && num2 > num3) {
			return num2 + "this is the maximum value";
		} else {
			return num3 + "this is the maximum value";

		}
	}

	public String findMax(int num1, int num2) {
		if(num1>num2) {
		return num1+"this is the maaimum  value";
	}
		else {
			return num2+"this is the maximum value";
		}
	}
	public String findMax(String name1,String name2) {
		if(name1.length()>name2.length()) {
			return name1+"is the largest value";
		}
		else {
			return name2+"is the largest value";
		}
	}
}
