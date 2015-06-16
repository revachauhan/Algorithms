package org.prep;

import java.util.HashMap;

public class SolutionTitle2Numbers {
	
	public static void main(String[] args) {
		String s = "AB";
		System.out.println(new SolutionTitle2Numbers().titleToNumber(s));
	}
	
public int titleToNumber(String s) {
	int n = s.length()-1;
	int c =0;
	int result =0;
	for(int i = n; i>=0; i--)
	{
		 c = 26*(n-i)*(s.charAt(i)-65)+(s.charAt(i)-65);
		 result = result +c;
		
	}
     return result+1;   
    }

}
