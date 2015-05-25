package org.prep;

public class SolutionmaxProfit {
	
	
    public int maxProfit(int[] prices) {
    	int profit = 0;
    	int minElement = Integer.MAX_VALUE;
    	for(int i =0; i <prices.length;i++)
    	{
    		profit = Math.max(profit, prices[i]-minElement);
    		minElement = Math.min(prices[i], minElement);
    	
    	}
    	return profit;
}
}