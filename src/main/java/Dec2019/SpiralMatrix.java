package Dec2019;

public class SpiralMatrix {

	
	public static void spiralToLinear(int[][] input) {
		
		int begRow = 0; 
		int begCol = 0;
		int endRow = input.length;
		int endCol = input[0].length;
		
		boolean centerReached = false;
		int arrayIndex = 0;
		int[] output = new int[endRow*endCol];
		
		endRow = endRow-1;
		endCol = endCol-1;
		
	  // get the top row
		while(begCol<endCol || begRow < endRow) {
			if(begCol+1==endCol) {
				for(int i= begCol;i<=endCol;i++) {
					output[arrayIndex++] = input[begRow][i];
				}			
			}
			else {
				for(int i= begCol;i<endCol;i++) {
					output[arrayIndex++] = input[begRow][i];
				}			
			}

			if(arrayIndex>=output.length-1) {
				break;
			}
			
		
		  // get the last column
			if(begRow+1==endRow) {
				for(int j=begRow;j<=endRow;j++) {
					output[arrayIndex++] = input[j][endCol];
				}			
			}
			else {
				for(int j=begRow;j<endRow;j++) {
					output[arrayIndex++] = input[j][endCol];
				}			
			}
	
			if(arrayIndex==output.length-1) {
				break;
			}	
		  // get the bottom row
			for(int k=endCol;k>0;k--) {
				output[arrayIndex++] = input[endRow][k];
			}
		
		  // get the first column	
			
			for(int l=endRow;l>begRow;l--) {
				output[arrayIndex++] = input[l][begCol];
			}
			
			endCol--;
			begRow++;
			endRow--;
			begCol++;			
		}

		printArray(output);
		
		
		
	}
	
	
	
	
	public static void printArray(int[] output) {
		for(int num:output) {
			System.out.print(num);	
		}				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] input = { {1,2,3,4},{10,11,12,5},{9,8,7,6}};
		
		spiralToLinear(input);
	}

}
