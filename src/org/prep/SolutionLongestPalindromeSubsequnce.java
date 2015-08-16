package org.prep;

public class SolutionLongestPalindromeSubsequnce {
	
	public static void main(String[] args) {
		String s = "MADAM";
		findLongest(s);
	}
	
	public static void findLongest(String s)
	{
		char a[] = s.toCharArray();
		int LP[][] = new int[a.length][a.length];
		
		for(int m=0;m<a.length;m++)
		{
			LP[m][m] = 1;
		}
		for(int sublen = 2;sublen<a.length+1;sublen++){
			for(int i=0;i<=LP.length-sublen;i++){
				int j = i+sublen-1;
				if(a[i]==a[j] && sublen==2){
					LP[i][j] = 2;
				}
				else if(a[i]==a[j]){
					LP[i][j] = LP[i+1][j-1]+2;
				}
				else{
					LP[i][j] = Math.max(LP[i+1][j],LP[i][j-1]);
				}
			}
		}
		printMatrix(LP);
		System.out.println(LP[0][LP.length-1]);
		
	}
	
	public static void printMatrix(int [][] LP){
		for(int i=0;i<LP.length;i++){
			for(int j=0;j<LP.length;j++){
				System.out.print("  " + LP[i][j]);
			}	
			System.out.println("");
		}
	}
}
