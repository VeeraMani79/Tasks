package oops1;

public class UseMoibile {

	public static void main(String[] args) {

		Battery battery = new Battery();
		
		battery.setBrand ( "vinas");
		battery.setPrice ( 2500);

		Mobile mobile = new Mobile();
		mobile.setBrand ("Samsung");
		mobile.setPrice( 50000);
		mobile.setBattery(battery);
		
		System.out.println("BRAND="+mobile.getBrand()+"\n"+"PRICE="+mobile.getPrice());
        System.out.println("BRAND="+mobile.getBattery().getBrand()+"\n"+"PRICE="+mobile.getBattery().getPrice());
	}
}
