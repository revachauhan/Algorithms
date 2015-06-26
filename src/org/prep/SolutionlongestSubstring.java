package org.prep;

import java.util.HashMap;
import java.util.Map;

public class SolutionlongestSubstring {
	public static void main(String[] args) {
		String s = "Revaaaaaaa";
		System.out.println(longestSubstring(s));
		
		
	}
	
	public static int longestSubstring(String s)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int minIndex =0;
		int length=0;
		int maxLength = 0;
		for(int i =0; i<s.length();i++)
		{
			Character c = s.charAt(i);
			if(!map.containsKey(c))
			{
				map.put(c, i);
				length = i - minIndex +1;
				if(maxLength<length)
					maxLength = length;
				
				
			}
			else
			{
				length = i - (map.get(c)+1) +1;
				map.put(s.charAt(i), i);				
				minIndex = map.get(c)+1;
				if(length > maxLength)
					maxLength = length;
			}
			
		}
		return maxLength;
		
	}

}
