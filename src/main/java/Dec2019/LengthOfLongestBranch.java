package Dec2019;

public class LengthOfLongestBranch {

	
	public static int findMaxLength(TreeNode root, int length) {
		
		if(root.left==null && root.right==null) {
			return 0;			
		}
		
		if(root.left!=null && root.right==null) {
			
			if(root.val+1==root.left.val) {
				int leftLength = findMaxLength(root.left, length+1);
				return leftLength;
			}
			else {
				int leftLength = findMaxLength(root.left, length);
				return leftLength;
			}
			
			
		}
		else if (root.right!=null && root.left==null) {
			if(root.val+1==root.right.val) {
				int rightLength = findMaxLength(root.right, length+1);
				return rightLength;
			}
			else {
				int rightLength = findMaxLength(root.right, length);
				return rightLength;
			}			
		}
		else {
			if(root.left.val==root.val +1) {
				int leftLength = findMaxLength(root.left, length)+1;
				
				if(root.right.val==root.val+1) {
					int rightLength= findMaxLength(root.right, length)+1;
					return Math.max(leftLength, rightLength);
				}
				else {
					int rightLength= findMaxLength(root.right, length);
					return Math.max(leftLength, rightLength);
				}
				
			}
			else {
				int leftLength = findMaxLength(root.left, length);
				if(root.right.val==root.val+1) {
					int rightLength= findMaxLength(root.right, length)+1;
					return Math.max(leftLength, rightLength);
				}
				else {
					int rightLength= findMaxLength(root.right, length);
					return Math.max(leftLength, rightLength);
				}				
				
			}
			
			
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = new TreeNode(0);
		TreeNode leftOne = new TreeNode(1);
		TreeNode leftleftOne = new TreeNode(1);
		TreeNode rightleftOne = new TreeNode(1);
		TreeNode rightTwo = new TreeNode(2);
		TreeNode leftRightTwo = new TreeNode(2);
		TreeNode rightRightThree = new TreeNode(3);
		root.left = leftOne;
		root.right = rightTwo;
		leftOne.left = leftleftOne;
		leftOne.right = leftRightTwo;
		rightTwo.left = rightleftOne;
		rightTwo.right = rightRightThree;
		
		int maxLength = findMaxLength(root, 0);
		System.out.println(maxLength);
	}

}
