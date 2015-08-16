package org.prep;

public class add {
	
	public static void main(String[] args) {
		System.out.println(func(7,6));
	}
	
	
public static int func(int a, int b)
{
	if(b==0)
		return a;
	int sum = a^b;
	int carry = (a&b)<<1;
	return func(sum,carry);
	}

}
