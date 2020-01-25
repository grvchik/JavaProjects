package Dec2019;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDepth {

	private static void createLinkedList(TreeNode root) {
		List <LinkedList<TreeNode>> arrList = new ArrayList<LinkedList<TreeNode>>();
		createLinkedListAtLevel(root,arrList,0);
	}
	
	private static void createLinkedListAtLevel(TreeNode root,List<LinkedList<TreeNode>> arrList, int level) {
		
		if(root==null) {
			return;
		}
		LinkedList<TreeNode> list = null;
		
		if(level==arrList.size()) {
			list = new LinkedList<TreeNode>();
			arrList.add(list);
		}
		else {
			list = arrList.get(level);
		}
		list.add(root);
		createLinkedListAtLevel(root.left, arrList, level+1);
		createLinkedListAtLevel(root.right, arrList, level+1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		root.right = three;
		three.left = six;
		three.right = seven;
		createLinkedList(root);
	}

}
