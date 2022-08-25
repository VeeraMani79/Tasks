package day7;

public class UseCooker {

	public static void main(String[] args) {
		String []a=args[0].split(",");
		Cooker cooker1= new Cooker();
		cooker1.name=a[0];
		cooker1.price=Integer.parseInt(a[1]);
		cooker1.isElectric=Boolean.parseBoolean(a[2]);
		String []b=args[1].split(",");
		
		
		Cooker cooker2= new Cooker();
		cooker2.name=b[0];
		cooker2.price=Integer.parseInt(b[1]);
		cooker2.isElectric=Boolean.parseBoolean(b[2]);
		if(cooker1.isElectric==cooker2.isElectric) {
			System.out.println("all are elecrtic ");
			
		}
		else {
			System.out.println("all are not elecrtic ");
		}
	
	}
}

