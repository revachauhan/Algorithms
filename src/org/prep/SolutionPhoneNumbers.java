package org.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

//Typical DFS types
public class SolutionPhoneNumbers {
	
	public static void main(String[] args) {
		System.out.println();
	}
	
	public static List<String> findAllCombinations(String digits)
	{
		 HashMap<Integer, String> map = new HashMap<Integer, String>();
		    map.put(2, "abc");
		    map.put(3, "def");
		    map.put(4, "ghi");
		    map.put(5, "jkl");
		    map.put(6, "mno");
		    map.put(7, "pqrs");
		    map.put(8, "tuv");
		    map.put(9, "wxyz");
		    map.put(0, "");
		    
		    List<String> result = new ArrayList<String>();
		    if(digits.isEmpty()||digits==null)
		    	return result;
		    List<Character> temp = new ArrayList<Character>();
		    find(digits,result,temp,map);
		    return result;
		    
	}

	private static void find(String digits, List<String> result, List<Character> temp,
			HashMap<Integer, String> map) {
		if(digits.length()==0)
		{
			
			StringBuffer s = new StringBuffer();
			for(Iterator<Character> chitr = temp.iterator();chitr.hasNext();)
			{
				s.append(chitr.next());
			}
				
			result.add(s.toString());
			return;
		}
		
		Integer curr = Integer.valueOf(digits.substring(0,1));
		String letters = map.get(curr);
		for(int i =0;i<letters.length();i++)
		{
			temp.add(letters.charAt(i));
			find(digits.substring(1), result, temp, map);
			temp.remove(temp.size()-1);
		}
		
	}

	
		

}
