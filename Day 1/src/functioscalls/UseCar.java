package functioscalls;

public class UseCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "honda";
		car1.price = 1200000;
		car1.color = "red";
		car1.taxPercentage = 8;

		System.out.println("NETPRICE=" + car1.findNetPrice(car1));

		Car car2 = new Car();
		car2.brand = "nissan";
		car2.price = 5000000;
		car2.color = "blue";
		car2.taxPercentage = 10;

		System.out.println("NETPRICE=" + car1.findNetPrice(car2));
		System.out.println(car2.findMaxCarBrand(car1, car2));

		Car minimumPriceCar = car1.findMinimumPriceCar(car1, car2);
		System.out.println("Mini Car brand=" + minimumPriceCar.brand);

	}
}
