package org.prep;

public class SolutionPowerof2 {
	 public boolean isPowerOfTwo(int n) {
	        if((n&(n-1))==0)
	        	return true;
	        return false;
	        
	    }
}
