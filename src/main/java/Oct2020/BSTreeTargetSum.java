package Oct2020;

public class BSTreeTargetSum {

	
	public static int leftSum(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return root.valueIn+ leftSum(root.left);
	}

	public static int rightSum(TreeNode root) {
		if(root==null) {
			return 0;
		}
		return root.valueIn+ leftSum(root.right);		
	}	
	
	
	public static boolean targetSum(TreeNode root,int target) {
		
		if(root==null || (root.left==null && root.right==null)) {
			return false;
		}
	
		if(root.left!=null && root.valueIn+root.left.valueIn==target) {
			return true;
		}

		if(root.right!=null && root.valueIn+root.right.valueIn==target) {
			return true;
		}
		
		
		int leftSum = root.valueIn +leftSum(root.left);
		
		int rightSum = root.valueIn +leftSum(root.right);
		
		if(leftSum==target ||rightSum==target) {
			return true;
		}
		if(root.left!=null && root.right!=null) {		
			if (root.left.valueIn+root.right.valueIn==target) {
				return true;
			}
		
			else {
			 boolean left = targetSum(root.left, target);
			 boolean right = targetSum(root.right, target);
				if(left ||right) {
					return true;
				}
			}
			
		}
		 boolean left = targetSum(root.left, target);
		 boolean right = targetSum(root.right, target);	
			if(left ||right) {
				return true;
			}
		return false;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode five = new TreeNode(5);
		TreeNode one = new TreeNode(1);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode eight = new TreeNode(8);
		five.left = three;
		three.left = one;
		three.right = four;
		five.right = eight;
		
		boolean res = targetSum(five, 4);
		System.out.println(res);
		
	}

}
