package com.revature.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
try {
		  int sum = 0;
	        for (int value : arr) {
	            sum += value;
	        }
	        return sum;
	    }catch (NullPointerException npe) {
	    	System.out.println(npe); 
	    }
	return 0;
	}}