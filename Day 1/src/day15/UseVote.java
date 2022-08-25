package day15;

public class UseVote {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		Vote v = new Vote();
		System.out.println(v.add(a));
	}
}