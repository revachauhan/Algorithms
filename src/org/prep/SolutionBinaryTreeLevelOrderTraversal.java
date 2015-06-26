package org.prep;


import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
//[9,null,2,0,null,-7,null,-1]
public class SolutionBinaryTreeLevelOrderTraversal {
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(9);
		root.left = null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = null;
		root.right.left.left = new TreeNode(-7);
		root.right.left.right = null;
		root.right.left.left.left = new TreeNode(-1);
		System.out.println(levelOrder(root));
		
	}

	public static  List<List<Integer>> levelOrder(TreeNode node) {
        
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		if(node == null)
			return al;
		List<Integer> list = new ArrayList<Integer>();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		LinkedList<TreeNode> childqueue = new LinkedList<TreeNode>();
		queue.add(node);
		
		while(!queue.isEmpty())
		{
			TreeNode curr = queue.remove();
			if(curr.left!=null)
				childqueue.add(curr.left);
			if(curr.right!=null)
				childqueue.add(curr.right);
			list.add(curr.val);
			if(queue.isEmpty())
			{
				queue = childqueue;
				childqueue = new LinkedList<TreeNode>();
				al.add(list);
				list = new LinkedList<Integer>();
			}
		}
		
	
        ArrayList<ArrayList<Integer>> reversedResult = new  ArrayList<ArrayList<Integer>>();
    for(int i=al.size()-1; i>=0; i--){
        reversedResult.add((ArrayList<Integer>)al.get(i));
    }
        
    }

}
