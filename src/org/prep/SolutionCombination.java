package org.prep;

import java.util.*;

public class SolutionCombination {
	
	public static void main(String[] args) {
		int [] c = new int[]{1};
		System.out.println(new SolutionCombination().combinationSum(c, 1));
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    if(candidates.length==0 ||candidates==null)
	    	return result;
	    ArrayList<Integer> curr = new ArrayList<Integer>();
	    Arrays.sort(candidates);
	    helper(candidates,target,0,curr,result);
	    return result;
	    
	}
	private void helper(int[] candidates, int target, int i,
			ArrayList<Integer> curr, List<List<Integer>> result) {
		
		if(target ==0)
		{
			List<Integer> temp = new ArrayList<Integer>(curr);
			result.add(temp);
			return;
		}
		for(int j =i; j<candidates.length;j++)
		{
			if(candidates[i]>target)
				return;
			curr.add(candidates[i]);
			helper(candidates, target-candidates[i], i, curr, result);
			curr.remove(curr.size()-1);
		}
		
	}
}
