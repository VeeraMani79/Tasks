package Exception_examples;

public class UseVowel {
	public static void main(String[] args ) {
		Vowel v=new Vowel ();
		try {
			v.findVowel("gym");
		}catch(FindVowel d) {
			System.out.println(d);
		}
		
	}

}
