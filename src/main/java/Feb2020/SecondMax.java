package Feb2020;

import java.util.ArrayList;
import java.util.List;

public class SecondMax {

	public static void findSecondLargest(TreeNode root,List<Integer> maxSecond) {
		 if(root==null ) {
		     return ;
		  }
		 
		 if(root.left==null && root.right==null) {
			 if(maxSecond.size()==2) {
				 Integer firstMax = maxSecond.get(0);
				 Integer secondMax = maxSecond.get(1);
				 if(root.val>firstMax) {
					 maxSecond.set(0,root.val);
					 maxSecond.set(1,firstMax);
				 }
				 else if(root.val< firstMax && root.val >secondMax) {
					 maxSecond.set(1,root.val);
				 }
			 }
			 else if(maxSecond.size()==1) {
				 
				 Integer firstMax = maxSecond.get(0);
				 if(root.val>firstMax) {
					 maxSecond.set(0,root.val);
					 maxSecond.add(firstMax);
					 
				 }
				 else {
					 maxSecond.add(root.val);
;				 }				 
			 }
			 else {
				 maxSecond.add(root.val);
			 }
		 }

		findSecondLargest(root.right, maxSecond);
		
		findSecondLargest(root.left, maxSecond);	
		
	 }	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode three = new TreeNode(3);
		TreeNode two = new TreeNode(2);
		TreeNode four = new TreeNode(4);
		TreeNode six = new TreeNode(6);
		
		root.left=three;
//		root.right = six;
		three.left = two;
		three.right = four;
		List<Integer> maxminList = new ArrayList<Integer>();
		findSecondLargest(root, maxminList);
		
	}

}
