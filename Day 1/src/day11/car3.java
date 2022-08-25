package day11;

public class car3 {
  public static void main(String[] args) {
	  
	  String[] values=args[0].split(",");
	    int a=Integer.parseInt(values[0]);
	    int b=Integer.parseInt(values[1]);
    int c=Integer.parseInt(values[2]);
	    int d=Integer.parseInt(values[3]);

	    int [] fact= {a,b,c,d};
	    		int count=0;
	    		int count1=0;
	    for(int i=0;i<fact.length;i++) {
	    	if(fact[i]>0) {
	    		count=count+fact[i];
	    		
	    		
	    		System.out.println(" positive");	
	    	}
	    
	    
	    
	    	else {
	    		count1=count1+fact[i];
	    		System.out.println("negative");
	    	}
	      
	        System.out.println(count);

	        System.out.println(count1);
	    }
  }
}
