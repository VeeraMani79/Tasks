package day12;

public class UseMarkerr {
	 public static void main(String[] args) {
		 
		 Marker m1=new Marker();
		 m1.size="large";
		 m1.price=45;
		 m1.isRefillable=true;
		 
		 Marker m2=new Marker();
		 m2.size="medium";
		 m2.price=50;
		 m2.isRefillable=false;
		 
		 Marker m3=new Marker();
		 m3.size="small";
		 m3.price=45;
		 m3.isRefillable=true;
		 
		 Marker [] markers= {m1,m2,m3};
		 for(Marker x : markers) {
			 if(x.size.equalsIgnoreCase("Medium")) {
				 System.out.println(x.size+","+x.price+","+x.isRefillable);
			 }
		 }
}
}
