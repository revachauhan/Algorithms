package org.prep;

import java.util.LinkedList;


public class SolutionMinDepth {

    public int minDepth1(TreeNode node) {
		if(node ==null)
			return 0;
		return getDepth(node);
	   
	}
	public int getDepth(TreeNode node){
	    if(node == null)
	        return Integer.MAX_VALUE;
	 if(node.left==null&&node.right==null)
	        return 1;
		return 1+Math.min(minDepth(node.left),minDepth(node.right));
}

	
	public int minDepth(TreeNode node)
	{
		if(node ==null)
			return 0;
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		LinkedList<Integer> counts = new LinkedList<Integer>();
		
		nodes.add(node);
		counts.add(1);
		while(!nodes.isEmpty())
		{
			TreeNode curr = nodes.remove();
			int count = counts.remove();
			
			if(curr.left!=null)
				{
				nodes.add(curr.left);
				counts.add(count+1);
				}
			if(curr.right!=null)
			{
				nodes.add(curr.right);
				counts.add(count+1);
			}
			if(node.left==null&&node.right==null)
				return count;
		}
		return 0;
	}

}
