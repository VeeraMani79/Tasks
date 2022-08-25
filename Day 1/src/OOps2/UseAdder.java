package OOps2;

public class UseAdder {
 
	public static void main(String[] args) {
		Adder ad=new Adder ();
		System.out.println(ad.add(15, 20));
		System.out.println(ad.add(15, 15, 20));
		System.out.println(ad.add("Raja","Chozha"));
	}
}
