package OOps3;

public interface Bank {

//	public int getRateOfInterest(int per,int amount);
	default  int getRateOfInterest(int per,int amount) {
	return per+amount;
	
	
	}
}
