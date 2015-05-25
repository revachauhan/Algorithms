package org.prep;

import java.util.Hashtable;
import java.util.Map;

/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * 
 */
public class SolutioncontainsDuplicate {

	public static void main(String[] args) {



	}
	public boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer> map = new Hashtable<Integer, Integer>();
		for(int i = 0; i <nums.length;i++)
		{
			if(!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else
				return true;
		}
			return false;
	}
}