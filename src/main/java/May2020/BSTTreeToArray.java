package May2020;



public class BSTTreeToArray {
   static int index=0;
	public static void getArrayFromTree(TreeNode root,int[] array) {
		if(root==null) {
		
			return;
		}
		getArrayFromTree(root.left, array);
		
		array[index++]=root.valueIn;
		
		getArrayFromTree(root.right, array);
	
		
	}
	public static int getTreeSize(TreeNode root) {
		
		if(root==null) {
			return 0;
		}

		if(root.left==null && root.right==null){
			return 1;
		}
		
		
		return getTreeSize(root.left)+ getTreeSize(root.right) +1;
		
	   
	}
	
	public static void main(String[] args) {
		TreeNode six = new TreeNode(6);
		TreeNode four = new TreeNode(4);
		TreeNode nine = new TreeNode(9);
		TreeNode three = new TreeNode(3);
		TreeNode five = new TreeNode(5);
		six.left = four;
		six.right = nine;
		four.left = three;
		four.right = five;
		int size = getTreeSize(six);
		System.out.println(size);
		int []  array = new int[size];
		getArrayFromTree(six, array);
		System.out.println(array);		// TODO Auto-generated method stub

	}

}
