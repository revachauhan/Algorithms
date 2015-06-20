package org.prep;

public class SolutionisBalanced {
	
	public boolean isBalanced(TreeNode node)
	{
		if(node == null)
			return true;
		if(Math.abs(getHeight(node.left)-getHeight(node.right))>1)
			return false;
		return isBalanced(node.left)&&isBalanced(node.right);
	}
	public int getHeight(TreeNode node)
	{
		if(node==null)
			return 0;
		return 1+Math.max(getHeight(node.left), getHeight(node.right));
	}

}
