package Jan2020;

public class SubTree {

	
	public static TreeNode getCommonNode(TreeNode master,TreeNode child) {
		if(master==null || child==null) {
			return null;
		}
		if(master.val==child.val) {
			return child;
		}
		
		TreeNode leftBranch = getCommonNode(master.left, child);
		TreeNode rightBranch = getCommonNode(master.right, child);

		if(leftBranch==null && rightBranch!=null) {
			return rightBranch;
		}

		if(leftBranch!=null && rightBranch==null) {
			return leftBranch;
		}
		
		return null;
	}
	
	public static boolean areBothSame(TreeNode root1, TreeNode root2) {
		if(root1==null && root2==null) {
			return true;
		}
	
		if(root1==null && root2!=null) {
			return false;			
		}
		
		if(root2==null && root1!=null) {
			return false;
			
		}
		
		
		if(root1.val!=root2.val) {
			return false;
		}
		
		boolean leftResult = areBothSame(root1.left, root2.left);
		boolean rightResult = areBothSame(root1.right, root2.right);
		
		if(leftResult) {
			return leftResult && rightResult;
		}

		if(rightResult) {
			return leftResult && rightResult;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root1 = new TreeNode(2);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(3);
		root1.left=node1;
		root1.right=node2;
		TreeNode four = new TreeNode(4);
		TreeNode root2 = new TreeNode(2);
		TreeNode node11 = new TreeNode(1);
		TreeNode node12 = new TreeNode(3);
		four.right=root2;
		root2.left=node11;
		root2.right=node12;
		
		TreeNode commonNode = getCommonNode(four, root1);
		System.out.println(commonNode.val);
		boolean res = areBothSame(root1, root2);
		System.out.println(res);
	}

}
