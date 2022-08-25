package Day4;

public class UseLaptop {
public  static void main(String[]args) {
	
	Laptop l1=new Laptop ();
	l1.brand=args[0].toUpperCase();
	l1.model=args[1].toUpperCase();
	l1.tax=Integer.parseInt(args[2]);
	l1.price=Integer.parseInt(args[3]);
    
	l1.price1=l1.price+l1.tax;
	
	System.out.println("Brand="+l1.brand+","+"Model="+l1.model+","+"Price="+l1.price1);
	 
	
	 
	
	
}
}