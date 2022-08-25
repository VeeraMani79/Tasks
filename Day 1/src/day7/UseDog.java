package day7;

public class UseDog {
 public static void main(String[] args) {
	 String []b=args[0].split(",");
	 Dog dog1=new Dog();
	 dog1.breed=b[0];
	 dog1.gender=b[1];
	 int c =Integer.parseInt(b[2]);
	 dog1.price=c;
	 
	 String []a=args[1].split(",");
	 Dog dog2=new Dog();
	 dog2.breed=a[0];
	 dog2.gender=a[1];
	 int d=Integer.parseInt(a[2]);
	 dog2.price=d;
	
    
	if(dog1.price>dog2.price) {
		 System.out.println(dog1.breed+","+dog1.gender);
				 
	}      
	 else {
		 System.out.println(dog2.breed+","+dog2.gender);	
	 }
 }
}

		 