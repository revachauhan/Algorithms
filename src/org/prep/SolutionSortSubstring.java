package org.prep;

import java.util.Arrays;

public class SolutionSortSubstring {
	
	public static void main(String[] args) {
		String s = "AZQF013452BAB";
		System.out.println(sortString(s));
		
	}

	public static String sortString(String s)
	{
		if(s==null ||s.isEmpty())
			throw new IllegalArgumentException("Invalid String"); 
		StringBuffer result = new StringBuffer();
		int len = s.length()-1;
		int i =0;
		while(i <=len)
		{
			int pointer ;
			if(i <=len&&Character.isLetter(s.charAt(i)))
			{
			 pointer = i;
			while(pointer<=len&&Character.isLetter(s.charAt(pointer)))
				pointer++;
			String toBeSorted = s.substring(i,pointer);
			result.append(sortHelper(toBeSorted));
			i=pointer;
			}
			else if(i<=len&&Character.isDigit(s.charAt(i)))
			{	pointer = i;
				while(pointer<=len&&Character.isDigit(s.charAt(pointer)))
					pointer++;
				String toBeSorted = s.substring(i,pointer);
				result.append(sortHelper(toBeSorted));
				i= pointer;
			}
		}
		return result.toString();
	}

	private static String sortHelper(String toBeSorted) {
		if(toBeSorted==null || toBeSorted.isEmpty())
			throw new IllegalArgumentException("String is Empty");
		char [] c = toBeSorted.toCharArray();
		Arrays.sort(c);
		String result = new String(c);
		return result;
	}
}
