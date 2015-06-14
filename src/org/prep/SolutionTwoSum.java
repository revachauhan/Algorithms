package org.prep;
/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
 */
import java.util.HashMap;

public class SolutionTwoSum {
	
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i <numbers.length;i++)
		{
		if(map.containsKey(target-numbers[i]))
		{
			return(new int [] {map.get(target-numbers[i]),i});
		}
		else
			map.put(numbers[i],i);
		}
		throw new IllegalArgumentException("No numbers matched");
		
	}
	

}
