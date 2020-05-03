package Feb2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeanAtEachLevelTree {

	public static void meanAtEachLevel(TreeNode root) {
	
		Map<Integer,Integer> levelList = new HashMap<Integer,Integer> ();		
		traverseTree(root,0,levelList);
		for(Map.Entry<Integer,Integer> obj: levelList.entrySet()) {
		  System.out.println("Key"+obj.getKey()+" Value"+obj.getValue());
		}
	}
	
	
	public static void traverseTree(TreeNode root,int level,Map<Integer,Integer> levelList ) {
		if(root==null) {
			return;
		}
		
		Integer currLevelValue = levelList.get(level);
		if(currLevelValue==null) {
			levelList.put(level, root.val);
		}
		else {
			Integer mean = (currLevelValue + root.val)/2;
			levelList.put(level, mean);
		}
		
		traverseTree(root.left, level+1, levelList);
		traverseTree(root.right, level+1, levelList);
	}
	
	public static void main(String g[]) {
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
		meanAtEachLevel(root);
	}
}
