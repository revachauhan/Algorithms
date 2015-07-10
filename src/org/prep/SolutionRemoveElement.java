package org.prep;

public class SolutionRemoveElement {
	
	public static void main(String[] args) {
		int [] a = new int[]{2};
		System.out.println(new SolutionRemoveElement().removeElement(a, 3));
	}
	public int removeElement(int[] nums, int val) {
		if(nums.length==0)
			return 0;
		int newLen = nums.length-1;
		int left = 0;
		int right = newLen;
		
		while(left<=right)
		{
			
			if(nums[left]==val&&nums[right]!=val)
			{
				swap(nums,left,right);
				left++;
				right--;
			}
			else if(nums[right]==val)
				right--;
			else
				left++;
			
		}
		if(right==-1)
			return 0;
		return left;
	        
	    }

	public void swap(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
		
		
	}
	
	public int removeElement2(int [] nums,int element)
	{
		int i =0;
		int j =0;
		while(i <nums.length)
		{
			if(nums[j]!=element)
				j++;
			i++;
		}
		return j;
	}

}
