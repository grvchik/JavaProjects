package April2020;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TwoNodesSum {

	public static List<Integer> findTwSumInTree(TreeNode root,int sum) {
		
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		List<Integer> res = new ArrayList<Integer>();
		stack.push(root);
		Set<Integer> unusedNumbers = new HashSet<>();
		while(!stack.isEmpty()) {
			TreeNode top = stack.pop();
			TreeNode left = top.left;
			TreeNode right = top.right;
			int target = sum-top.value;
			if(left!=null ) {
				if(left.value==target) {
					res.add(top.value);
					res.add(left.value);
				}
				else {
					if(unusedNumbers.contains(sum-left.value)) {
						res.add(sum-left.value);
						res.add(left.value);			
					}
				}
			}
			if(right!=null ) {
				if(	right.value==target) {
				res.add(top.value);
				res.add(right.value);
				}
				else {
					if(unusedNumbers.contains(sum-right.value)) {
						res.add(sum-right.value);
						res.add(right.value);			
					}					
				}	
			}
			
			if(res.isEmpty()) {
				unusedNumbers.add(top.value);
				if(left!=null) {
					stack.push(left);
				}
				if(right!=null) {
					stack.push(right);
				}
				
			}
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		TreeNode five = new TreeNode(5);
		TreeNode fifteen = new TreeNode(15);
		TreeNode eleven = new TreeNode(11);
		TreeNode eighteen = new TreeNode(18);
		root.left = five;
		root.right = fifteen;
		fifteen.left = eleven;
		fifteen.right = eighteen;
		List <Integer> res =  findTwSumInTree(root, 26);
		System.out.println(res);
	}

}
