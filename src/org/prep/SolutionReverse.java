package org.prep;

public class SolutionReverse {
	 public int reverse(int x) {
		 int flag =1;
	        double result =0;
	        if(x<0)
	        {
	        	flag = -1;
	        	x = -x;
	        }
	        while(x>0)
	        {
	        	result = result*10+(x%10);
	        	
	        }
	        if(flag ==-1)
	        	result = -result;
	        if(result >Integer.MAX_VALUE)
				 return Integer.MAX_VALUE;
			 if(result<Integer.MIN_VALUE)
				 return Integer.MIN_VALUE;
	        return (int)result;
	    }

}
