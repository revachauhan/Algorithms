package org.prep;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
	char c;
	Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isLeaf;

	public TrieNode() {

	}

	public TrieNode(char c){
		this.c =c;
	}
}

 public class Trie {
	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	// Inserts a word into the trie.
	public void insert(String word) {
		Map<Character, TrieNode> children = root.children;
		for(int i =0; i<word.length();i++)
		{
			char c = word.charAt(i);
			TrieNode temp;
			if(children.containsKey(c))
				temp = children.get(c);
			else
			{
				temp = new TrieNode(c);
				children.put(c, temp);
				
			}
			children = temp.children;
			if(i==word.length()-1)
				temp.isLeaf = true;
		}

	}

	// Returns if the word is in the trie.
	public boolean search(String word) {
		TrieNode t = searchNode(word);
		if(t!=null && t.isLeaf)
			return true;
		else
			return false;

	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		if(searchNode(prefix)!=null)
			return true;
		else
			return false;

	}
	public TrieNode searchNode(String word)
	{
		Map<Character,TrieNode> children = root.children; 
		TrieNode t = null;
		for(int i = 0; i <word.length();i++)
		{
			char c = word.charAt(i);
			if(children.containsKey(c))
			{
				t = children.get(c);
				children = t.children;
			}
			else
				return null;
		}
			return t;
	}
	
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
