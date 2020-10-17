package July2020;

import java.util.Deque;
import java.util.LinkedList;

class NodeProperties
{
	public TreeNode parent;
	public TreeNode root;
	public boolean isLeft;
	
	public NodeProperties(TreeNode parent,TreeNode root,boolean isLeft) {
		this.parent = parent;;
		this.root = root;;
		this.isLeft = isLeft;
	}
}




public class InorderSucessor {
	public static TreeNode findInOrderSuccessor(TreeNode root,TreeNode node) {
		
		Deque<NodeProperties> treeStack = new LinkedList<NodeProperties>();
		
		NodeProperties rootNode = new NodeProperties(null,root,false);
		treeStack.push(rootNode);
		int targetNodeValue = -1;
		while(!treeStack.isEmpty()) {
			NodeProperties topNode = treeStack.pop();
			
		
			if(topNode.root.valueIn >node.valueIn) {
				
				NodeProperties rightNode = new NodeProperties(topNode.root, topNode.root.right, false);
				treeStack.push(rightNode);
				// go to right
			}
			else if(topNode.root.valueIn < node.valueIn){
				NodeProperties rightNode = new NodeProperties(topNode.root, topNode.root.left, true);
				treeStack.push(rightNode);			
				//go to left
				
			}
			else {
				
				System.out.println("Find parent");
			}
		}
		return null;
	}
	
	
  public static void main(String g[]) {
	  TreeNode root = new TreeNode(10);
	  TreeNode five = new TreeNode(5);
	  TreeNode thirty = new TreeNode(30);
	  TreeNode twenty2 = new TreeNode(22);
	  TreeNode thirty5 = new TreeNode(35);
	  TreeNode twenty5 = new TreeNode(25);
	  root.left = five;
	  root.right = thirty;
	  thirty.left = twenty2;
	  thirty.right = thirty5;
	  twenty2.right = twenty5;
	  
	  findInOrderSuccessor(root,twenty5);
  }
	
}
