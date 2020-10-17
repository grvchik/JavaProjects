package July2020;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Point {
	public int x;
	public int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
}
class DistanceFromPoint implements Comparable<DistanceFromPoint>{
	public int distanceFromPoint;
	public Point nearPoint;
	public Point getNearPoint() {
		return nearPoint;
	}
	public void setNearPoint(Point nearPoint) {
		this.nearPoint = nearPoint;
	}
	public DistanceFromPoint( Point p1, Point c1) {
		int diffX = p1.x-c1.x;
		int diffY = p1.y - c1.y;
		this.distanceFromPoint = (int)Math.sqrt( Math.pow(diffX, 2) + Math.pow(diffY, 2) );
		this.nearPoint = p1;
	}
	@Override
	public int compareTo(DistanceFromPoint o) {
		// TODO Auto-generated method stub
		return (int)(o.distanceFromPoint-this.distanceFromPoint);
	}
	
	
}

public class NearestKPoints {

	public static List<Point> findNearestKPoints(List<Point> pointList, Point center, int k) {
		
		PriorityQueue<DistanceFromPoint> dpQueue = new PriorityQueue<DistanceFromPoint>();
		 List<Point> retList = new ArrayList<Point>();
		for(int i=0;i<pointList.size();i++) {
			Point pi = pointList.get(i);
			DistanceFromPoint dp = new DistanceFromPoint(pi, center);
			if(dpQueue.size()<k) {
				dpQueue.add(dp);
			}
			else {
				DistanceFromPoint topDp = dpQueue.peek();
				if(dp.distanceFromPoint<topDp.distanceFromPoint) {
					dpQueue.poll();
					dpQueue.add(dp);
				}
			}
			
		}
		
		while(!dpQueue.isEmpty()) {
			DistanceFromPoint topDp = dpQueue.poll();
			retList.add(topDp.getNearPoint());
		
		}

		return retList;
	}
	
	
	public static void main(String g[]) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(5, 4);
		Point p3 = new Point(3, 1);
		List<Point> pointList = new ArrayList<Point>();
		pointList.add(p1);
		pointList.add(p2);
		pointList.add(p3);
		Point central = new Point(1, 2);
		int k = 2;
		findNearestKPoints(pointList, central, k);
	}
}
