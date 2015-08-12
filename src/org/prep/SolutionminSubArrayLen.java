package org.prep;

public class SolutionminSubArrayLen {

	public static void main(String[] args) {
		int a [] = new int[]{2,3,1,2,4,3};
		System.out.println(new SolutionminSubArrayLen().minSubArrayLen(7, a));
	}
	public int minSubArrayLen(int s, int[] nums) {
		int min_len = Integer.MAX_VALUE;
		int n = nums.length;
		int start = 0;
		int end = 0;
		int curr_sum =0;
		while(end<n)
		{
			while(curr_sum<=s&&end<n)
			{
				 
					curr_sum = curr_sum +nums[end++];
					if(curr_sum==s&&(end-start)<min_len)
						min_len = end - start;

				}
				while(curr_sum>=s&&start<n)
				{	
					if((end-start)<min_len)
						min_len = end - start;
					curr_sum = curr_sum - nums[start++];
				}
			}

			if(min_len==Integer.MAX_VALUE)
				return 0;
			else 
				return min_len;
		}
	}


