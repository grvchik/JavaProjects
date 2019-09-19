package Sept2019;

import java.util.Arrays;

public class ArraySort2D {

	
	private static void reorder(int[][] grid, int i, int j) {
		int newVal = grid[i][j];
		for(int k = j+1; k<grid[0].length;k++) {
			if(grid[i][k] < newVal) {
				swap(grid, i, j, i, k);
				j=k;
			}
		}
	}

	private static void swap(int[][] grid, int i, int j, int ni, int nj) {
		int tmp = grid[i][j];
		grid[i][j] = grid[ni][nj];
		grid[ni][nj] = tmp;
	}

	private static int[] findMin(int[][] grid, int startI, int startJ) {
		int min = Integer.MAX_VALUE;
		int[] res = new int[2];
		res[1] = startJ;
		for(int i = startI;i<grid.length;i++) {
			if(min > grid[i][startJ]) {
				min = grid[i][startJ];
				res[0] = i;
			}
		}
		return res;
	}	
	
	public static void sort2DArray(int[][] input) {
		for(int i=0;i<input.length-1;i++) {
			for(int j=0;j<input[0].length;j++) {
				int[] min;
				if(j == 0)
					min = findMin(input, i, 0);
				else
					min = findMin(input, i+1, 0);
				if(input[i][j] > input[min[0]][min[1]]) {
					swap(input, i, j, min[0], min[1]);
					reorder(input, min[0], min[1]);
				}
				
			}
		}
		
	}
	

	
	   public static void rotateArray(int[][] grid,int begIndex,int endIndex) {
		   
		
		   int endCol = endIndex;

		   int begCol = begIndex;
		   int begRow = begIndex;
		   while(begCol<endCol){
			   
			int topLeft =     grid[begRow][begCol];
			int leftBotton =  (endCol==begCol+1?grid[endCol][begRow]:grid[endCol-begCol][begRow]);
			int rightBottom = (endCol==begCol+1?grid[endCol][endCol]:grid[endCol][endCol-begCol]);
		   
		    int topRight =    (endCol==begCol+1?grid[begRow][endCol]:grid[begRow+begCol][endCol]);
		    System.out.printf("top left-->"+topLeft);
		    System.out.printf("leftBotton-->"+leftBotton);
		    System.out.printf("rightBottom-->"+rightBottom);
		    System.out.printf("topRight-->"+topRight);
		    int temp = grid[begRow][begCol];
		    grid[begRow][begCol] = grid[begRow+begCol][endCol];
		    grid[begRow+begCol][endCol] = grid[endCol][endCol-begCol];
		    grid[endCol][endCol-begCol] = grid[endCol-begCol][begRow];
		    grid[endCol-begCol][begRow] = temp;
		    System.out.printf("top left-->"+topLeft);
		    System.out.printf("leftBotton-->"+leftBotton);
		    System.out.printf("rightBottom-->"+rightBottom);
		    System.out.printf("topRight-->"+topRight);	    
		    
//		    int temp =  grid[begRow][begCol];
//		    grid[begRow][begCol] = grid[begRow][endCol-begCol];
//		    grid[begRow][endCol-begCol] = grid[endCol-begCol][begCol];
//		    grid[endCol-begCol][begCol] = grid[endCol-begCol][begRow];
//		    grid[endCol-begCol][begRow] = temp;
			
		    ++begCol;
		   }   
		   
	   }
	   
	
		
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			
			int[][] grid = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}					
						};
			
			rotateArray(grid, 0, 3);
			rotateArray(grid, 1, 2);
			
			int[][] grid1 = {{ 5, 12, 17, 21, 23},
							{ 1,  2,  4,  6,  8},
			                {12, 14, 18, 19, 27},
			                { 3,  7,  9, 15, 25}};
			sort2DArray(grid1);
			for(int[] row : grid1)
				System.out.println(Arrays.toString(row));
			System.out.println("------------------------------");
			int[][] grid2 = {{ 1, 2, 3, 21, 23}, 
							{4, 5,  6,  8, 12,}, 
							{12, 14, 18, 19, 27}, 
							{7,  9, 15, 17, 25}};
			sort2DArray(grid2);
			for(int[] row : grid2)
				System.out.println(Arrays.toString(row));
		}
	

}
