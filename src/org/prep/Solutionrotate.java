package org.prep;
/*
 * Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class Solutionrotate {
	public static void main(String[] args) {
		int a [] = new int []{1,2,3};
		rotate(a,2 );
		for(int i : a)
			System.out.print(i+"\t");
		
	}
    public static void rotate(int[] nums, int k) {
    	if(nums.length<=1)
    		return;
        int n = nums.length;
        if(k>=n)
        	{
        	k = k%n;
        	
        	}
        System.out.println(k);
        if(k==0)
        	return;	
    	for(int i = 0; i <nums.length/2;i++)
    	{
    		swap(nums,i,nums.length-i-1);
    		
    	}
    	for(int i =0; i<k/2;i++)
    	{
    		swap(nums,i,k-i-1);
    	}
        for(int i =0; i <(nums.length-k)/2;i++)
        	swap(nums,i+k,nums.length-i-1);
    }

	private static void swap(int []a,int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		
	}
}
