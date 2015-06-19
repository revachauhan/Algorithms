package org.prep;

/*
 * [−2,1,−3,4,−1,2,1,−5,4],
 */
public class SolutionMaxSumSubarray {
	public static void main(String[] args) {
		int [] a = new int []{-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(new SolutionMaxSumSubarray().maxSumSubarray(a));
	}
	
	
	public int maxSumSubarray(int [] a)
	{
		if(a.length==0)
			throw new IllegalArgumentException("Array is Empty");
		int maxSofar = a[0];
		int max = a[0];
		
		for(int i =1; i <=a.length-1;i++)
		{
			maxSofar = Math.max(a[i], maxSofar+a[i]);
			max = Math.max(max, maxSofar);
		}
		return max;
	}

}
