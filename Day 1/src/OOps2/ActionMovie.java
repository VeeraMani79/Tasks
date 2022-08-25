package OOps2;

public class ActionMovie extends Movie {

	public String getFightSequance(int fights) {
		if(fights>=2&&fights<=4) {
			return "noarmal movies";
		}
		else if(fights>=4&&fights<=6) {
			return "medium level action";
		}
		else {
			return "fufiled Action movie";
		}
	}
	
	
}
