package day10;

public class UseSaree {
	public static void main(String[] args) {
		Saree s1 = new Saree();

		s1.material = args[0];
		s1.color = args[1];
		s1.price = Integer.parseInt(args[2]);

		Saree s2 = new Saree();

		s2.material = args[0];
		s2.color = args[1];
		s2.price = Integer.parseInt(args[2]);

		Saree[] s = { s1, s2 };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].color);

		}

	}
}
