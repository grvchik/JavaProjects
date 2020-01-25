package Jan2020;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TrappedWatrer {

	class PoleAttributes {
		
		public int index;
		public int value;
		PoleAttributes(int index,int value) {
			this.index = index;
			this.value = value;
		}
	}
	
	public int trappedWater(int[] poles) {
	
		Deque<Integer> stack = new LinkedList<Integer>();
		List<Integer> subtractionLIst = new ArrayList<Integer>();
		
		 for(int i=0;i< poles.length;i++) {
			 if(stack.isEmpty() ||stack.peek()>poles[i]) {
				 
				 PoleAttributes pa = new PoleAttributes(i, poles[i]);
				 
				 stack.push(poles[0]);
			 }
			 else {
				 int currTop = stack.pop();
				 int nextTop=-1;
				 if(stack.size()>=2) {
					 while(stack.peek()<currTop) {
						 subtractionLIst.add(stack.pop()); 
					 }
					 nextTop = stack.peek();
					 
					// calculateArea(currTop,nextTop,subtactionList);
				 }
				 else {
					 stack.push(poles[0]); 
				 }
			 }
		 }
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
