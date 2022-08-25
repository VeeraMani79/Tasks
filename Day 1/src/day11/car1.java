package day11;

public class car1 {
 public static void main(String[] args) {
	String[] values=args[0].split(",");
    int a=Integer.parseInt(values[0]);
    int b=Integer.parseInt(values[1]);
    int c=Integer.parseInt(values[2]);
    int d=Integer.parseInt(values[3]);

       int[] cube= {a,b,c,d};
         int max=0;
    for(int i=0;i<cube.length;i++) {
    	if(cube[i]>max) {
    		max=cube[i];
    	}
    }
    
  System.out.println(max);
 
 }
}
