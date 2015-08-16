package org.prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListVocabularyDriver {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("HomeWork");
		list.add("Mountain");
		list.add("Work");
		list.add("HomeWorker");
		list.add("House");
		
		ListVocabulary vlist = new ListVocabulary(list);
		for(String s:vlist.words){
			int pos = Collections.binarySearch(vlist.words, s);
			System.out.println(pos);
			System.out.println(s.toString());
		}
			
		
		//vlist.add("Reva");
		//vlist.add("HomeW");
		//vlist.add("Aish");
		//vlist.add("Mount");
		System.out.println(vlist.isPrefix("Home"));
		System.out.println("is Prefix");
		for(String s:vlist.words)
			{int pos = Collections.binarySearch(vlist.words, s);
			System.out.println(pos);
			System.out.println(s.toString());
			}
		
	}

}
