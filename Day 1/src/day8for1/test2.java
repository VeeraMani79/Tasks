package day8for1;

public class test2 {
//	public static void main(String[] args) {
//		String a="welcome";
//		String b=" ";
//		for(int i=a.length()-1;i>=0;i--) {
//			b=b+a.charAt(i);
//		}
//		System.out.println(b);
//	}
//
//
//	}

	public static void main(String args[]) {
		String input = "aaaabbccAAdd";
		char search = 'b'; // Character to search is 'a'.
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == search)
				count=count+1;
		}
		System.out.println("The Character '" + search + "' appears " + count + " times.");
	}
}
