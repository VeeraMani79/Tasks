package JavaRecursion;

public class Polindrome {
	public static void main(String [] args) {
		
		boolean flag=palindromeCheck("amma");
		System.out.println(flag);
		flag=palindromeCheck("amma");
		System.out.println(flag);
		flag=palindromeCheck("Mani");
		System.out.println(flag);
		
		
	}
// using recursive in java
	public static boolean palindromeCheck(String s ) {
		if(s.length()==0||s.length()==1) {
			return true;
			
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return  palindromeCheck(s.substring(1,s.length()-1));
			
		}
		return false;
	}
}
