package org.prep;

public class SolutionisPalindrome {  
	
	public static void main(String[] args) {
		int x  = 22022;
		System.out.println(new SolutionisPalindrome().isPalindrome(x));
	}public boolean isPalindrome(int x) {
    //negative numbers are not palindrome
	if (x < 0)
		return false;

	// initialize how many zeros
	int div = 1;
	while (x / div >= 10) {
		int j = x/div;
		
		div *= 10;
	}

	while (x != 0) {
		int left = x / div;
		int right = x % 10;

		if (left != right)
			return false;

		x = (x % div) / 10;
		div /= 100;
	}

	return true;
}}
