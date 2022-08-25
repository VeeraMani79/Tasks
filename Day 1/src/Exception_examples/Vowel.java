package Exception_examples;

public class Vowel {
	//public static void main(String [] args) throws FindVowel {
		
		public void findVowel(String a) throws FindVowel {
	if(a.contains("a")||a.contains("e")||a.contains("i")||a.contains("o")||a.contains("u")) {
				 System.out.println("has Vols");
	}
	else {
		throw new FindVowel("No Vowel");
	}
	
	}
}
