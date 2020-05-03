package Feb2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PosinuousPlants {

	public static int poisonousPlants(int[] p) {
		int retValue = 0;
		List<Stack<Integer>> stackLists = new ArrayList<Stack<Integer>>();
	
		for(int i=0;i<p.length;i++) {
			if(i==0) {
				Stack <Integer> first = new Stack<Integer>();
				first.add(p[i]);
				stackLists.add(first);
			}
			else {
				Stack <Integer> last = stackLists.get(stackLists.size()-1);
				if(p[i]<last.peek()) {
					last.add(p[i]);
				}
				else {
					Stack <Integer> newStack = new Stack<Integer>();
					newStack.add(p[i]);
					stackLists.add(newStack);
				}
				
			}
		}//for
		
		
		for(int i=1;i<stackLists.size();i++) {
			
			Stack<Integer> prev = stackLists.get(i-1);
			Stack<Integer> curr = stackLists.get(i);
			if(prev.peek()> curr.peek()) {
				prev.pop();
			}			
		}
		
		return retValue;
	}
	
	
	public static boolean didPLantDie(Stack<Integer> main, Stack<Integer> second) {
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {5,7,2,6,3};
		int res  =poisonousPlants(nums);
		System.out.println(res);
	}

}
