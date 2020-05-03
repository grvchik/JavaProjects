package Mar2020;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevel {

	
	public static void printLevel(TreeNode root) {
		Queue<TreeNode> container = new LinkedList<TreeNode>();
		
		container.add(root);
		while(!container.isEmpty()) {
			TreeNode top = container.poll();
			System.out.print(top.value);
			if(top.left!=null) {
				container.add(top.left);
			}
			if(top.right!=null) {
				container.add(top.right);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		root.left = two;
		root.right = three;
		//two.left = six;
		three.left = four;
		three.right = five;
		printLevel(root);
	}

}
