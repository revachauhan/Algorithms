package org.prep;

public class SolutionLengthLastWord {
	 public int lengthOfLastWord(String s) {
		 if(s==null)
			 return 0;
	        int len = s.length()-1;
	      
	        while(len>=0&&s.charAt(len)!=' ')
	        	len--;
	        
	        return s.substring(len+1,s.length()).length();
	        
	    }

}
