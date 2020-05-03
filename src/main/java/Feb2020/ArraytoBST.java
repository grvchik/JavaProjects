package Feb2020;

public class ArraytoBST {

	public static TreeNode createBinaryTree(int[] nums) {
		
		TreeNode root = createBinaryTree(0, nums.length, nums);
		
		return root;
		
	}
	
	public static TreeNode createBinaryTree(int start, int end, int[] nums) {
		if(start>=end) {
			return null;
		}
		
		int mid = (start + end)/2;
		
		TreeNode root = new TreeNode(nums[mid]);
		
		root.left = createBinaryTree(start, mid, nums);
		root.right = createBinaryTree(mid+1, end, nums);
		
		return root;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-9,2,3,4,5,6};
		TreeNode root = createBinaryTree(nums);
		System.out.println(root);
	}

}
