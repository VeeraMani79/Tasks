package day11;

public class exesr1 {
  public static void main(String[] args) {
	  String  word="MADAM";
	  String temp="";
	  for(int i=word.length()-1;i>=0;i--) {
		  temp=temp+word.charAt(i);
		  
	  }
  if(word.equals(temp)) {
	  System.out.println("Yes");
	  
  }
  else {
	  System.out.println("No");
  }

  }
}