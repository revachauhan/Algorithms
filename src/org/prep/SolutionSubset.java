package org.prep;

import java.util.ArrayList;
import java.util.List;

public class SolutionSubset 
{
	
	
	public 	List<List<Integer>> subsetofSet(List<Integer> list)
	{
		List<List<Integer>> allList = new ArrayList<List<Integer>>(); 
		if(list.isEmpty())
		{
			allList.add(new ArrayList<Integer>());
			return allList;
			
		}
		int n = list.size()-1;
		int removedELement = list.remove(n);
		List<List<Integer>> listwitRemovedElement = subsetofSet(list);
		allList.addAll(listwitRemovedElement);
		for(List<Integer> l : listwitRemovedElement)
		{
			List<Integer> clonedList = new ArrayList<Integer>(l);
			clonedList.add(removedELement);
			allList.add(clonedList);
		}
		return allList;
	}


}