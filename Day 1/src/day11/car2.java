package day11;

public class car2 {
	 public static void main(String[] args) {
			String[] values=args[0].split(",");
		    int a=Integer.parseInt(values[0]);
		    int b=Integer.parseInt(values[1]);
		    int c=Integer.parseInt(values[2]);
		    int d=Integer.parseInt(values[3]);

		       int[] add= {a,b,c,d};
		         int min=add[0];
		    for(int i=0;i<add.length;i++) {
		    	if(add[i]<min) {
		    		min=add[i];
		    	}
		    }
		    
		    
		  System.out.println(min);
		 
		 }
		}

