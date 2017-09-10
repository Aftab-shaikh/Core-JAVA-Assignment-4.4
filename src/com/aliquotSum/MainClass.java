package com.aliquotSum;

import java.util.ArrayList;
import java.util.Scanner;
/*Example for Aliquot number between 1000
 * 
 */
public class MainClass { // class mainClass
		 
	    public static boolean perfectNum(int num1) // method to check the perfect number true or false
	    {
	        boolean isPerfect = false; // boolean for true or false
	        int sum1=1; // local variable
	         
	        if(num1<6)return false; // check if parameter less then 6
	         
	        for(int i=2; i<=num1/2; i++) // for loop 
	        {
	            if(num1%i == 0)// if statement (condition)
	            {
	                sum1 += i;
	            }
	        }
	         
	        if(sum1==num1) return true; // check if sum1 is equal to num1 the return true
	         
	        return isPerfect; // return parameter
	    }
	 
	    public static void main(String args[])// main method
	    {
	        int range = 1000; // variable to get the aliquot vale of
	        ArrayList<Integer> perfectArrayNums = new ArrayList<Integer>();  // array to set the list 
	        for(int i=0; i<=range;i++) //for loop for run till the range variable 
	        {
	            if(MainClass.perfectNum(i)) // if check
	                perfectArrayNums.add(i);
	        }
	         
	        System.out.format("Perfect numbers within %s: %s\n",range,perfectArrayNums.toString()); // to print 
	    }
	}// class close
	


	

