package day11;

public class exam4 {
	public static void main(String[] args) {
		String [] a={"onesoft","gothenburg","bristol","fjord"};
		for(int i=0;i<a.length;i++) {
			if(a[i].charAt(a[i].length()/2)=='a'||a[i].charAt(a[i].length()/2)=='e'||a[i].charAt(a[i].length()/2)=='i'||a[i].charAt(a[i].length()/2)=='o'||a[i].charAt(a[i].length()/2)=='u') {

		System.out.println(a[i]);
		}
			
			
		}
	}
}
