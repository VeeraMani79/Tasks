package day11;

public class exer4 {
 public static void main(String[] args) {
	 String a="TN070Z3";
	 char [] word=a.toCharArray();
	 int temp=0;
	 for(int i=0;i<word.length;i++) {
		 if(word[i]>='0'&&word[i]<='9') {
			 temp=temp+1;
			 
		 }
	 }
	 System.out.println(temp);
 }
 
}
