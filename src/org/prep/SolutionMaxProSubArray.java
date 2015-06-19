package org.prep;

public class SolutionMaxProSubArray {
	
	public static void main(String[] args) {
		System.out.println(new SolutionMaxProSubArray().maxProSubarray(new int []{-4,-3}));
	}
	
	public int maxProSubarray(int [] a)
	{
		if(a.length==0 || a==null)
			throw new IllegalArgumentException("Array is empty");
		int maxSoFar = a[0];
		int minSoFar = a[0];
		int max = a[0];
		for(int i =1; i <=a.length-1;i++)
		{
			int temp = maxSoFar;
			
				maxSoFar = Math.max(Math.max(a[i], maxSoFar*a[i]),minSoFar*a[i]);
				minSoFar = Math.min(Math.min(a[i], temp*a[i]), minSoFar*a[i]);
				max = Math.max(maxSoFar, max);
		}
		return max;
	}

}
