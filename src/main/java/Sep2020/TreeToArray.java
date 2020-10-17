package Sep2020;



public class TreeToArray {

	public static TreeNode createBinaryTree(int[] nums) {
	 
		TreeNode root = getTree(nums,0,nums.length-1) ;
			return root;
		
	}
	
	public static TreeNode getTree(int[] nums,int left,int right) {
		
		if(left>=right) {
			return null;
		}
		
		int mid = (left+right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		
		
			root.left = getTree(nums, left, mid);
			root.right = getTree(nums, mid+1, right);
		
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-9,2,3,4,5,6};
		TreeNode root = createBinaryTree(nums);
		System.out.println(root);
	}

}
