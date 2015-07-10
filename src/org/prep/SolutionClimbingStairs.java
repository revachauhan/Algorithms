package org.prep;

public class SolutionClimbingStairs {
	public static void main(String[] args) {
		System.out.println(new SolutionClimbingStairs().climbStairs(5));
	}
public int climbStairs(int n) {
        int map [] = new int[n+1];
        for(int j=0; j <n+1;j++)
        {
        	map[j] = -1;
        }
       return climbHelp(n, map);
        
    
        
    }

public int climbHelp(int n, int[] map) {
	if(n<0)
		return 0;
	else if(n==0)
		return 1;
	else if(map[n]>-1)
		return map[n];
	else
	{
		map[n] = climbHelp(n-1, map) +climbHelp(n-2, map);
		return map[n];
	}
	
}

}
