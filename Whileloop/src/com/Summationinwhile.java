package com;

public class Summationinwhile 
{
	// Java program to illustrate while loop
	    public static void main(String args[])
	    {
	        int i = 1, s = 0;
	        // loop continues until i becomes greater than 10
	        while (i <= 10) 
	        {
	            // add the current value of i to s
	            s = s + i;
	            // increment i for the next iteration
	            i++;
	        }
	        System.out.println("Summation: " + s);
	    }
}
