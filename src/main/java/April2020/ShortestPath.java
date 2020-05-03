package April2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShortestPath {

	
	public static List<Integer> findShortestPath(TreeNode source,TreeNode destination,Set<Integer> visited) {
		
		if(!visited.contains(destination.value)&& source.value==destination.value) {
			List<Integer> result = new ArrayList<Integer>();
			result.add(destination.value);
			visited.add(destination.value);
			return result;
		}
		
		if(visited.contains(destination.value) || source==null){
			List<Integer> result = new ArrayList<Integer>();
			return result;
		}
		
		
		List<Integer> leftPath=	findShortestPath(source.left, destination, visited);
		List<Integer> rightPath=	findShortestPath(source.right, destination, visited);
		
        if(leftPath==null || leftPath.size()==0 && rightPath.size()>0) {
        	visited.add(source.value);
        	rightPath.add(source.value);
        	return rightPath;
        }
        
        if(rightPath==null || rightPath.size()==0 && leftPath.size()>0) {
           	visited.add(source.value);
           	leftPath.add(source.value);
        	return leftPath;        	
        }
		
        if(rightPath!=null && leftPath!=null) {
        	if(rightPath.size()<leftPath.size()) {
        		visited.add(source.value);
        		rightPath.add(source.value);
        		return rightPath;
        	}
        	else {
        		visited.add(source.value);
        		leftPath.add(source.value);
        		return leftPath;       		
        	}
        }
        
        return null;
	}
	
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
		Set<Integer> visited = new HashSet<Integer>();
		findShortestPath(source, three, visited);
	}

}
