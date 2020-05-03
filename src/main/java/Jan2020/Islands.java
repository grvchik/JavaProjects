package Jan2020;

import java.util.ArrayList;
import java.util.List;

public class Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = { { 1,0,0,1,0},
						 { 1,0,1,0,0},
						 { 0,0,1,0,1},
						 { 1,0,1,0,1}
		};
		int rows = nums.length;
		int cols = nums[0].length;
		printIsLands(nums, rows, cols);
	}

	 public static void printIsLands(int[][] nums,int rows,int cols) {
	        
	        List<Integer> islands = new ArrayList<Integer>();
	        int maxNumber = Integer.MIN_VALUE;
	        for (int row=0;row<rows;row++) {
	            
	            for(int col=0;col<cols;col++) {
	                if(row==1 && col==2) {
	                	System.out.println();
	                }
	                int element = nums[row][col];
	                int aboveNeighbor = 0;
	                int diagnoalLeft = 0;
	                int diaglonalRight = 0;
	                int leftNeighbor = 0;
	                // above neighbor
	                
	                if(element==0) {
	                    continue;
	                }
	              
	                
	                if(row-1>=0) {
	                    aboveNeighbor = nums[row-1][col];
	                }
	                // diagnoal left
	                if(row-1>=0 && col-1>=0) {
	                    diagnoalLeft = nums[row-1][col-1];
	                }
	
	                // diagnoal right
	                if(row-1>=0 && col+1<=cols-1) {
	                	diaglonalRight = nums[row-1][col+1];
	                }	                
	                
	                if(col-1>=0) {
	                    leftNeighbor= nums[row][col-1];
	                }
	                
	                
	                if(element>0) {
	                    int currSum = element +aboveNeighbor+diagnoalLeft+leftNeighbor+diaglonalRight;
	                    maxNumber = Math.max(currSum, maxNumber);
	                    nums[row][col] = maxNumber;
	                    if(!islands.contains(maxNumber)) {
	                    	islands.add(maxNumber);
	                    	
	                    }
	                    maxNumber = Integer.MIN_VALUE;
	                }
	                
	            }
	            
	        }
	        
	        
	       for (int i=0;i<islands.size();i++) {
	    	   System.out.print(islands.get(i)+" ");
	       }
	        
	        
	    }	
	
}
