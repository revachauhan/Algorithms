package org.prep;

public class SolutionPowerof2 {
	
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(4));
	}
	 public static boolean isPowerOfTwo(int n) {
		 if(n==Integer.MAX_VALUE||n==Integer.MIN_VALUE||n==0)
			 return false;
	        if((n&(n-1))==0)
	        	return true;
	        return false;
	        
	    }
}
