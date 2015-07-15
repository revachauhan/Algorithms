package org.prep;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class DLLNode 
{
	int key;
	int val;
	DLLNode previous;
	DLLNode next;
	public DLLNode(int key, int val) {

		this.key= key;
		this.val= val;// TODO Auto-generated constructor stub
	}

}
public class LRUCache {
	int capacity;
	Map<Integer, DLLNode> map = new HashMap<Integer, DLLNode>();
	DLLNode head;
	DLLNode tail;

	
	public LRUCache(int capacity)
	{
		this.capacity = capacity;
	}
	
	public int get(int key)
	{
		if(map.containsKey(key))
		{
			DLLNode temp = map.get(key);
			remove(temp);
			setHead(temp);
			return temp.val;
		}
		else
			return -1;
	}
	public void set(int key, int value)
	{
		if(map.containsKey(key))
		{
			DLLNode old = map.get(key);
			old.val = value;
			remove(old);
			setHead(old);

		}
		else 
		{
			DLLNode created = new DLLNode(key, value);
			if(map.size()>=capacity)
			{
				map.remove(tail.key);
				remove(tail);
				setHead(created);
			}
			else
				setHead(created);
			map.put(key, created);

		}
	}
	public void setHead(DLLNode node) {
		node.next = head;
		node.previous = null;
		if(head!=null)
			head.previous= node;
				
		head = node;
		if(tail==null)
			tail = head;
		
		
	}
	public void remove(DLLNode node) {
		if(node.previous!=null)
		{
			node.previous.next= node.next;
		}
		else
			head = node.next;
		if(node.next!=null)
		{
			node.next.previous=node.previous;
			
		}
		else
			tail = node.previous;
		
	}
	




}
