package Nested;

public class UsePoco {

	public static void main(String [] args) {

		
		
		Samsung s=new Samsung ();
		s.brand="SamGalaxy 123";
		s.price=65000;
		s.cameraPixel=60;
		 
		Iphone i=new Iphone ();
		i.brand="AY 5";
		i.price=75000;
		i.isFeather=true;
		Poco p=new Poco ();
		p.brand="Poco 123";
		p.price=65000;
		p.isGamingMobile=false;

		System.out.println(s.brand+","+p.brand+","+i.brand);
		}
		}

