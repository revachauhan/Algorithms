package org.prep;

public class SolutionNLengthStringFromKNumbers {

	public static void main(String[] args) {
		print(new int[2], 2, 3);
		
	}

	public static void print(int a[], int n, int k)
	{
		if(n<=0)
		{
			for(int i : a)
				System.out.print(i+" ");
			System.out.println();
		}
		else
		{
			for(int i =1;i <=k; i++)
			{
				a[n-1] = i;
				print(a, n-1, k);
			}
		}
	}
	
}

