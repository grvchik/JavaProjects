package June2020;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Point implements Comparable<Point> {
	
	public int x;
	public int y;
	
	
	public Point(int x,int y) {
		this.x = x;
		this.y =y;
		
	}
	public int distanceFromSource;

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return o.distanceFromSource-this.distanceFromSource;
	}
}



public class ShortestDistanceKth {

	
	public static List<Point>  findNearestKPoints(List<Point> input, int k) {
		PriorityQueue<Point> pq = new PriorityQueue<Point>();
		
	
		
		for(int i=0;i<k;i++) {
			pq.add(input.get(i));
		}
		
		
		for(int j = k-1;j<input.size();j++) {
			Point top = pq.peek();
			if(top.distanceFromSource>input.get(j).distanceFromSource) {
				pq.poll();
				pq.add(input.get(j));
			}
		}
		System.out.println();
		List<Point> retList = new ArrayList<Point>();
		while(!pq.isEmpty()) {
			retList.add(pq.poll());
		}
		return retList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(0,0);
		Point p2 = new Point(5,4);
		Point p3 = new Point(3,1);
		
		int xdiff = p1.x-1;
		int ydiff = p1.y-2;
		double distFromSource = Math.sqrt(Math.pow(xdiff, 2) + Math.pow(ydiff, 2));
		p1.distanceFromSource = (int)distFromSource;

		 xdiff = p2.x-1;
		 ydiff = p2.y-2;
		 distFromSource = Math.sqrt(Math.pow(xdiff, 2) + Math.pow(ydiff, 2));
		 p2.distanceFromSource = (int)distFromSource;


		 xdiff = p3.x-1;
		 ydiff = p3.y-2;
		 distFromSource = Math.sqrt(Math.pow(xdiff, 2) + Math.pow(ydiff, 2));
		 p3.distanceFromSource = (int)distFromSource;		 
		 
		 List<Point> input = new ArrayList<Point>();
		 input.add(p1);
		 input.add(p2);
		 input.add(p3);
		 List<Point> ret = findNearestKPoints(input,2);
		 System.out.println(ret);
	}

}
