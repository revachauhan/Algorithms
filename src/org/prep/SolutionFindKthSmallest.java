package org.prep;

public class SolutionFindKthSmallest {
	public int kthSmallest(TreeNode root, int k) {
		int count = countNodes(root.left);
		if(k<=count)
			return kthSmallest(root.left, k);
		if(k>count+1)
			return kthSmallest(root.right, k);
		return root.val;
		
	}

    public int countNodes(TreeNode n) {
    	if(n==null)
    		return 0;
    	return 1 +countNodes(n.left)+countNodes(n.right);
    	
    }
}
