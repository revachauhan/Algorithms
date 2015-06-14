package org.prep;

import java.util.Arrays;

/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.


 */
public class SolutionmajorityElement {
    public int majorityElement(int[] a) {
    	if(a.length==1)
    		return a[0];
    	Arrays.sort(a);
    	int count =1;
    	int majorityElement = a[0];
    	for(int i =1; i <a.length;i++)
    	{
    		if(majorityElement==a[i])
    			{count++;
    		if(count>=a.length/2)
    			return majorityElement;
    			}
    		else
    		{
    			count =1;
    			majorityElement = a[i];
    		}
    		
    		
    	}
    	
    	
      return 0;  
        
    }
}
