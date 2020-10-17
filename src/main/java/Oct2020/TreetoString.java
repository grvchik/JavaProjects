package Oct2020;

public class TreetoString {



	
	public static String getStringFromTree(TreeNode root) {
		
		if(root==null) {
			return "";
		}
		String left = getStringFromTree(root.left);
		String right = getStringFromTree(root.right);
		
		if(right!="" && left!="") {
			return String.format("%d[%s][%s]",root.valueIn,left,right);
		}
		else if(left!="") {
			return String.format("%d[%s]",root.valueIn,left);
		}
		else if(right!="") {
			return String.format("%d[%s]",root.valueIn,right);
		}		
		else {
			return String.format("%d",root.valueIn);
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);	
		
		root.left = two;
		root.right=three;
		three.right = four;
		String ret = getStringFromTree(root);
		System.out.println(ret);
	}

}
