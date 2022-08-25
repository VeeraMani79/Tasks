package Oopsexample;

public class Laptop extends Tab {
	String brand;
	int price;
	String proccessor;
	
	public String findTpyeOfLaptop(int core) {
		if(core>8) {
			return "GAMINGLAPTOP";
		}
		else {
			return "STUDYLAPTOP";
		}
	}
	public boolean isPortable(boolean portable) {
		return portable;
	}
	//@Override
	//public boolean isPortable(boolean portable) {
		// TODO Auto-generated method stub
		//return portable;
	//}//
	//
}
