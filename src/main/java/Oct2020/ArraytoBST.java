package Oct2020;



public class ArraytoBST {

	
	public static TreeNode createBinaryTree(int[] nums) {
		TreeNode binaryTree = createBinaryTree(nums,0,nums.length);
		return binaryTree;
	}
	
	
	public static TreeNode createBinaryTree(int[] nums,int start,int end) {	
		
    if(start>=end) {
		return null;
	}
	
	int mid = (start + end)/2;
	
	TreeNode root = new TreeNode(nums[mid]);
	
	root.left = createBinaryTree(nums,start, mid );
	root.right = createBinaryTree(nums,mid+1, end);
	
	return root;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2,3,4,5,6,7,8};
		TreeNode root = createBinaryTree(nums);
		System.out.println(root);
	}

}
