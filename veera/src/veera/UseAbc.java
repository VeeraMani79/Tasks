package veera;

public class UseAbc {

	public static void main(String[] args) {

		Abc co = new Abc();
		co.i = 5;
		co.j = 6;

//		Abc co1=co;
//		co1.j=8;
//		System.out.println(co1);// 5 8
//		System.out.println(co);// 5 6 shallow copy

		Abc co1 = new Abc();
		co1.i = co.i;
		co1.j = co.j;
		co1.j = 8;
		System.out.println(co1); // 5 8
		System.out.println(co);// 5 6 deep copy
		
		
		
	}

}
