package org.prep;

public class SolutionPowerSet {
	
	public static void main(String[] args) {
		int a[] = {1,2,3};
		printAllCombinations(a,new int[a.length],0);
	}
	public static void printAllCombinations(int a[],int b[],int x)
	{
		if(x == a.length-1)
		{
			b[x] = 0;
			print(a,b);
			b[x] = 1;
			print(a,b);
			return;
			
		}
		b[x] = 0;
		printAllCombinations(a, b, x+1);
		b[x] = 1;
		printAllCombinations(a, b, x+1);
		
	}
	private static void print(int[] a, int b[]) {
		
		boolean isnull = true;
		System.out.print("{");
		for(int i =0; i<=b.length-1;i++)
		{
			if(b[i]==1)
				System.out.print(a[i]);
			isnull = false;
		}
		if(!isnull)
			System.out.print("}");
		if (isnull) {
			System.out.print("}");
		}
		System.out.println();
	}
	
	

}
