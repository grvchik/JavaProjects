package Dec2019;

public class ArraytoBST {

	
	public static void arrayToTree(int[] nums) {
		
		TreeNode root = insertNode(nums, 0, nums.length-1);
		System.out.println(root);

	}
	

	public static TreeNode insertNode(int arr[],int beg,int end ) {
      if(beg>end) {
    	  return null;
      }
		
      int mid = (end+beg)/2;
      TreeNode root = new TreeNode(arr[mid]);
      
      root.left = insertNode(arr, 0, mid-1);
      
      root.right = insertNode(arr, mid+1, end);
      
      return root;
      
	}
	
	
	public static void main(String g[]) {
		
		int nums[] = {2,3,5};
		arrayToTree(nums);
	}
}
