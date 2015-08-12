package org.prep;

public class SolutionproductExceptSelf{
	
public static void main(String[] args) {
	int nums [] = {1,2,3,4};
	System.out.println(new SolutionproductExceptSelf().productExceptSelf(nums));
}

public int[] productExceptSelf(int[] nums) {
	
	
    int[] result = new int[nums.length];
    int n = nums.length;
    for(int i =0; i<result.length;i++)
    {
    	result[i] = 1;
    	 
    }
    int left = 1;
    int right =1;
    for(int i=0; i<nums.length; i++) {
    	result[i] *= left; 
    	left *= nums[i];

    	result[n-1-i] *= right;
    	right *= nums[n-1-i];
    }
 
    return result;
}

}

