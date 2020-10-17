package Oct2020;


import java.util.LinkedList;
import java.util.Queue;


class NodeLevel {
	
	
	
	public TreeNode root;
	public int level;
	
	public NodeLevel(TreeNode root, int level) {
		this.root = root;
		this.level = level;
	}
}

public class TreeDepth {

	public static int getTreeDepth(TreeNode root) {
		
		if(root==null) {
			return 0;			
		}
		
		
		
		Queue<NodeLevel> curLevel = new LinkedList<NodeLevel>();
		
		NodeLevel nl = new NodeLevel(root, 1);
		curLevel.add(nl);
		int max=0;
		while(!curLevel.isEmpty()) {
			NodeLevel top = curLevel.poll();
			TreeNode left =top.root.left;
			TreeNode right =top.root.right;
			int currentLevel = top.level;
			max = Math.max(max, currentLevel);
			if(left!=null) {
				NodeLevel nleft = new NodeLevel(left, currentLevel+1); 
				curLevel.add(nleft);
			}

			if(right!=null) {
				NodeLevel nright = new NodeLevel(right, currentLevel+1); 
				curLevel.add(nright);
			}		
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode two = new TreeNode(2);
		TreeNode one = new TreeNode(1);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		root.left = four;
		four.left = one;
		root.right = two;
		two.left = six;
		two.right = seven;
		int depth = getTreeDepth(root);
		System.out.println(depth);
	}

}
