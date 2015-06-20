package org.prep;


 
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
 
public class SolutionHasPathSum {
    public boolean hasPathSum(TreeNode node, int target) {
	   return	hasPathHelper(node, target, 0);
		
	}
	
	public boolean hasPathHelper(TreeNode node,int target,int sum)
	{
		if(node == null)
			return false;
		else
		{	sum = sum+node.val;
			if(node.left==null&&node.right==null)
				if(sum == target)
					return true;
			return(hasPathHelper(node.left, target, sum)||hasPathHelper(node.right, target, sum));
		}
		
	}
}