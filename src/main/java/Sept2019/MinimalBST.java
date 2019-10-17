package Sept2019;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int input) {
		this.val = input;
	}
}

public class MinimalBST {

	private static TreeNode root = null;
	
	
	public static TreeNode getMinimalBSTRecursion(int[] input,int start,int end) {
		if(start>end) {
			return null;
		}
		
		int mid = ( start + end )/2;
		TreeNode n = new TreeNode(input[mid]);
		n.left = getMinimalBSTRecursion(input, start, mid-1);
		n.right= getMinimalBSTRecursion(input, mid+1,end);
		return n;
	}
	
	
	public static TreeNode getMinimalBST(int[] input) {
		
		for(int i=0;i<input.length;i++) {
			if(root==null) {
				root = new TreeNode(input[i]);
			}
			else {
				
				if(input[i]>root.val)  {
					
					if(root.left==null && root.right==null) {
						TreeNode temp = root;
						TreeNode newroot = new TreeNode(input[i]);
						newroot.left = temp;
						root = newroot;
						
					}
					else if(root.left!=null && root.right!=null) {
						TreeNode temp = root;
						TreeNode newroot = new TreeNode(input[i]);
						newroot.left = temp;
						root = newroot;
						
					}
					else if(root.left!=null && root.right==null) {
						
						TreeNode newroot = new TreeNode(input[i]);
						root.right = newroot;
					
					}
				}
				else {
					
					
				}
				
				
				
			}
			
		}
		return root;
	}
	
	
	public static List<List<Integer>> createListForEachLevel(TreeNode root,List<List<Integer>> levelList, int level) {
		
		if(root==null) {
			return levelList;
		}
		
		
		List<Integer> retList = null;
		
		if(levelList.size()==level) {
			retList = new ArrayList<Integer>();	
			levelList.add(retList);
			retList.add(root.val);
		}
		else {
			retList = levelList.get(level);
			retList.add(root.val);
			
			levelList.set(level, retList);			
		}
		

		
		createListForEachLevel(root.left, levelList, ++level);		
		level = level -1;
		createListForEachLevel(root.right, levelList, ++level);
		
		
		return levelList;
	}
	
	
	public static boolean isBSTTree(TreeNode root){
		 Deque<TreeNode> treeStack = new  LinkedList<TreeNode>();

		  treeStack.push(root);
		  
		  while(treeStack.isEmpty()) {
		  
		   TreeNode top = treeStack.pop();
		   
		   if(top.left!=null) {
		       if(top.val<top.left.val) {
		         return false;
		       }
		       else {
		        treeStack.push(top.left);
		       }
		   }
		  
		   if(top.right!=null) {
		      if(top.val>top.right.val) {
		       return false;
		      }
		     else {
		       treeStack.push(top.right);
		      }
		   }
		  
		  }
		  return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,4,5,7,8,9};
		//TreeNode root = getMinimalBST(nums);
		
		TreeNode root = getMinimalBSTRecursion(nums, 0, nums.length-1);
		boolean res = isBSTTree(root);
		System.out.println(res);
		List<List<Integer>> levelList  = new ArrayList<List<Integer>>();
		createListForEachLevel(root, levelList, 0);
		System.out.println(root);
	}

}
