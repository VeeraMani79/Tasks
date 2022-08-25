package day11;

public class exam9 {
 public static void main(String[] args) {
	 
	 String a[]= {"java","python","c++","angular"};
	 for(int i=0;i<a.length;i++) {
		 if(a[i].contains("a")||a[i].contains("e")||a[i].contains("i")||a[i].contains("o")||a[i].contains("u")) {
		System.out.println(a[i].substring(1,a[i].length()-1)); 
	 }
	 
	 
	 }
	 }	 
 }

