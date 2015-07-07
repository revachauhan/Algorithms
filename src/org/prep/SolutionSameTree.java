package org.prep;

public class SolutionSameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p==null && q==null)
			return true;
		else if(p==null||q==null)
			return false;
		else
		{
			if(p.val!=q.val) 
				return false;
			if(!((isSameTree(p.left, q.left))&&(isSameTree(p.right, q.right))))
					return false;

		}
		return true;
	}
}
