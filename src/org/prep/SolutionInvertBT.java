package org.prep;

public class SolutionInvertBT {
	
public TreeNode invertTree(TreeNode node) {
	if(node ==null)
		return null;
	 invertTree(node.left);
	 invertTree(node.right);
	if(node.left!=null||node.right!=null)
	{
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
	}
	return node;
        
    }



}

