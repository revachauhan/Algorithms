package org.prep;

public class SolutionSuffleDeck {
	
	public static void main(String[] args) {
		int cards [] = {12,17,18,19};
		shiffleRecursively(cards, 4);
	}
	
	public static int[] shiffleRecursively(int cards[],int i)
	{
		if(i==0)
			return cards;
		
		shiffleRecursively(cards, i-1);
		int k = rand(0,i);
		int temp = cards[k];
		cards[k] = cards[i];
		cards[i] = temp;
		
		return cards;
		
	}

	private static int rand(int i, int i2) {
		return i+(int)Math.random()*(i2-i+1);
	}

	
}
