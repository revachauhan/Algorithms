package org.prep;

public class SolutionRemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] nums) {
		
		int j =0;
		for(int i =0; i <nums.length;i++)
		{
			int duplicate = nums[i];
			nums[j] = duplicate;
			j++;
			while((i+1)<nums.length&&nums[i+1]==duplicate)
			{
				i++;
			}
		}
		return j;
	        
	    }
}
