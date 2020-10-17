package Oct2020;

public class MergeBinaryTrees {

	public static TreeNode mergeTrees(TreeNode node1,TreeNode node2) {
		if(node1==null && node2==null) {
			return null;
		}
		
		if(node1==null && node2!=null) {
			return node2;
		}
		if(node2==null && node1!=null) {
			return node1;
		}		
		
		node1.valueIn = node1.valueIn +node2.valueIn;
		
		mergeTrees(node1.left, node2.left);
		mergeTrees(node1.right, node2.right);
		
		return node1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = new TreeNode(1);
		TreeNode three1 = new TreeNode(3);
		TreeNode two1 = new TreeNode(2);
		TreeNode five1 = new TreeNode(5);
		root1.left = three1;
		root1.right = two1;
		three1.left = five1;
		TreeNode root2 = new TreeNode(2);
		TreeNode res = mergeTrees(root1, root2);
		System.out.println(res);
	}

}
