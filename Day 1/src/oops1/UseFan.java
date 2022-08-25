package oops1;

public class UseFan {
   
	public static void main(String[] args) {
		
		Coil coil=new Coil("Crompton","copper");
		Fan fan=new Fan("usha",1500,coil);
		
		System.out.println(fan);
		
	}
}
