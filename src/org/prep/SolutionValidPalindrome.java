package org.prep;

public class SolutionValidPalindrome {
	
	public static void main(String[] args) {
		System.out.println(new SolutionValidPalindrome().isPalindrome("."));
		System.out.println(Character.isLetterOrDigit('.'));
	}
    public boolean isPalindrome(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		String lowerString = s.toLowerCase().trim();
		if(lowerString.isEmpty())
			return true;
    	else if(lowerString.length()==1)
		{
			return true;
					
		}
		else
		{
			int len = lowerString.length()-1;
			int i =0;
			int j = len;
			while(i<=len && j >=0)
			{
				while(i <=len&&!Character.isLetterOrDigit(lowerString.charAt(i))) i++;
				while(j>=0&&!Character.isLetterOrDigit(lowerString.charAt(j))) j--;
				if(i<=len&&j>=0&&(lowerString.charAt(i)==lowerString.charAt(j)))
				{
					i++;
					j--;
					
				}
				else 
					return false;
			}
		}
		return true;
	}
}
