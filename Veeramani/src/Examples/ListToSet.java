package Examples;

import java.util.ArrayList;
import java.util.HashSet;

public class ListToSet {
	public static void main(String [] args) {
		
		ArrayList<Integer>value=new ArrayList <> ();
		value.add(530);
		value.add(700);
		value.add(530);
		value.add(12);
		System.out.println(value);
		HashSet<Integer>values=new HashSet <> (value);
		
		System.out.println(values);
		
	}

	
}
