package Regex;

public class CharacterClass {
	public static void main(String [] args ) {
	
	String word ="ram 2 raja 4 hari";
	
	String [] words=word.split("[0-9]");
	
	for(String i :words) {
		System.out.println(i);
	}
	
	}
}
