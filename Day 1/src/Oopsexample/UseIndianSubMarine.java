package Oopsexample;

public class UseIndianSubMarine {

	public static void main(String[] args) {
		
		IndianSubMarine im=new IndianSubMarine();
		
		String a="Indian";
		int speed=300;
		boolean underwater=true;
		boolean missile=false;
		System.out.println("speed="+im.findSpeed(speed));
		System.out.println("UnderWater="+im.findIsUnderwater(underwater));
		System.out.println("Nation="+im.findNationality(a));
		System.out.println("Missle="+im.missle(missile));
	}
}
