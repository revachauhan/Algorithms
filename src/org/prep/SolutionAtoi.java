package org.prep;

public class SolutionAtoi {
	 public int myAtoi(String str) {
		 if(str.length()==0||str==null)
			 return 0;
		 str = str.trim();
		 int i =0;
		 double result =0;
		 int flag = 1;
		 if(str.charAt(0)=='+')
			 {flag = 1;
			 i++;
			 }
			 
		 else if(str.charAt(0)=='-')
		 {
			 i++;
			 flag = -1;
		 }
		 while(i<str.length()&&str.charAt(i)>'0'&&str.charAt(i)<'9')
		 {
			 result = result + (str.charAt(i)-'0')*10;
			 
		 }
		 if(result >Integer.MAX_VALUE)
			 return 0;
		 if(result<Integer.MIN_VALUE)
			 return 0;
		 
		 return (int)result*flag;
			 
			 
	 }
}
