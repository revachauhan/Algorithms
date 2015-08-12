package org.prep;

public class SolutionPrintAllSubsets {
	
	public static void main(String[] args) {
		printSubset(4, "");
	}
	
	public static void printSubset(int n , String x)
	{
		if(n==0)
			{
			System.out.println(x);
			return;
			}
		else
		{
			for(int i=1; i<=n;i++)
			{
				x = x+i;
				printSubset(n-i, x);
				x = x.substring(0,x.length()-1);
			}
		}
	}

}
