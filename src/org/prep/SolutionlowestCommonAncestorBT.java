package org.prep;

public class SolutionlowestCommonAncestorBT {
	
	public boolean covers(TreeNode node,TreeNode p)
	{
		if(node == null)
			return false;
		if(node == p)
			return true;
		return (covers(node.left,p)||covers(node.right,p));
	}
	
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(!covers(root,p)||!covers(root,q))
			return null;
		return lowestCommonAncestorHelper(root,p,q);
		
	 }

	public TreeNode lowestCommonAncestorHelper(TreeNode node, TreeNode p,
			TreeNode q) {
		if(node==null) return null;
		if(node == p || node == q)
			return node;
		boolean is_P_onLeft = covers(node.left,p);
		boolean is_Q_onLeft = covers(node.left,q);
		
		if(is_P_onLeft!=is_Q_onLeft)
			return node;
		TreeNode childSide = is_P_onLeft?node.left:node.right;
		return lowestCommonAncestorHelper(childSide, p, q);
		
	}

}
