package Dec2019;

import java.util.ArrayList;
import java.util.List;

public class RiverSize {

public static List<Integer> getRiversSize(int[][] matrix) {
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		int  resultArray[][] = new int[rows][cols];
		List<Integer> res = new ArrayList<Integer>();
		resultArray[0][0] = matrix[0][0];
		int aboveNeighbor=0;
		int leftNeighbor =0; 
		int upperdiagonalNeighbor=0;
		for(int i = 0;i<rows;i++) {
			
			
			for(int j=0;j<cols;j++) {
				
				int currItem = matrix[i][j];
				
				if(currItem==0) {
					//check neighbor above if you are not in last row
					if(i-1>=0 ) {
						 aboveNeighbor = matrix[i-1][j];
					   if(aboveNeighbor>0) {
						   res.add(aboveNeighbor);
					   }	
					   
					 
					   if(j-1>=0 && i==rows-1) {
							   leftNeighbor = matrix[i][j-1];
							   if(leftNeighbor>0) {
								   res.add(leftNeighbor);
							   }
					   }						 
					
			
					   
					
					}
					
				}// if item is 0 then check if 1 exists above
				else {
					matrix[i][j] = matrix[i][j];
					//check above neighbor
					if(i-1>=0) {
						aboveNeighbor = matrix[i-1][j];
						
						if(aboveNeighbor>0) {
							matrix[i][j] +=aboveNeighbor;
						}						
					}					
					// check left neighbor
					if(j-1>=0) {
						leftNeighbor = matrix[i][j-1];
						if(leftNeighbor>0) {
							matrix[i][j] +=leftNeighbor;
						}
					}
					
				}
			}
			
		}
		
		return res;
	}
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][] = {
				    {1,0,0,1,0},
				    {1,0,1,0,0},
				    {0,0,1,0,1},
				    {1,0,1,0,1},
				    {1,0,1,1,0}};
				
		System.out.println(getRiversSize(matrix));
	}

}
