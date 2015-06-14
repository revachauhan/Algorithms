package org.prep;

public class SolutionInvertBT {
	
public TreeNode invertTree(TreeNode node) {
	if(node ==null)
		return null;
	TreeNode leftNode = invertTree(node.left);
	TreeNode rightNode = invertTree(node.right);
	if(node.left!=null||node.right!=null)
	{
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
	}
	return node;
        
    }

class TreeNode {
	   int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

}

