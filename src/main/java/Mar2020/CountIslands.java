package Mar2020;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 
 * C:\Users\I813402\git\java.rest.backgroundJobs>
 * 
 * 
1 0 0 0 0
0 0 1 1 0
0 1 1 0 0
0 0 0 0 0
1 1 0 0 1
1 1 0 0 1
 * @author I813402
 *
 */




public class CountIslands {

	
	public static int countNumberOfIslands(int[][] container) {
		
		
		int rows = container.length;
		int cols = container[0].length;
		int counter=0;
		Set<String> visited = new HashSet<String>();
				
		for(int r=0;r<rows;r++) {
			
			for(int c=0;c<cols;c++) {
				if(container[r][c]==1) {
					bFSHelper(container, r, c);
					++counter;
				}
			}			
		}
		
		
		return counter;
	}
	
	
	public static void bFSHelper(int[][] matrix, int r,int c) {
		Queue<Integer> cellQueue = new LinkedList<Integer>();
		
		
		
		cellQueue.add(matrix[r][c]);
		while (!cellQueue.isEmpty()) {
			int top = cellQueue.poll();
			if(r<0 || c<0 && r>matrix.length && c>matrix[0].length) {
				continue;
			}
			
			if(matrix[r][c]==0) {
				continue;
			}
			
			matrix[r][c] = 0;
			if(r+1<matrix.length) {
				cellQueue.add(matrix[r+1][c]);	
			}
			if(r-1>=0) {
				cellQueue.add(matrix[r-1][c]);	
			}
			if(c+1<matrix[0].length) {
				cellQueue.add(matrix[r][c+1]);	
			}
			if(c-1>=0) {
				cellQueue.add(matrix[r][c-1]);	
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] container = {
				{1, 0, 0, 0, 0},
				{0, 0, 1, 1, 0},
				{0, 1, 1, 0, 0}
		};
		
		int islands = countNumberOfIslands(container);
		System.out.println(islands);
	}

}
