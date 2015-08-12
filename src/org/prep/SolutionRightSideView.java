package org.prep;

import java.util.*;

public class SolutionRightSideView {

	
	    public List<Integer> rightSideView(TreeNode node) {
	        if(node == null)
	            return new ArrayList<Integer>();
	        Queue<TreeNode> q = new LinkedList<TreeNode>();
	        Queue<TreeNode> cq = new LinkedList<TreeNode>();
	        List<Integer> list = new ArrayList<Integer>();
	        q.add(node);
	        while(!q.isEmpty())
	        {
	            
	           TreeNode temp =  q.remove();
	           
	            if(q.isEmpty())
	                list.add(temp.val);
	            if(temp.left!=null)
	                cq.add(temp.left);
	            if(temp.right!=null)
	                cq.add(temp.right);
	            
	            if(q.isEmpty())
	            {
	                q = cq;
	                cq = new LinkedList<TreeNode>();
	            }
	        }
	        return list;
	    
	}
	    
}

