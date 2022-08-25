package Examples;
import java.io.*;
import java.util.*;
public class Pyramid {

	

	   
	    // function to print spaces
	    static void printSpace(int space)
	    {
	        // base case
	        if (space == 0)
	        {
	            return;
	        }
	        System.out.print(" " + " ");
	  
	        // recursively calling printSpace()
	        printSpace(space - 1);
	    }
	  
	    // function to print stars
	    static void printStars(int star)
	    {
	        // base case
	        if (star == 0)
	        {
	            return;
	        }
	        System.out.print("* ");
	  
	        // recursively calling printStars()
	        printStars(star - 1);
	    }
	  
	    // function to print the pattern
	    static void pattern(int n, int num)
	    {
	        // base case
	        if (n == 0)
	        {
	            return;
	        }
	        printSpace(n - 1);
	        printStars(num - n + 1);
	        System.out.println();
	  
	        // recursively calling pattern()
	        pattern(n - 1, num);
	    }
	  
	    // Driver code
	    public static void main(String args[])
	    {
	        int n = 5;
	        pattern(n, n);
	    }
	}
	//this code is contributed by Shivesh Kumar Dwivedi

