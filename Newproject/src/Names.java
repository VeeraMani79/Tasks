
public class Names {

	public String findLengthName(String [] name) {
	
		int max=0;
		String a=" ";
		for(String s : name) {
		
		if(s.length()>max) {
			max=s.length();
			a=s;
		}
	}
	
return a.toUpperCase();
}
}
