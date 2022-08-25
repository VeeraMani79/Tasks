
public class ExampUPERCASELOWERCASECABLBPLECASE {

	public static void main(String [] args) {
	
		String a="hsdgfhd16@gmail.com";
		char [] b=a.toCharArray();
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		
		for (int i =0;i<b.length;i++) {
			if(b[i]>='A'&&b[i]<='Z') {
				count=count+1;	
			}
			else if(b[i]>='a'&&b[i]<='z') {
				count1=count1+1;
			}
			else if(b[i]>'0'&&b[i]<'9') {
				count2=count2+1;
			}
			else {
				count3=count3+1;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
	}
}
