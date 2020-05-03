package Feb2020;

import java.util.ArrayList;
import java.util.List;

public class TraverseTreeBalances {

	  public static void traverseTreeAndFindDepth(TreeNode root,List<Integer> depth ,int currLevel) {
		  
		   if(root==null) {
		      return ;
		   }
		  
		   if(root.left==null && root.right==null) {
		     if(depth.size()==0) {
		       depth.add(currLevel);
		     }
		     else {
		       Integer currDepth = depth.get(depth.size()-1);
		       if(currLevel!=currDepth) {
		       	depth.add(currLevel);
		       }
		     }
		     return;
		   }
		    
		    traverseTreeAndFindDepth(root.left,depth,currLevel+1);
		    System.out.println("currlevel after left call"+currLevel);
		    traverseTreeAndFindDepth(root.right,depth,currLevel+1);
		    System.out.println("currlevel after right call"+currLevel);
		    
		  
		  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode node1 = new TreeNode(2);
		TreeNode node2 = new TreeNode(3);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(5);
		TreeNode node5 = new TreeNode(6);
		TreeNode node6 = new TreeNode(7);
		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;
		node5.left=node6;
		List<Integer> depth = new ArrayList<Integer>();
		traverseTreeAndFindDepth(node1, depth, 0);
		System.out.println(depth.size());
	}

}
