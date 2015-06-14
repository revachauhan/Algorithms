package org.prep;



public class SolutionReverseBits {
	public static void main(String[] args) {
		System.out.println(new SolutionReverseBits().reverseBits(2));
	}
	private int reverseBits(int n) {
		int reverseNum = 0;
		
		for(int i =0; i < 31 ; i++)
		{
			if(getBit(n,i))
				reverseNum = reverseNum+(1<<(31-i));
				
		}
		return reverseNum;
		
		// TODO Auto-generated method stub

	}

	private boolean getBit(int n, int i) {
		return (n & (1 << i))!=0;
			
		// TODO Auto-generated method stub
		
	}

}
