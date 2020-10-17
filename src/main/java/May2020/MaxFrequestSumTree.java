package May2020;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MaxFrequestSumTree {

	public static void calculateMaxSum(TreeNode root, Map<Integer,Integer> sumFrequency) {
		
		Queue<TreeNode> maxQueue = new LinkedList<TreeNode>();
		int maxSum = 0;
		int counter = 0;
		maxQueue.add(root);
		
		while(!maxQueue.isEmpty()) {
			if(maxSum!=0 && counter>1){
				if (sumFrequency.containsKey(maxSum)) {
					int newval = sumFrequency.get(maxSum)+1;
					sumFrequency.put(maxSum, newval);
				}
				else {
					sumFrequency.put(maxSum, 1);
				}
			}
			
			TreeNode front = maxQueue.poll();
			maxSum = maxSum+front.valueIn;
			if (sumFrequency.containsKey(front.valueIn)) {
				int newNodeVal = sumFrequency.get(front.valueIn)+1;
				sumFrequency.put(front.valueIn,newNodeVal);			
			}
			else {
				sumFrequency.put(front.valueIn,1);	
			}
			
			if(front.left!=null) {
				maxQueue.add(front.left);
			}
			if(front.right!=null) {
				maxQueue.add(front.right);
			}
			++counter;
		}
		
		if (sumFrequency.containsKey(maxSum)) {
			int newval = sumFrequency.get(maxSum)+1;
			sumFrequency.put(maxSum, newval);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode five = new TreeNode(5);
		TreeNode minufive = new TreeNode(-5);
		TreeNode two = new TreeNode(2);	
		TreeNode minufivetwo = new TreeNode(2);		
		five.left=two;
		five.right = minufive;
		minufive.left = minufivetwo;
		Map<Integer,Integer> sumFrequency = new HashMap<Integer, Integer>();
		calculateMaxSum(five,  sumFrequency);
		
		int maxFreq = 0;
		for(Map.Entry<Integer, Integer> iter: sumFrequency.entrySet()) {
			maxFreq = Math.max(maxFreq, iter.getValue());
		}

		for(Map.Entry<Integer, Integer> iter: sumFrequency.entrySet()) {
			Integer key = iter.getKey();
			Integer value = iter.getValue();
			if(value==maxFreq) {
				System.out.println(key);
			}
		}
				
		
	}

}
