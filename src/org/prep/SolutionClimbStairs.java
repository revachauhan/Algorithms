package org.prep;

public class SolutionClimbStairs {
	public int climbStairs(int n) {
        if(n<0)
        	return 0;
        else if(n == 0)
        	return 1;
        else 
        	return climbStairs(n-1) +climbStairs(n-2);
        
    }
}
