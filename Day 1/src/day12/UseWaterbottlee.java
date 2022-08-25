package day12;

public class UseWaterbottlee {
	public static void main(String[] args) {
		 
		 Waterbottlee w1=new Waterbottlee ();
		 w1.name="name1";
	     w1.price=50;
	     w1.isSteelType=true;
	     w1.color="black";
	   
	     
		 Waterbottlee w2=new Waterbottlee ();
		 w2.name="name2";
	     w2.price=70;
	     w2.isSteelType=true;
	     w2.color="blujhjk";
		   
	     
		 Waterbottlee w3=new Waterbottlee ();
		 w3.name="name1";
	     w3.price=80;
	     w3.isSteelType=false;
	     w3.color="redsjjhj";
		   
	     Waterbottlee [] waterbottles= {w1,w2,w3};
	     
	     for(int i=0;i<waterbottles.length;i++) {
	    	 if(waterbottles[i].color.equals("black")) {
	    		 System.out.println();
	     }
	     
	     }
	}
}

//	    for(int i=0;i<waterbottles.length;i++) {
//	    	if(waterbottles[i].color.length()>5) {
//	    
//	    		System.out.println(waterbottles[i].color);
//	    		
//	    	}
//	    }
//	}
//}
//	    	
	    	
	     
	     
//	          int count=0;
//	     boolean temp=false;
//     for(i?nt i=0;i<waterbottles.length;i++) {
//	    	 if(waterbottles[i].price>60) {
//	    		 System.out.println("name="+waterbottles[i].name+" "+"price"+waterbottles[i].price+" "+"isSteeltype"+waterbottles[i].isSteelType);
//	    	 }
//	    	 else {
//	    		 System.out.println("No");
//	    		 
//	    	 }	    	 }
//	}
//}
             
	     
	     
	     
	     
	     
	     
