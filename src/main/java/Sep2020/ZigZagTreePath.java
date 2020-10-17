package Sep2020;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
  int value;
  
  TreeNode left;
  TreeNode right;
  
  public TreeNode(int val) {
	  this.value = val;
  }
  
}


class TreeLevel {
	int level;
	int value;
	TreeNode left;
	TreeNode right;
	public TreeLevel(int value,int level) {
		this.value = value;
		this.level = level;
	}
}

public class ZigZagTreePath {

	
	public static void printZigZagTree(TreeNode root) {
		
		Queue<TreeNode> curLevel = new LinkedList<TreeNode>();
		Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
		
		int levelCounter=0;
		TreeNode top = null;
		curLevel.add(root);
	//	System.out.print(root.value);
		while(!curLevel.isEmpty() || !nextLevel.isEmpty()) {
			
			if(levelCounter%2==0) {
				top = curLevel.poll();
				if(top==null) {
					return;
				}				
				System.out.print(top.value);
				if(top.right!=null) {
					nextLevel.add(top.right);
					
				}
				if(top.left!=null) {
					nextLevel.add(top.left);
					
				}
			}
			else {
				top = nextLevel.poll();
				if(top==null) {
					return;
				}
				System.out.print(top.value);
				if(top.left!=null) {
					curLevel.add(top.left);
					
				}
				
				if(top.right!=null) {
					curLevel.add(top.right);
					
				}
			}
			
			++levelCounter;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		root.left = two;
		root.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;
		printZigZagTree(root);
	}

}
