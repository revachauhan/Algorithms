package org.prep;

public class SolutionPow {
	
	
	public double pow(double x, int n) {
		if (n < 0) {
			return 1 / pow(x, -n);
		} else {
			return pow(x, n);
		}
	}
	public  double pow(int p, int q)
	{
		if(q==0)
			return 1;
		int result =1;
		for(int i =1;i <=q;i++ )
			result = result*p;
		return result;
	}
	//Divide and conquer complexity reduces it to O(logn)
	public  double power(double p, int q)
	{
		if(q==0)
			return 1;
	
		double result = power(p, q/2);
		if(q%2==0)
			return result*result;
		else
			return p*result*result;
		
		
	}
}
