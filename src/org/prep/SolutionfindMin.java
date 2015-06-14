package org.prep;

import java.util.Arrays;

/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 */
public class SolutionfindMin {
	public static void main(String[] args) {
		int [] a = {5,6,7,8,1,2,3,4};
		//Arrays.sort(a, fromIndex, toIndex);
		System.out.println(findMin(a));

	}
	public static int findMin(int[] a) {
		int low = 0;
		int high = a.length-1;

		while(low<high)
		{

			int mid = (low+high)/2;
			if(a[mid]>a[high])
				low = mid+1;
			else
				high = mid;


		}
		return a[low];
	}
}
