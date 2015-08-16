package org.prep;

import java.util.HashMap;
import java.util.Map;

public class SolutionlongestSubstring {
	public static void main(String[] args) {
		String s = "tmmzuxt";
		System.out.println(longestSubstring(s));
		
		
	}
	
	
	
	public static int longestSubstring(String s)
	{
		if(s==null)
			return 0;
		boolean flag[] = new boolean[256];
		char chars[] = s.toCharArray();
		int result =0;
		int start =0;
		for(int i =0;i<chars.length;i++)
		{
			char current = chars[i];
			if(flag[current])
			{
				result = Math.max(result, i-start);
				for(int k=start;k<i;k++)
				{
					if(chars[k]==current)
						{start = k+1;
						break;
						}
					else
					{
						flag[k]= false;
					}
				}
			}
			else
				flag[current] = true;
		}
		
		result = Math.max(result, chars.length-start);
		return result;
	}

}
