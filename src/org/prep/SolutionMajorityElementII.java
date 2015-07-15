package org.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SolutionMajorityElementII {
	
	public static void main(String[] args) {
		int [] nums = new int[]{1,2,1,1,2,3};
		System.out.println(new SolutionMajorityElementII().majorityElement1(nums));
		
	}
    public List<Integer> majorityElement(int[] nums) {
    	List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        int count =1;
        int n = nums.length;
        int majority = nums[0];
        for(int i =1;i <nums.length;i++)
        {
        	if(nums[i]==majority)
        		{
        		count++;
        		continue;
        		}
        	if(count>n/3)
        		list.add(majority);
        	count = 1;
        	majority = nums[i];
        }
        return list;
        
    }
    
    public List<Integer> majorityElement1(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        
        Integer n1=null, n2=null;
        int c1=0, c2=0;
     
        for(int i: nums){
            if(n1!=null && i==n1.intValue()){
                c1++;
            }else if(n2!=null && i==n2.intValue()){
                c2++;
            }else if(c1==0){
                c1=1;
                n1=i;
            }else if(c2==0){
                c2=1;
                n2=i;
            }else{
                c1--;
                c2--;
            }
        }
     
        c1=c2=0;
     
        for(int i: nums){
            if(i==n1.intValue()){
                c1++;
            }else if(i==n2.intValue()){
                c2++;
            }
        }
     
        if(c1>nums.length/3)
            result.add(n1);
        if(c2>nums.length/3)
            result.add(n2);
     
        return result;}
}
