package org.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionPizza  {
	
	public static int maxSum =0;
	public static boolean flag = false;
	
	public static void main(String[] args) {
		Integer [] i = new Integer[]{1,3,2,4,11,8,5,6,7};
		Integer [] j = new Integer[]{1,3,2};
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.addAll(Arrays.asList(i));
			
		
		new SolutionPizza().findMax(a,0,0);
		System.out.println(maxSum);
	}
	

	
	public void findMax(ArrayList<Integer> list,int sum,int temp)
	{
		
		if(list.isEmpty())
			return; 
			
		for(int i =0;i<=list.size()-1;i++)
		{
			
			ArrayList<Integer> clonedList = new ArrayList<Integer>(list);
			if(flag == true)
				{
				sum = sum - temp;
				flag = false;
				}
			temp = list.get(i);
			sum = sum + temp;
			if(i == list.size()-1)
				flag = true;
			clonedList = remove(clonedList,i);
			
			
			if(sum >maxSum)
				maxSum = sum;
			if(clonedList.isEmpty())
				sum = sum - temp;
			findMax(clonedList, sum,temp);
			
			
			
			
		}
		
		
	}



	private ArrayList<Integer> remove(ArrayList<Integer> clonedList, int index) {
		if(clonedList.size()==3)
			return new ArrayList<Integer>();
		else if(index==0)
		{
			
				clonedList.remove(index);
				clonedList.remove(index);
				clonedList.remove(clonedList.size()-1);
		}
		else if(index == clonedList.size()-1)
		{
			clonedList.remove(index);
			clonedList.remove(0);
			clonedList.remove(0);
		}
		else
			
		{
			
			clonedList.remove(index);
			clonedList.remove(index);
			clonedList.remove(index-1);
			
		}
		return clonedList;
	}

}
