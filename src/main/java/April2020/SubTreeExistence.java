package April2020;

import java.util.LinkedList;
import java.util.Queue;

public class SubTreeExistence {

	public static boolean areTwoTrees(TreeNode tree1,TreeNode tree2) {
		
		Queue<TreeNode> treeQueue1 = new LinkedList<TreeNode>();
		Queue<TreeNode> treeQueue2 = new LinkedList<TreeNode>();
		
		treeQueue1.add(tree1);
		treeQueue2.add(tree2);
		boolean res = false;
		while(!treeQueue1.isEmpty() && !treeQueue2.isEmpty()) {
			TreeNode top1 = treeQueue1.poll();
			TreeNode top2 = treeQueue2.peek();
			if(top1.value==top2.value) {
				top2 = treeQueue2.poll();
				res = true;
				  if(top2.left!=null) {
					treeQueue2.add(top2.left);
				  }
				   if(top2.right!=null) {
					treeQueue2.add(top2.right);
			 	  }
				}
			 else {
			   res=false;	
			}
				if(top1.left!=null) {
					treeQueue1.add(top1.left);
				}
				if(top1.right!=null) {
					treeQueue1.add(top1.right);
				}
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = new TreeNode(1);
		TreeNode two1 = new TreeNode(2);
		TreeNode three1 = new TreeNode(3);
		TreeNode four1 = new TreeNode(4);
		TreeNode five1 = new TreeNode(5);
		root1.left = two1;
		root1.right = three1;
		three1.left = four1;
		three1.right = five1;
		TreeNode root2 = new TreeNode(3);
		TreeNode four2 = new TreeNode(4);
		TreeNode five2 = new TreeNode(5);
		root2.left=four2;
		root2.right=five2;

		areTwoTrees(root1, root2);
		
	}

}
