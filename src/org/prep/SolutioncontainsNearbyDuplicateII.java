package org.prep;

import java.util.HashMap;

public class SolutioncontainsNearbyDuplicateII {
	
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicateII(new int[]{1,0,1,1},1));
	}

	private static boolean containsNearbyDuplicateII(int[] nums, int k) {
		if(nums.length<=1)
	        return false;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<nums.length; i++)
		{
			if(!map.containsKey(nums[i]))
				map.put(nums[i], i);
			else if(i-map.get(nums[i])<=k)
				return true;
			else 
				map.put(nums[i], i);
			
			
			
		}
		// TODO Auto-generated method stub
		return false;
	}

}
