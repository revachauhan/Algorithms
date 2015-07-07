package org.prep;

public class SolutionMergeSortedArray {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{1,0};
		
		int []nums2 = new int[]{2};
		merge(nums1, 1, nums2, 1);
		for(int i : nums1)
			System.out.print(i);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int x = m+n-1;
		n = n-1;
		m = m-1;
		if(n<0)
			return;
		if(m<0)
		{
			while(n>=0)
			{ 
				nums1[n]= nums2[n];
				n--;
			}
			return;
		}

		
		while(m>=0&&n>=0)
		{
			if(nums1[m]>nums2[n])
			{
				nums1[x] = nums1[m];
				m--;
			}
			else
			{
				nums1[x] = nums2[n];
				n--;
			}
			x--;
		}
		while(n>=0)
		{
			nums1[x] = nums2[n];
			n--;
			x--;
		}
	}

}
