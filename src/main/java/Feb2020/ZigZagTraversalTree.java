package Feb2020;

import java.util.Stack;

class NodeLevel {
	
	TreeNode node;
	int level;
	
	NodeLevel(TreeNode root,int levelIn) {
		this.node=root;
		this.level = levelIn;
	}
	
}

public class ZigZagTraversalTree {

	public static void zigZagTraversal(TreeNode root) {
		
		
		Stack<TreeNode> currLevelStack = new Stack<TreeNode>();
		Stack<TreeNode> nextLevelStack = new Stack<TreeNode>();
		int counter=0;
		currLevelStack.push(root);
		while(!currLevelStack.isEmpty() || !nextLevelStack.isEmpty()) {
			// right to left in  next level stack
			if(counter%2==0) {
				  while(!currLevelStack.isEmpty()) {
						TreeNode top = currLevelStack.pop();
						System.out.println(top.val);
						if(top.right!=null) {
							nextLevelStack.push(top.right);	
						}
						if(top.left!=null) {
							nextLevelStack.push(top.left);	
						}											  
				  }
				
			}
			// left to right in currlevel stack
			else {
				while(!nextLevelStack.isEmpty()) {
					TreeNode top = nextLevelStack.pop();
					System.out.println(top.val);
					if(top.left!=null) {
						currLevelStack.push(top.left);	
					}
					if(top.right!=null) {
						currLevelStack.push(top.right);	
					}
					
					
				}								
			}
			++counter;
		}
	}
	
	
	public static void printArray(int[] nums) {
		for(int num:nums) {
			System.out.print(num);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode seven = new TreeNode(7);
		TreeNode five = new TreeNode(5);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		
		root.left = three;
		root.right = seven;
		three.left = five;
		three.right = eight;
		seven.right = nine;
		zigZagTraversal(root);
	}

}
