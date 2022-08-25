package day15;

public class UseTv {

	public static void main(String[] args) {
		
		String [] d=args[0].split(","); 
		Remote remote1 =new Remote ();
		remote1.setName1(d[0]);
		remote1.setColor1(d[1]);
		int a=Integer.parseInt(d[2]);
		remote1.setPrice1(a);
		
		String [] e=args[1].split(","); 
		Tv tv1=new Tv ();
		tv1.setName(e[0]);
		tv1.setColor(e[1]);
		int b=Integer.parseInt(e[2]);
		tv1.setPrice(b);
		tv1.setRemote(remote1);
	System.out.println("name="+tv1.getName()+" color="+tv1.getColor()+" price="+tv1.getPrice());
	System.out.println("name="+tv1.getRemote().getPrice1());	
		
	}
	
}
