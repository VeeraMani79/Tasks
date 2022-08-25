package day15;

public class UseVowels {
 
	public static void main(String[] args) {
		Vowels v=new Vowels();
		int a=Integer.parseInt(args[0]);
		String b=v.add(a);
		System.out.println(b);
	}
}
