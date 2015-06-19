package org.prep;


import java.util.HashMap;


public class SolutionSortMillion {
	
	public static void main(String[] args) {

		
	}

	public int [] sortMillion(int [] a)
	{
		int [] result = new int[a.length-1];
		HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i <=a.length-1; i++)
		{
			if(!map.containsKey(a[i]))
				map.put(a[i],1);
			else
				map.put(a[i], map.get(a[i])+1);
		}
		int offset =0;
		for(int i =1;i<=10;i++)
		{
			int value = map.get(i);
			
			while(offset<=value)
				{
				result[offset] = i;
				offset++;
				}
			
			
		}
		return result;
	}
}
