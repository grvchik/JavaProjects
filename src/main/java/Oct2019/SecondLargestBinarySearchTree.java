package Oct2019;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * 	      ( 5 )
             \
             (8)
         	/  \
          (7)  (12)
                 /
               (10)
               /  \
             (9)  (11)
 * 
 * @author I813402
 *
 */

public class SecondLargestBinarySearchTree {

	private int secondLargest;
	
	public int getSecondLargest() {
		return secondLargest;
	}
	public void setSecondLargest(int secondLargest) {
		this.secondLargest = secondLargest;
	}
	
	public int findSecondLargestItem(TreeNode root) {
		
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		int maximum=0;
		
		//case 1 when there is no right tree
		if(root.right==null && root.left!=null) {
			return root.left.val;
		}
		
		if(root.right!=null) {
			stack.push(root);
			while(!stack.isEmpty()) {
				TreeNode top = stack.pop();
				if(top.val>maximum) {
					this.setSecondLargest(maximum);
					maximum = top.val;
				}
				
				else if(top.val<maximum && top.val> this.getSecondLargest()) {
					this.setSecondLargest(top.val);
				}
				if(top.left!=null) {
					stack.push(top.left);
				}
				if(top.right!=null) {
					stack.push(top.right);
				}
				
			}// while
		}
		
		return this.getSecondLargest();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(9);
		TreeNode node2 = new TreeNode(5);		
		TreeNode node3 = new TreeNode(8);	
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(12);
		TreeNode node6 = new TreeNode(10);
		TreeNode node7 = new TreeNode(9);	
		TreeNode node8 = new TreeNode(11);
		node2.right = node3;
		node3.left = node4;
		node3.right = node5;
		node5.left = node6;
		node6.left = node7;
		node6.right = node8;
		
		SecondLargestBinarySearchTree slar = new SecondLargestBinarySearchTree();
		int num = slar.findSecondLargestItem(node2);
		System.out.println(num);
	}

}
