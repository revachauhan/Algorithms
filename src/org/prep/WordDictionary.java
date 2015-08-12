package org.prep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class TrieNode {
    // Initialize your data structure here.
    char c;
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isLeaf;

	public TrieNode() {

	}

	public TrieNode(char c){
		this.c =c;
	}
}
public class WordDictionary {
    private TrieNode root;

	public WordDictionary() {
		root = new TrieNode();
	}
    // Adds a word into the data structure.
    public void addWord(String word) {
        Map<Character, TrieNode> child = root.children;
        for(int i =0; i <word.length();i++)
        {
            char c = word.charAt(i);
            TrieNode temp;
            if(child.containsKey(c))
            {
                temp =child.get(c);
            }
            else
            {
                temp = new TrieNode(c);
                child.put(c,temp);
            }
            child = temp.children;
            if(i==word.length()-1)
                temp.isLeaf = true;
            
        }
        
        
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return dfsSearch(root.children,word,0);
        
    }
    
    public boolean dfsSearch(Map<Character,TrieNode> child,String word,int start)
    {
     if(start==word.length())
        if(child.size()==0)
            return true;
        else
            return false;
    
        char c = word.charAt(start);
        if(child.containsKey(c))
            {
                if(start==word.length()-1&&child.get(c).isLeaf==true)
                    return true;
                return dfsSearch(child.get(c).children,word,start+1);
            }
        else if(c == '.')
        {
            boolean result = false;
            for(Entry<Character, TrieNode> childs:child.entrySet())
                {
                    if(start==word.length()-1&&childs.getValue().isLeaf==true)
                        return true;
                    if(dfsSearch(childs.getValue().children,word,start+1))
                        result = true;
                }
                 return result;       
                }
        else
            return false;    
        }
    
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");