package org.prep;

public class SolutionhammingWeight {
	
	public static void main(String[] args) {
		System.out.println(hammingWeight1(11));
	}
    // you need to treat n as an unsigned value
	 public  static int hammingWeight(long n) {
	    	int count = 0;
	    	
	    	for(int i =0; i <32;i++)
	    	{
	    	long quotient = n/2;
	    	long remainder = n%2;
	    	if(remainder==1)
	    		count++;
	    	n = quotient;
	    	if(n==0||n==1)
	    	    break;
	    	}
	    	if(n==1)
	    		count++;
	    	return count;
	    		
	        
	    }
	 
	 public static int hammingWeight1(int n) {
		    int count = 0;
		    for(int i=0; i<32; i++){
		        if(getBit(n, i) == true){
		            count++;
		        }
		    }
		    return count;
		}
		 
		public static boolean getBit(int n, int i){
		    return (n & (1 << i)) != 0;
		}

}