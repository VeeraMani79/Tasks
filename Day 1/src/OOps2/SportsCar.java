package OOps2;

public class SportsCar extends Car {

	public int ShowSpeed(int cc ) {
		if(cc>100&&cc<300) {
			return 80;
		}
		else if(cc>=300&&cc<500) {
			return 180;
		}
		else {
			return 500;
		}
	}
	
}
