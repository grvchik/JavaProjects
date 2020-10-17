package May2020;

class TreeNode {
	
	public TreeNode left;
	public TreeNode right;
	public int valueIn;
	public TreeNode(int value) {
		this.valueIn = value;
	}
}

public class TrimTree {

	
	public static void trimTree(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		if(root.left!=null) {
             if(root.left.valueIn==0 && root.left.left==null) {
            	 root.left = null;
             }
             else {
            	 trimTree(root.left);
             }
		}
		
		if(root.right!=null) {
            if(root.right.valueIn==0 && root.right.right==null) {
           	 root.right = null;
            }
            else {
           	 trimTree(root.right);
            }			
		}
		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode rootleft = new TreeNode(1);
		TreeNode rootright = new TreeNode(0);
		TreeNode root1 = new TreeNode(1);
		TreeNode root0 = new TreeNode(0);
		TreeNode zero0 = new TreeNode(0);
		TreeNode zero1 = new TreeNode(0);
		root.left = rootleft;
		root.right = rootright;
		rootright.left = root1;
		rootright.right = root0;
		root1.left = zero0;
		root1.right = zero1;
		trimTree(root);
	}

}
