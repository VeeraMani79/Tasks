package OOps2;

public class Car {

	String brand;
	int price;

	public int ShowSpeed(int cc) {
		if (cc <= 100) {
			return 40;
		} else if (cc > 100 && cc <= 300) {
			return 80;
		} else if (cc > 300 && cc <= 500) {
			return 150;
		} else {
			return 300;
		}
	}

}
