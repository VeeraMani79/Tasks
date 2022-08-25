package day15;

public class Vote {
	public String add(int a) {
		if (a > 18) {
			return "eligble vote";
		} else if (a < 18) {
			return "Not eligble";
		} else {
			return "invaild";
		}
	}
}
 