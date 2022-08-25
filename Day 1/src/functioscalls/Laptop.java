package functioscalls;

public class Laptop {

	String brand;
	String color;
	int price;
	boolean isTouchScreen;

	public int findMaxPrice(Laptop[] la) {
		int max = 0;
		for (int i = 0; i < la.length; i++) {

			if (la[i].price > max) {
				max = la[i].price;
			}
		}
		return max;
	}

	public int findMinPrice(Laptop[] la) {

		int min = la[0].price;
		for (int i = 0; i < la.length; i++) {
			if (la[i].price < min) {
				min = la[i].price;

			}
		}
		return min;
	}

}
