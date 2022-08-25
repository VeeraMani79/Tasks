package day11;

public class exers3 {
 public static void main(String[] args) {
	 String a="Paragraph";
	 char [] b=a.toCharArray();
	for(int i=0;i<b.length ; i++) {
		if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U') {
            continue;
			
		}
			 
		System.out.println(b[i]);	 
		 }
	}	 
	 
		 
 }
