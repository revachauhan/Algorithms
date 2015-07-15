package org.prep;

public class SolutionCountNodesCompleteTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left  = new TreeNode(2);
		System.out.println(new SolutionCountNodesCompleteTree().countNodes(root));
	}
	
	public int countNodes(TreeNode root) {
	    if(root==null)
	        return 0;
	    int leftHeight = getLeftHeight(root.left)+1;
	    int rightHeight = getRightHeight(root.right)+1;
	    if(leftHeight==rightHeight)
	    	{ int result = 2<<(leftHeight-1);
	    	return (result-1);
	    	}
	    else 
	    	return countNodes(root.left)+countNodes(root.right)+1;
	    
}
	
	public int getLeftHeight(TreeNode node)
	{
		if(node == null)
			return 0;
		if(node.left!=null)
			return getLeftHeight(node.left)+1;
		return 0;
	}
	
	public int getRightHeight(TreeNode node)
	{
		if(node == null)
			return 0;
		if(node.right!=null)
			return getRightHeight(node.right)+1;
		return 0;
	}
}
