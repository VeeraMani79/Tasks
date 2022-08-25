
public class tax1 {
public static void main(String[]args) {
int originalAmount=500;

String name = "t shirts";
String brand= "fanideaz";
String color = "balck";
char size= 'L';

int discount = 30;
int tax=35;
int discount1= originalAmount*discount/100;
int netprice=originalAmount+tax-discount;

System.out.println("name= "+name);
System.out.println("brand="+brand);
System.out.println("size="+size);
System.out.println("color="+color);
System.out.println("tax="+tax);
System.out.println("discount1="+discount1);
System.out.println("netprice="+netprice);

	
	
	
}

}
