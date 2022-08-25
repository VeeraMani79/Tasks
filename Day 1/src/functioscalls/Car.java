package functioscalls;

public class Car {

	String brand;
	int price;
	String color;
	int taxPercentage;

	public Car findMinimumPriceCar(Car c1, Car c2) {
		if (c1.price < c2.price) {
			return c1;
		} else {
			return c2;
		}

	}

	public int findNetPrice(Car c) {
		return c.price + (c.price * c.taxPercentage / 100);
	}

	public String findMaxCarBrand(Car c, Car d) {
		if (c.price > d.price) {
			return c.brand;
		} else {
			return d.brand;
		}
	}

}
