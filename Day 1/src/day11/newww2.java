package day11;

public class newww2 {
	public static void main(String[] args) {
  int [] num= {6,7,9,8};
  int count =0;
		 for(int i=1;i<num.length;i++) {
			if(i%3!=0) {
				count=count+1;
				
			}
		 }
		System.out.println("count: "+count); 
}
}