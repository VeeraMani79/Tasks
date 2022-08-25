package day11;

public class new2 {
 public static void main(String[] args) {
	 int num=Integer.parseInt(args[0]);
	 int count =0;
	 for(int i=0;i<=num;i++) {
		 if(i%2!=0) {
			 count=count+i;
		 }
		 else {
			 continue;
			 
		 }
 }
System.out.println(count);
}
}