package Sept2019;

public class TreeSubSets {

	

	
	public static void getInorderTraversal(TreeNode root,StringBuffer path) {
		// base condition
		if(root==null) {
			path.append("x");
			return;
		}
		
		path.append(root.val);
		// now got to left child
		
			getInorderTraversal(root.left, path);	
		
		
		
			getInorderTraversal(root.right, path);	
		
		
		
		//		
	}
	
	
	
	public static boolean containsTree(TreeNode root1,TreeNode root2) {
		if(root2==null) {
			return true;
		}
		return subTree(root1, root2);
	}
	
	
	
	public static boolean subTree(TreeNode root1,TreeNode root2) {
		if(root1==null ) {
			return false;
		}
		else if(root1.val==root2.val && matchTree(root1, root2)) {
			return true;
		}
		
		return subTree(root1.left, root2) || subTree(root1.right, root2);
	}
	
	
	public static boolean matchTree(TreeNode root1,TreeNode root2) {
		if(root1==null && root2==null) {
			return false;
			
		}
		else if(root1==null || root2==null) {
			return false;
		}
		
		else if(root1.val!=root2.val) {
			return false;
			
		}
		else {
			return matchTree(root1.left, root2.left) && matchTree(root1.right, root2.right);
		}
		
	}
	
	
	
	public static TreeNode getTree1() {
		
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;		
		node2.right = node4;
		node5.right = node6;		
		return node1;
	}
	
	
	public static TreeNode getTree2() {
		TreeNode node0 = new TreeNode(4);		
		TreeNode node1 = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(1);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		node0.left = node1;
		node1.left = node2;
		node1.right = node5;
		node2.left = node3;		
		node2.right = node4;
		node5.right = node6;
		
		return node1;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode tree1 = getTree1();
		TreeNode tree2 = getTree1();
		
		StringBuffer sb1 =new StringBuffer();
		 getInorderTraversal(tree1, sb1);
		
		 StringBuffer sb2 =new StringBuffer();
		 getInorderTraversal(tree1, sb2);
		System.out.println(sb1);
		
		boolean res = containsTree(tree2, tree1);
		System.out.println(res);
		
		
		
	}

}
