package org.prep;
/*
 * Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class SolutionremoveElements {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		//head.next = new ListNode(2);
		ListNode  result = removeElements(head, 2);
		while(result!=null)
			{
			System.out.println(result.toString());
			result = result.next;
			}
		
	}
public  static ListNode removeElements(ListNode head, int val) {
    	
    	if(head==null)
    		return null;
    	
    	ListNode current = new ListNode(0);
    	current.next = head;
    	ListNode temp = current;
    	while(current!=null)
    	{
    		
    		while(current.next!=null&&current.next.val==val)
    		{
    			current.next = current.next.next;
    		}
    		
    		current = current.next;
    		
    		
    	}
    	return temp.next;
    	
        
    }
}
