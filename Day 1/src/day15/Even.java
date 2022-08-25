package day15;

public class Even {
 
	public int add (String a) {
		 int count=0;
		for(int i=0;i<a.length();i++) { 
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				count=count+1;
				
			}
			}
		return count;
		
	}
}
