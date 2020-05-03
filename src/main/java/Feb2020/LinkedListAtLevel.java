package Feb2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class ListNode1 {
	public int val;
	public ListNode1 next;
	ListNode1(int value) {
		this.val = value;
	}
}
public class LinkedListAtLevel {

	public static   List<ListNode1> getNodeAtEachLevel(TreeNode root) {
		
		
		
		Map<Integer,List<Integer>> levelListMap = new HashMap<Integer,List<Integer>>();
		List<ListNode1> ret = new ArrayList<ListNode1>();
		iterAteLevel(root, levelListMap, 1);
		for(Map.Entry<Integer,List<Integer>> obj: levelListMap.entrySet()) {
			int level = obj.getKey();
			List<Integer> valueList = obj.getValue();
			ListNode1 levelNode =  (ListNode1)getNode(valueList);
			ret.add(levelNode);
			
		}
		return ret;
	}
	
	
	
	private static ListNode1 getNode(List<Integer> list) {
		ListNode1 ret = new ListNode1(-1);
		ListNode1 head = new ListNode1(-1);
		ret = head;
		for( int num :list) {
			head.next = new ListNode1(num);
			head = head.next;
			
		}
	
		return ret.next;
	}
	
	
	public static void iterAteLevel(TreeNode root,Map<Integer,List<Integer>> levelListMap, int level) {
		if(root==null) {
			return;
		}
		
		if(levelListMap.get(level)==null) {
			List<Integer> nodeList = new ArrayList<Integer>(1);
			nodeList.add(root.val);
			levelListMap.put(level, nodeList);
		}
		else {
			List<Integer> nodeList = levelListMap.get(level);
			nodeList.add(root.val);
			levelListMap.put(level, nodeList);			
		}
		

		
		iterAteLevel(root.left,levelListMap,level+1);
		iterAteLevel(root.right,levelListMap,level+1);		
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode seven = new TreeNode(7);
		TreeNode five = new TreeNode(5);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		root.left = three;
		root.right = seven;
		seven.left = five;
		seven.right = eight;
		three.left = nine;
		getNodeAtEachLevel(root);
	}

}
