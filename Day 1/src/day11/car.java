package day11;

public class car {
  public static void main(String[] args) {
	  String[] value=args[0].split(",");
	  int a=Integer.parseInt(value[0]);
	  int b=Integer.parseInt(value[1]);
	  int c=Integer.parseInt(value[2]);
	 int [] cube= {a,b,c};
	 int countofodd=0;
	 int countofeven=0;
	 
	 for(int i=0;i<cube.length;i++) {
		 if(cube[i]%2==0) {
			 countofeven=countofeven+1;
		 }
		 else {
			 countofodd=countofodd+1;
		 }
	 }
		System.out.println("the odd no is"+countofodd); 
		System.out.println("the even no is"+countofeven);  
  
}
}