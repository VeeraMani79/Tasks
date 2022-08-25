package OOps3;

public class UseAxisBank {

	public static void main(String[] args) {
		
		AxisBank axisBank=new AxisBank ();
		int amount=30000;
		int percentage=10;
		 
		System.out.println(axisBank.getRateOfInterest(percentage, amount));
	}
}
