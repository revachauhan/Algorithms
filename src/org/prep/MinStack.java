package org.prep;

import java.util.Stack;

public class MinStack extends Stack<NodeWithMin>{
	
	
	
    public void push(int x) {
    	int newmin ;
    	if((x>this.getMin()))
    		 newmin = this.getMin();
    	else
    		newmin = x;
    		
    	
        super.push(new NodeWithMin(x, newmin));
    }

    
    public NodeWithMin pop() {
    	 return super.pop();
    	
        
    }

    public int top() {
    	return this.peek().val;
    	
        
    }

    public int getMin() {
    	if(this.isEmpty())
    		return Integer.MAX_VALUE;
    	else 
    		return this.peek().min;
        
    }
    
    
}

class NodeWithMin{
	int val;
	int min;
	public NodeWithMin(int val, int min) {
		this.min = min;
		this.val = val;
		// TODO Auto-generated constructor stub
	}
	
}


