package org.prep;

public class SolutionLowestCommonAncestorBST {
public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
	if(node == null)
		return null;
	
	if(node.val>p.val && node.val>q.val)
		return lowestCommonAncestor(node.left, p, q);
	if(node.val<p.val&&node.val<q.val)
		return lowestCommonAncestor(node.right, p, q);
	return node;
		
        
    }
}
