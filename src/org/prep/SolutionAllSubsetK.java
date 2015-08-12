package org.prep;

public class SolutionAllSubsetK {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		boolean used[] = new boolean[a.length];
		subsetK(a, 4, 0, used, 0);
	}
	
	public static void subsetK(int a[], int k, int start, boolean used[],int currentLength)
	{
		
	
		if(currentLength==k)
		{
			for(int i =0; i <a.length; i++)
			{
				if(used[i]==true)
					System.out.print(a[i]+" ");
			}
			System.out.println();
			return;
			
		}
		if(start==a.length)
			return;
		used[start] = true;
		subsetK(a, k, start+1, used, currentLength+1);
		used[start] = false;
		subsetK(a, k, start+1, used, currentLength);
	}

}
