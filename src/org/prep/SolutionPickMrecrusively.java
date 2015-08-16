package org.prep;

public class SolutionPickMrecrusively {

	public static int [] pickrecursively(int original[],int m, int i)
	{
		if(i+1<m)
			return null;
		else if((i+1)==m)
		{
			int set[] = new int[m];
			for(int k =0;k<=m+1;k++)
			{
				set[k] = original[k];
			}
			return set;
		}
		else
		{
			int subset[] = pickrecursively(original, m, i-1);
			int k = random(0,i);
			if(k<m)
				subset[k] = original[i];
			return subset;
		}
	}	


	public static int random(int lower, int higher) { 
		return lower + (int)(Math.random() * (higher - lower + 1));
	}

}
