package org.prep;

public class SolutionRemoveDuplicates {
	 public ListNode deleteDuplicates(ListNode head) {
	        
		 
			 if(head == null)
				 return null;
		    
			 ListNode current = head;
			 
			 while(current!=null)
			 {
				 ListNode runner = current;
				 while(runner!=null&&runner.next!=null)
				 {
					 if(runner.next.val==current.val)
						 runner.next = runner.next.next;
				     else
					    runner = runner.next;
				 }
				 current = current.next;
				 
			 }
		        return head;
		    
	        
	    }

}
