package May2020;



public class ShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode source = new TreeNode(2);
		TreeNode one = new TreeNode(1);		
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		source.left = one;
		source.right=five;
		one.left = three;
		five.left = four;
		four.left = one;
		four.right=three;
	}

}
