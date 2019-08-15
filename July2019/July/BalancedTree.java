package July;

 class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;

	public TreeNode(int x) {
		val = x;
	}
}

   class Status {
	 int numNodes;
	 public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	public TreeNode getAncestor() {
		return ancestor;
	}

	public void setAncestor(TreeNode ancestor) {
		this.ancestor = ancestor;
	}

	TreeNode ancestor;
	 
	 public Status(int numNodes,TreeNode ancestor) {
		 this.numNodes = numNodes;
		 this.ancestor = ancestor;		 
	 }
	 
	 
 }


 
 
public class BalancedTree {
	 boolean isBalanced(TreeNode tree) {
		 if(tree.left==null && tree.right==null) {
			 return true;
		 }
		 
		 if(tree.left!=null && tree.right!=null) {
			 return isBalanced(tree.left) && isBalanced(tree.right); 
		 }
		 
		 return false;
	 }
	
	 
	 public boolean isSymmetric(TreeNode root) {
		 if (root.left==null && root.right==null) {
			 return true;
		 }
		 else  if(root.left==null && root.right!=null) {
				 return false;
			 }
		 else  if(root.left!=null && root.right==null) {
			 return false;
		 }
		 else {
			 return (root.left.val==root.right.val && isSymmetric(root.left)&& isSymmetric(root.right));
		 }
		 
	 }
	 
	 
	 public Status LCAHelper(TreeNode root,TreeNode node1,TreeNode node2) {
		
		 if(root==null) {
			 return new Status(0,null);
		 }
		 
		 
		 Status leftResult = LCAHelper(root.left, node1, node2);
		 
		 if(leftResult.getNumNodes()==2) {
			 return leftResult;
		 }
		 
		 Status rightResult = LCAHelper(root.right, node1, node2);
		 
		 if(rightResult.getNumNodes()==2) {
			 return rightResult;
		 }
		 
		 
		 int nodeCounter =leftResult.getNumNodes() + rightResult.getNumNodes()+ (root==node1?1:0)+(root==node2?1:0);
		 return new Status(nodeCounter,(nodeCounter==2?root:null));		 		 
		 
	 }
	 
	 
	 public TreeNode getLCA(TreeNode root,TreeNode node1,TreeNode node2) {
		 return LCAHelper(root, node1, node2).getAncestor();
	 }
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left11 = new TreeNode(2);
		TreeNode right11 = new TreeNode(3);
		TreeNode left111 = new TreeNode(5);
		TreeNode right111 = new TreeNode(6);
		TreeNode left21 = new TreeNode(7);
		TreeNode right21 = new TreeNode(8);
		root.left = left11;
		//left11.right = right11;
		
		root.right = right11;
		right11.left = right111;
		BalancedTree bTree = new BalancedTree();
		//System.out.println(bTree.isSymmetric(root));
		TreeNode  lcaRoot = bTree.getLCA(root, left11, right111);
	}

}
