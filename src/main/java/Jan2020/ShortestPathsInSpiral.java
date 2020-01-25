package Jan2020;

import java.util.HashSet;
import java.util.Set;

class Step {
	
	public int x;
	public int y;
	public int distance;
	
}

public class ShortestPathsInSpiral {

	
	public void getMinimumSteps(int srcX, int srcY, int tgtX, int tgtY, int [][] maze,Integer distance,Set<String> visited) {
		String targetKey = tgtX+","+tgtY;	
		if(srcX==tgtX && srcY==tgtY) {
				
			if(!visited.contains(targetKey)) {
				visited.add(targetKey);
			}			
			System.out.println(distance);
			return ;
		}
		

		
		String key = srcX+","+srcY;		
		if(!visited.contains(key)) {
			visited.add(key);
		}
		else {
			return;
		}
		
		if(visited.contains(targetKey)) {
			return;
		}
		// source X is bigger than target X and Ys are same
		
		if(srcX > tgtX && srcY==tgtY) {
			getMinimumSteps(--srcX, srcY, tgtX, tgtY, maze, ++distance, visited);
		}
		
		
		// SOURCE X IS LESS THAN TARGET x WHEN YS ARE SAME
		if(srcX<tgtX &&  srcY==tgtY) {
			getMinimumSteps(--srcX, srcY, tgtX, tgtY, maze, ++distance, visited);
		}
		
		// SOURCE Y IS BIGGER THAN TARGET Y when Xs are same
		if(srcY>tgtY && srcX==tgtX) {
			getMinimumSteps(srcX, --srcY, tgtX, tgtY, maze, ++distance, visited);
		}
		// source y is less then target Y when Xs are same
		if(srcY<tgtY && srcX==tgtX) {
			getMinimumSteps(srcX, ++srcY, tgtX, tgtY, maze, ++distance, visited);
		}
		
		
		// source X and source y are less than target x and target y
		if(srcX<tgtX && srcY<tgtY) {
			if(maze[srcX+1][srcY]==0) {
				maze[srcX+1][srcY]=1;
				getMinimumSteps(++srcX, srcY, tgtX, tgtY, maze, ++distance, visited);
			}
			else {
				--distance;				
			}
			
			if(maze[srcX][srcY+1]==0) {
				maze[srcX][srcY+1]=1;
				getMinimumSteps(srcX, ++srcY, tgtX, tgtY, maze, ++distance, visited);
			}
			else {
				--distance;
			}
		}
		
		
		// source X and source y are greater than target x and target y
		if(srcX>tgtX && srcY>tgtY) {
			if(maze[srcX-1][srcY]==0) {
				maze[srcX-1][srcY]=1;
				getMinimumSteps(--srcX, srcY, tgtX, tgtY, maze, ++distance, visited);
			}
			else {
				--distance;
			}
			
			if(maze[srcX][srcY-1]==0) {
				maze[srcX][srcY-1]=1;
				getMinimumSteps(srcX, --srcY, tgtX, tgtY, maze, ++distance, visited);
			}
			else {
				--distance;
			}			
		}

		return;
	}
	
	
	
	
   public int getDistance(int[][]maze,int startX,int startY, int tgtX, int tgtY) {
	   
	   
	   return -1;
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] maze = { {0,	 0,	 0,	 0 },
				          {0,	 1,	 0,  0 },
				          {1,	 1,	 0,  0 },
				          {0,	 0,	 0,  0 }
		};
		
		ShortestPathsInSpiral spiral = new ShortestPathsInSpiral();
		Set<String> visited = new HashSet<String>();
		 spiral.getMinimumSteps(3, 3, 0, 0, maze,0,visited);
		
	}

}
