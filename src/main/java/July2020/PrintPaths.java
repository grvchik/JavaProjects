package July2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class PathContainer {
	
	public List<Integer> pathSoFar;
	
	public List<Integer> getPathSoFar() {
		return pathSoFar;
	}


	public void setPathSoFar(List<Integer> valueList) {
		this.pathSoFar = valueList;
	}

	public TreeNode root;
	public TreeNode left;
	public TreeNode right;
	
	public PathContainer(TreeNode root,TreeNode left,TreeNode right) {
		this.pathSoFar = new ArrayList<Integer>();
		this.root = root;
		this.left = left;
		this.right = right;
	}
	
}




public class PrintPaths {

	public static List<List<Integer>> printPaths(TreeNode root) {
		Queue<PathContainer> qpc = new LinkedList<PathContainer>();
		PathContainer pc = new PathContainer(root, root.left, root.right);
		List<List<Integer>> pathSoFar = new ArrayList<List<Integer>>();
		qpc.add(pc);
		while(!qpc.isEmpty()) {
			
			PathContainer currentPc = qpc.poll();		
			Integer currValue = currentPc.root.valueIn;
			TreeNode left = currentPc.left;
			TreeNode right = currentPc.right;
			List <Integer> path = null; 
			
			if(left!=null) {
				path = new ArrayList<>();
				if(currentPc.getPathSoFar().size()==0) {
					path.add(currValue);
					path.add(left.valueIn);				
				}
				else {
					for(int i=0;i<currentPc.getPathSoFar().size();i++) {
						Integer currPathVal = currentPc.getPathSoFar().get(i);
						path.add(currPathVal);
					}
					path.add(left.valueIn);
				}
				PathContainer leftPc = new PathContainer(root, left.left, left.right);
				leftPc.setPathSoFar(path);
				qpc.add(leftPc);
			}
				
		
			
			if(right!=null) {
				path = new ArrayList<>();
				if(currentPc.getPathSoFar().size()==0) {
					path.add(currValue);
					path.add(right.valueIn);							
				}
				else {
					for(int i=0;i<currentPc.getPathSoFar().size();i++) {
						Integer currPathVal = currentPc.getPathSoFar().get(i);
						path.add(currPathVal);
					}
					path.add(right.valueIn);				
				}

				PathContainer rightPc = new PathContainer(root, right.left, right.right);
				rightPc.setPathSoFar(path);
				qpc.add(rightPc);
			}
			
			if(left==null && right==null) {
				path = currentPc.getPathSoFar();
				pathSoFar.add(path);
			}			
		}		
		return pathSoFar;
}
	
	public static void main(String g[]) {
		TreeNode root = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		
		root.left  = two;
		three.left = four;
		three.right = five;
		root.right = three;
		
		printPaths(root);
	}

}



