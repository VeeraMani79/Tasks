package day11;

public class exam10 {
 public static void main(String[] args) {
	 
	 int a[] = {11,3,5,4,9,6};
	 int countofodd=0;
	 int countofeven=0;
	 for(int i=0;i<a.length;i++) {
		 
		if(a[i]%2==0) { 
		 countofeven=countofeven+1;
		 
	 }
		else {
		countofodd=countofodd+1;
		
		}
	
	 
}
	 System.out.println("the add no count is"+countofodd);	
	    System.out.println("the even no count is"+countofeven);	 
}
}