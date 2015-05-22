package org.prep;
/*
 * Given an input string, reverse the string word by word.

For example,
"    "
Given s = "the sky is blue",
return "blue is sky the".
 */
public class SolutionreverseWords {
	public static void main(String[] args) {
		String s = "   b";
		System.out.print(reverseWords(s));
	}
	public static  String reverseWords(String s) {

		if(s.equals(null))
			return null;
		StringBuilder  reversestring = new StringBuilder();
		int j =0;
		for(int i = s.length()-1; i >=0; i--)
		{
			
			if(i>=0&&s.charAt(i)==' ')
				continue;
			else if(i==0||s.charAt(i-1)==' ')
			{	if(reversestring.length()!=0)
				reversestring.append(' ');
			reversestring.append(s.substring(i, i+j+1));
			j =0;
			continue;

			}
			

			j++;

		}

		return reversestring.toString();


	}
}
