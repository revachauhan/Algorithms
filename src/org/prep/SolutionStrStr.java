package org.prep;

public class SolutionStrStr {
	
	public int strStr(String haystack, String needle) {
	
		if(needle==null ||haystack==null)
			return 0;
		if(needle.length()==0)
			return 0;
		for(int i =0; i <haystack.length();i++)
		{
			if(i+needle.length()>haystack.length())
				return -1;
			int m = i;
			for(int j = 0;j<needle.length();j++)
			{
				if(haystack.charAt(m)==needle.charAt(j))
					{if(j==needle.length()-1)
						return i;
					m++;
					}
					else
						break;
			}
		}
		return -1;
	}

}
