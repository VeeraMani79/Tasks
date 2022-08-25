package day11;

public class exam5 {
 public static void main(String[] args) {
	 int a[]= {10,20,30,-50,100,2};
	 int max=a[0];
	 for(int i=0;i<a.length;i++) {
		 if(a[i]>max) {
			 max=a[i];
		
		 }
		 
	 }
	 
	 System.out.println(max); 
 }
}
