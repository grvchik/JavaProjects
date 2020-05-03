package Feb2020;

import java.util.Deque;
import java.util.LinkedList;

public class LongestConSecBranchTree {

	public static int lonsgestBranch(TreeNode root) {
		
		Deque <TreeNode> ret = new LinkedList<TreeNode>();
		int length = 1;
		int currValue = root.val;
		ret.push(root);
		
		while(!ret.isEmpty()) {
			TreeNode node = ret.pop();
			TreeNode left = node.left;
			TreeNode right = node.right;
			if(left!=null){
				if((left.val) == (currValue+1)) {
					ret.add(left);
					++currValue;
				}
			}
			if(right!=null) {
				if((right.val) == (currValue+1)) {
					ret.add(right);
					++currValue;
				}				
			}			
		}
		
		return currValue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode zero = new TreeNode(0);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(2);
		zero.left = one;
		zero.right = three;
		one.right = two;
		int res = lonsgestBranch(zero);
		System.out.println(res);
	}

}
