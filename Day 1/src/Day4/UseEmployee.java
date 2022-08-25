package Day4;

public class UseEmployee {
public static void main(String[] args) {
	String [] a=args[0].split(",");
	Employee e1=new Employee();
			
	int b=Integer.parseInt(a[0]);
	 e1.id=b;
	 e1.name=a[1].toUpperCase();
	 e1.designation=a[2].toUpperCase(); 
	 float c=Float.parseFloat(a[3]);
	 e1.salary= c;
	 long d=Long.parseLong(a[4]); 
	 e1.phone=d;
	 
	System.out.println("ID="+e1.id+","+" NAME="+e1.name.toUpperCase()+","+" DESIGNATION="+e1.designation.toUpperCase()+","+" SALARY="+e1.salary+","+" PHONE=+91"+e1.phone);
   System.out.println("ID="+b+","+" NAME="+e1.name+","+" DESIGNATION="+e1.designation+","+" SALARY="+c+","+" PHONE=+91"+d);
	
}
			
}



