package org.prep;

public class SolutionhammingWeight {
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int count = 0;
    	
    	while(n>0)
    	{
    	int quotient = n/2;
    	int remainder = n%2;
    	if(remainder==1)
    		count++;
    	n = quotient;
    	}
    	
    	return count;
    		
        
    }
}