package MehodloadingandMethosoverridding;

public class UseBank2 {

	public static void main(String [] args) {
		
		Bank2 b1=new Bank2();
		
		System.out.println(b1.interest(50000));
		
		Bank1 b2= new Bank1 ();
		
		System.out.println(b2.interest(40000));
		
	}

}
