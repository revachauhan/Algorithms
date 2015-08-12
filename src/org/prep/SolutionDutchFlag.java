package org.prep;
/*WriteafunctionthattakesanarrayAoflengthnandanindexiinto A, and rearranges the elements 
 * such that all elements less than A[i] appear first, followed by elements equal to A[i], 
 * followed by elements greater than A[i]. Your algorithm should have O(1) space complexity and O(n) time complexity.
*/

public class SolutionDutchFlag {

	
	public static void main(String[] args) {
		int a[] = {7,9,3,2,8,10};
		rearrange(a, 2);
		for(int i :a)
			System.out.println(i);
		
	}
	
	public static void rearrange(int a[], int index)
	{
		int pivot = a[index];
		int smaller = 0, equal = 0, larger = a.length-1;
		while(equal <= larger)
		{
			if(a[equal]<pivot)
			{
				swap(a,smaller++,equal++);
			}
			else if(a[equal]==pivot)
				equal++;
			else 
				swap(a,equal,larger--);
				
		}
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i]  = a[j];
		a[j] = temp;
	}
}
