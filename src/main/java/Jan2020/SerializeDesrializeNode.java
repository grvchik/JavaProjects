package Jan2020;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
	public  int val;
	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode left;
	public TreeNode right;
}
public class SerializeDesrializeNode {

	
	
	public static TreeNode deserializeTree(String serailized) {
		Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
		
		String valuesArray[] = serailized.split(" ");
		
		TreeNode root = new TreeNode(Integer.valueOf(valuesArray[0]));
		treeQueue.add(root);
		
		for(int i=1;i<valuesArray.length;i++) {
			TreeNode node = treeQueue.poll();
			if(!valuesArray[i].trim().equalsIgnoreCase("*")) {
				TreeNode left = new TreeNode(Integer.valueOf(valuesArray[i]));
				node.left = left;
				treeQueue.add(left);
			}
			
			i++;
			if(!valuesArray[i].trim().equalsIgnoreCase("*")) {
				TreeNode right = new TreeNode(Integer.valueOf(valuesArray[i]));
				node.right = right;
				treeQueue.add(right);
			}
			
		}
		
		return root;
	}
	
	public static String serializeTree(TreeNode root) {
		Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();
		String seralizedString = "";
		
		if(root==null) {
			return seralizedString;
		}
		
		treeQueue.add(root);
		
		while(!treeQueue.isEmpty()){		 
			TreeNode node = treeQueue.poll();
			
			if(node==null) {
				seralizedString+="* ";
			
			}
			else {
				seralizedString+= ""+node.val+" ";	
				treeQueue.add(node.left);
				treeQueue.add(node.right);				
			}
					
			
			

		}
		return seralizedString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		root.left=three;
		root.right = four;
		four.left = five;
		four.right = six;
		String serializedString = serializeTree(root);
		System.out.println(serializedString);
		TreeNode deser = deserializeTree(serializedString);
		System.out.println(deser);
		
	}

}
