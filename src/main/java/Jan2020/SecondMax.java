package Jan2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondMax {

	
	public static int getMax(TreeNode root, Integer max,List<Integer> secondList) {
		if(root.left==null && root.right==null) {
			max = Math.max(root.val, max);
			Integer secondMax = secondList.get(0);
			secondMax = Math.max(root.val, secondMax);
			secondList.set(0, secondMax);
			return max;
		}
		if(root==null) {
			return max;
		}
		
		Integer leftMax = getMax(root.left, max, secondList);
		if(leftMax>max) {
			secondList.set(0, max);
			
			max = leftMax;
		}
		
		Integer rightMax = getMax(root.right, max, secondList);
		if(rightMax>max) {
			secondList.set(0, max);
			max = rightMax;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode root3 = new TreeNode(3);
		TreeNode root4 = new TreeNode(4);
		Integer max = Integer.MIN_VALUE;
		Integer secondMax = Integer.MIN_VALUE;
		List<Integer> second = new ArrayList<Integer>();
		second.add(secondMax);
		root.left = root3;
		root.right = root4;
		 max = getMax(root, max, second);
		 System.out.println(max);
		
		
	}

}
