package June2020;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {

	public int lowVal;
	public int highVal;
	
	public Pair(int lowVal,int highVal) {
		this.lowVal = lowVal;
		this.highVal = highVal;
	}
	
	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return this.lowVal-o.lowVal;
	
	}
	
}
public class NonOverlappingPairs {

	
	public static int findMinDeletions(List<Pair> pairList) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		for(int i=0;i<pairList.size();i++) {
			Pair currPair = pairList.get(i);
			pq.add(currPair);			
		}
		int deletionCounter=0;
		while(!pq.isEmpty()) {
			Pair topElement = pq.poll();
			Pair nextElement = pq.peek();
			if(nextElement!=null && topElement.highVal > nextElement.lowVal  ) {
				++deletionCounter;
				 pq.poll();
			}
		}
		return deletionCounter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p1 = new Pair(7,9);
		Pair p2 = new Pair(2,4);
		Pair p3 = new Pair(5,8);
		List<Pair> pList = new ArrayList<Pair>();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		findMinDeletions(pList);
		
	}

}
