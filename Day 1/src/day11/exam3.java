package day11;

public class exam3 {
	public static void main(String[] args) {
		 String [] word= {"onesoft","gothenburg","bristol","fjord"};
		 for(int i=0;i<word.length;i++) {
			 if(word[i].startsWith("a")||word[i].startsWith("e")||word[i].startsWith("i")||word[i].startsWith("o")||word[i].startsWith("u")) {
				
				 System.out.println(word[i]);
			 }
		 }
}
}