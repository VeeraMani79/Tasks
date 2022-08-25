package day12;

public class UsePen {
 public static void main(String [] arg) {
	 
	 Pen p1=new Pen();
	 p1.width=1.3f;
	 p1.isBallPoint=true;
	 p1.barCode=43378767427782l;
	 p1.noOfTips=3;
	 p1.penBrand="renold";
	 

	 Pen p2=new Pen();
	 p2.width=1.3f;
	 p2.isBallPoint=false;
	 p2.barCode=43378767427l;
	 p2.noOfTips=4;
	 p2.penBrand="hero";
	 

	 Pen p3=new Pen();
	 p3.width=1.5f;
	 p3.isBallPoint=true;
	 p3.barCode=4337876742782l;
	 p3.noOfTips=5;
	 p3.penBrand="rorito";
	 
	Pen [] pens=new Pen[3];
	pens[0]=p1;
	pens[1]=p2;
	pens[2]=p3;
	 
	 int min=pens[1].noOfTips;
	 
	 for(int i=0;i<pens.length;i++) {
		 if(pens[i].noOfTips<min) {
			 min =pens[i].noOfTips;
			 
		 }
	 }
	System.out.println(min+" is having lowest tip "); 
 }
}
