package day11;

public class new1 {
 public static void main(String[] args) {
	 String a=args[0];
	 int count=0;
	 char [] word=a.toCharArray();
	 for(int i=0;i<word.length;i++) {
		 
		 if(word[i]>='A'&&word[i]<='Z') {
			 count=count+1;
			 
		 }
		
	 }

 
 System.out.println(count);
 }
}
