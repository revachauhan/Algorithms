package org.prep;

public class BinarySearch {
	
	public static void main(String[] args) {
		int s [] = new int[]{1,2,3,4,5,6,7,8};
		System.out.println(search(s,6));
	}

	 
	public  static int search(int a[],int target)
	{
		int l = 0;
		int r = a.length-1;
		
		while(l<=r)
		{
			int m = (l+r)/2;
			if(a[m]==target)
				return m;
			if(a[m]<target)
				l = m+1;
			else
				r = m-1;
			
			
		}
		return -1;
		
		
	}
}
