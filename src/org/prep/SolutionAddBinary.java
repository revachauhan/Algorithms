package org.prep;

public class SolutionAddBinary {
	public static void main(String[] args) {
		String s = "11";
		String s1 = "1";
		System.out.println(new SolutionAddBinary().addBinary(s, s1));
	}
	
	public String addBinary(String a, String b)
	{
		int num1 = convertToInt(a);
		int num2 = convertToInt(b);
		
		return convertToString(num1+num2);
	}

	public int convertToInt(String a)
	{
		int num = Integer.parseInt(a);
		int result = 0;
		int i = 0;
		while(num>0)
		{
			result = result + (int)Math.pow(2,i)*(num%10);
			num = num/10;
			i++;
		}
		return result;
	}
	
	public String convertToString(int a)
	{
		StringBuilder s = new StringBuilder();
		while(a>0)
		{
			int b = a%2;
			a = a/2;
			s.append(b);
		}
		return s.reverse().toString();
	}
}
