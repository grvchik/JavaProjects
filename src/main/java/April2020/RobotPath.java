package April2020;

import java.util.ArrayList;
import java.util.HashSet;

class Point {
	public int x;
	public int y;
	public Point(int x1,int y1) {
		this.x = x1;
		this.y = y1;
	}
}
public class RobotPath {

	
	public ArrayList<Point>  getPath(boolean [][]maze) {
		
		if(maze==null || maze.length==0) return null;
		
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet<Point> failedPoints = new HashSet<Point>();
		
		if(getPath(maze,maze.length,maze[0].length,path,failedPoints)) {
			return path;
		}
		
		return null;
	}
	
	
	public static boolean getPath(boolean[][] maze, int row,int col,ArrayList<Point> path,
			HashSet<Point> failedPath
			) {
		if(row < 0 && col< 0) {
			return false;
		}
		
		Point p = new Point(row, col);
		if(failedPath.contains(p)) {
			return false;
		}
		
		boolean isOrigin = (row==0) && (col==0);
		
		if(isOrigin 
		|| getPath(maze, row-1, col, path, failedPath)
		|| getPath(maze, row, col-1, path, failedPath)				
		) {
			path.add(p);
			return true;
		}
		
		failedPath.add(p);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
