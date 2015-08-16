package org.prep;

public class SolutionShortestDistanceWords {
	
	public static int shortestDistance(String words[],String word1,String word2)
	{
		int min = Integer.MAX_VALUE;
		int lastposWord1 = -1;
		int lastposWord2 = -1;
		
		for(int i =0;i<words.length;i++)
		{
			String currentWord = words[i];
			if(currentWord.equals(word1))
			{
				lastposWord1 =i;
				int distance = lastposWord1-lastposWord2;
				if(distance<min&&lastposWord2>=0)
					min = distance;
			}
			else if(currentWord.equals(word2))
			{
				lastposWord2 =i;
				int distance = lastposWord2-lastposWord1;
				if(distance<min&&lastposWord1>=0)
					min = distance;
			}
		}
		return min;
	}

}
