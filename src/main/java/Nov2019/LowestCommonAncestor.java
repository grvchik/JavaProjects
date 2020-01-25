package Nov2019;

import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int val) {
		this.val = val;
	}
	
}


public class LowestCommonAncestor {

	
	public Deque<Integer> getPathToNode(TreeNode node, int target) {
		
		if(node==null) {
			return null;
		}
		
		if(node.left==null && node.right==null) {
			// case 1
			if(node.val==target) {
				Deque<Integer> pathStack = new LinkedList<Integer>();
				pathStack.add(target);
				return pathStack;
			}			
		}
		
		Deque<Integer> leftStack = getPathToNode(node.left, target);
		Deque<Integer> rightStack = getPathToNode(node.right, target);
		
		if(leftStack==null && rightStack!=null) {
			rightStack.add(node.val);
			return rightStack;
		}
		else if(rightStack==null && leftStack!=null) {
			leftStack.add(node.val);
			return leftStack;
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(6);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode twenty = new TreeNode(20);
		TreeNode fourteen = new TreeNode(14);
		
		root.left = four;
		four.right = five;
		root.right = twenty;
		twenty.left = fourteen;
		LowestCommonAncestor lca = new LowestCommonAncestor();
		Deque<Integer> path1 = lca.getPathToNode(root, 5);
		Deque<Integer> path2 = lca.getPathToNode(root, 14);
		System.out.println(path2);
		
	}

}
