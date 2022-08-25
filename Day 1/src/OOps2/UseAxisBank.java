package OOps2;

public class UseAxisBank {

	 public static void main(String [] args) {
		 
		 AxisBank ab=new AxisBank ();
		 System.out.println(ab.getInterestAmount(20000));
		 
		 RBIBank rb= new RBIBank () ;
		 System.out.println(rb.getInterestAmount(20000));
	 }
}
