package day9array;

public class exmaverage {
 public static void main(String[] args) {
	 int[] nums= {10,20,30,40};
	 
	 System.out.println(nums[0]);
	 System.out.println(nums[1]);
	 System.out.println(nums[2]);
	 System.out.println(nums[nums.length-1]);
	 System.out.println(nums.length);	 
	 
	 int average=(nums[0]+nums[1]+nums[2]+nums[3])/nums.length;
	 System.out.println(average);;
	 
 }
}
