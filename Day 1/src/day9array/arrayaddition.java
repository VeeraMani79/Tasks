package day9array;

public class arrayaddition {
  public static void main(String[] args) {
	  int[] nos= {10,11,12,13,15};
	  int temp=0;
	  
	  for(int i=0;i<nos.length;i++) {
	
		  temp=temp+nos[i];
	  }
	  System.out.println(temp);
  }
}
