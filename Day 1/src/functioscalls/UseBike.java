package functioscalls;

public class UseBike {

	public static void main(String[] args) {

		Bike b1 = new Bike();

		b1.brand = "kawaski";
		b1.price = 200000;
		b1.taxPercentage = 5;
		b1.model = "KTM";

		b1.netPrice();
		b1.display();

		Bike b2 = new Bike();

		b2.brand = "hero";
		b2.price = 100000;
		b2.taxPercentage = 5;
		b2.model = "honda";

		b2.netPrice();
		b2.display();

		Bike b3 = new Bike();

		b3.brand = "royalenfield";
		b3.price = 3000000;
		b3.taxPercentage = 5;
		b3.model = "RE";

		b3.netPrice();
		b3.display();

		Bike b4 = new Bike();

		b4.brand = "SCOOTY";
		b4.price = 1500000;
		b4.taxPercentage = 5;
		b4.model = "ACTIVE";

		b4.netPrice();
		b4.display();

		Bike b5 = new Bike();

		b5.brand = "ns-200";
		b5.price = 1800000;
		b5.taxPercentage = 5;
		b5.model = "pulser";

		b5.netPrice();
		b5.display();

	}
}
