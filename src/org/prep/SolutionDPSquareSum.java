package org.prep;

public class SolutionDPSquareSum {
	public static void main(String[] args) {
		System.out.println(recursiveapporach(4));
	}
	public static int recursiveapporach(int n)
	{
		if(n<=3)
			return n;
		int rs = n;
		for(int i =1;i<=n;i++)
		{
			int temp = i*i;
			if(temp>n)
				break;
			else
				rs = Math.min(rs, 1+recursiveapporach(n-i*i));
		}
		return rs;
	}

	

}
