package Feb2020;

import java.util.HashMap;
import java.util.Map;

class TreeNode {
	TreeNode(int val) {
		this.val = val;
	}
	int val;
	TreeNode left;
	TreeNode right;
}


public class MaximumLevel {

	public static void getMaximumAtEachLevel(TreeNode root) {
		 Map<Integer,Integer> maxMap = new HashMap<Integer,Integer>();
		 getMaxAtEachLevel(root, 0, maxMap);
		 
		 for( Map.Entry<Integer, Integer> obj: maxMap.entrySet()) {
			 System.out.println(obj.getValue());
		 }
		 
	}
	
	public static void getMaxAtEachLevel(TreeNode node,int level, Map<Integer,Integer> maxMap) {
		if(node==null) {
			return;
		}
		
		if(maxMap.containsKey(level)) {
			Integer curr = node.val;
			Integer newMax = Math.max(maxMap.get(level), curr);
			maxMap.put(level, newMax);
		}
		else {
			maxMap.put(level, node.val);
		}
		getMaxAtEachLevel(node.left, level+1, maxMap);
		getMaxAtEachLevel(node.right, level+1, maxMap);
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
		getMaximumAtEachLevel(root);		 
	}

}
