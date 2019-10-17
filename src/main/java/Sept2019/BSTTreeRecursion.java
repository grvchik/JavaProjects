package Sept2019;



public class BSTTreeRecursion {

	

	
	

public static boolean isBSTRecursion(TreeNode root) {
   if(root.left==null && root.right==null) {
     return true;
   }

   
   if(root.left!=null && root.right==null) {
      if(root.left.val<root.val) {
        return isBSTRecursion(root.left);
      }
      else {
        return false;
      }
   }

  
  if(root.right!=null && root.left==null) {
       if(root.right.val> root.val) {
        return isBSTRecursion(root.right);
      }
      else {
        return false;
      } 
  }


  return isBSTRecursion(root.left)&& isBSTRecursion(root.right);
}	
	
  public static TreeNode getBST(int[] arr, int beg, int end) {
	  if(beg>end) {
		  return null;
	  }
	  
	  int mid = (beg + end)/2;
	  
	  TreeNode root = new TreeNode(arr[mid]);
	  
	  root.left =  getBST(arr, 0, mid-1);
	  root.right = getBST(arr, mid+1,end);
	  
	  return root;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,3,4,5};
		TreeNode root = getBST(arr, 0, arr.length-1);
		
		boolean res = isBSTRecursion(root);
		System.out.println(res);
	}

}
