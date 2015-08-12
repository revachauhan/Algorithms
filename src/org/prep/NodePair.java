package org.prep;


class BiNode{
	
	int val;
	BiNode node1;
	BiNode node2;
	
	public BiNode(int v) {
		this.val = v;// TODO Auto-generated constructor stub
	}
}


public class NodePair {
	
	BiNode head ;
	BiNode tail;
	
	public NodePair(BiNode head, BiNode tail) {
		this.head = head;
		this.tail = tail;
		
		
		// TODO Auto-generated constructor stub
	}
	
	public NodePair() {
		// TODO Auto-generated constructor stub
	}
	
	public NodePair convert(BiNode node)
	{
		if(node == null)
			return null;
		
		NodePair part1 = convert(node.node1);
		NodePair part2 = convert(node.node2);
		
		if(part1!=null)
			concat(part1.tail,node);
		if(part2!=null)
			concat(node,part2.head);
		
		return new NodePair(part1==null?node:part1.head,part2==null?node:part2.tail);
	}

	public void concat(BiNode x, BiNode y) {
		// TODO Auto-generated method stub
		x.node2 = y;
		y.node1 = x;
	}
	
	public static void main(String[] args) {
		BiNode root = new BiNode(2);
		root.node1 = new BiNode(1);
		root.node2 = new BiNode(3);
		
		System.out.println(new NodePair().convert(root));
	}

}
