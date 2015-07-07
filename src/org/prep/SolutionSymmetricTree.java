package org.prep;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionSymmetricTree {
	
public boolean isSymmetric(TreeNode node) {
	
	if(node==null)
		return true;
	return isMirrorHelper(node.left,node.right);

}

private boolean isMirrorHelper(TreeNode node1, TreeNode node2) {
	
	if(node1==null && node2==null)
		return true;
	else if(node1==null||node2==null)
			return false;
	if(node1.val!=node2.val)
		return false;
	
	if(!(isMirrorHelper(node1.left, node2.right)&&(isMirrorHelper(node1.right, node2.left))))
		return false;
	
	return true;
}

public boolean isSymmetricIterative(TreeNode node){
{
	if(node == null)
		return true;
	else
	{
	
	Queue<TreeNode> left = new LinkedList<TreeNode>();
	Queue<TreeNode> right = new LinkedList<TreeNode>();
	left.add(node.left);
	right.add(node.right);
	while(!left.isEmpty()&&!right.isEmpty())
	{
		TreeNode l = left.remove();
		TreeNode r = right.remove();
		if(l==null && r ==null)
			continue;
		else if(l==null || r == null)
			return false;
		if(l.val!=r.val)
			return false;
		else 
		{
			left.add(l.left);
			left.add(l.right);
			right.add(r.right);
			right.add(r.left);
		}
			
	}
	
}
	return true;
}
}}
