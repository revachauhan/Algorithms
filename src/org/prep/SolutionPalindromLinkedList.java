package org.prep;

import java.util.Stack;

public class SolutionPalindromLinkedList {
	
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		System.out.println(new SolutionPalindromLinkedList().isPalindrome(head));
	}
	
public boolean isPalindrome(ListNode head) {
	if(head.next==null)
		return true;
      Stack<Integer> s = new Stack<Integer>();
      
      ListNode slow = head;
      ListNode fast = head;
      
      while(fast!=null&&fast.next!=null)
      {
    	  s.push(slow.val);
    	  slow = slow.next;
    	  fast = fast.next.next;
    	  
      }
      if(fast!=null&&fast.next==null)
      {
    	  slow = slow.next;
      }
      while(s.isEmpty())
      {
    	  int valToCompare = s.pop();
    	  if(valToCompare!=slow.val)
    		  return false;
    	  slow = slow.next;
      }
      return true;
    }

}
