package Collections1;

import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		
	

	ArrayList<Integer>num=new ArrayList<>();
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	/*
	//System.out.println(num);
	//for(int i=0;i<num.size();i++) {
	//	System.out.println(num.get(i));
	//}
	//for(Integer s: num) {
	//	System.out.println(s);
	//}*/
	num.forEach(x-> {if(x%2==0) {
		
		System.out.println(x);
	}
	});

}
}

