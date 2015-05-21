/*Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length*/
package org.prep;

import java.util.HashMap;
import java.util.Map;

public class SolutionIsomorphic {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("ab", "aa"));
		System.out.println(isIsomorphic("aa", "ab"));
		System.out.println(isIsomorphic("ab", "ca"));
	}
	public static boolean isIsomorphic(String s, String t)
	{
		Map<Character,Character> charactermap = new HashMap<Character, Character>();

		if(s.length()!=t.length())
			return false;

		for(int i =0; i <s.length();i++)
		{
			char c1= s.charAt(i);
			char c2 = t.charAt(i);
			if(!charactermap.containsKey(c1)&&!charactermap.containsValue(c2))
			{
				charactermap.put(c1, c2);

			}
			if(charactermap.get(c1)==null)
				return false;
			if(charactermap.get(c1)!=c2)
				return false;
		}
		return true;
	}



}
