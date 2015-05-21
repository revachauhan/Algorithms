package org.prep;

public class  SolutionReverseList{

	public ListNode reverseList(ListNode head){

		if(head == null )
			return null;
		if(head.next== null)
			return head;
		ListNode current = head ;
		ListNode previous = null;
		ListNode temp ;

		while(current!=null)
		{
			
			temp = current.next;
			current.next = previous;
			previous = current;
			current =temp;
			
			

		}
		return previous;

	}


}
