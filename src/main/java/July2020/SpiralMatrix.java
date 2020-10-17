package July2020;

public class SpiralMatrix {

	
	public static void printTopRow(int begRow, int begCol,int endCol,int[][] matrix) {
		
		int[] rowArray = matrix[begRow];
		
		for(int i = begCol;i<=endCol-1;i++) {
			System.out.println(rowArray[i]);
		}		
	}
	
	public static void printLastColumn(int endCol, int begRow,int endRow,int[][] matrix) {

		for(int j = begRow;j<=endRow-1;j++) {
			System.out.println(matrix[j][endCol]);
		}		
	}

	public static void printLastRow(int endRow, int begCol,int endCol,int[][] matrix) {

		for(int k = begCol;k>=endCol+1;k--){
			System.out.println(matrix[endRow][k]);
		}		
	}	
	

	public static void printFirstColumn(int begCol, int begRow,int endRow,int[][] matrix) {

		for(int l = begRow;l>=endRow+1;l--){
			System.out.println(matrix[l][begCol]);
		}		
	}	
	
	
	
	public static void  printSpiralMatrix(int[][] matrix) {
		
		int begRow = 0;
		int endRow = matrix.length-1;
		int begCol = 0;
		int endCol = matrix[0].length-1;
		
		while(begRow<= endRow && begCol <= endCol) {
		    printTopRow(begRow, begCol, endCol, matrix);
			printLastColumn(endCol, begRow, endRow, matrix);
			printLastRow(endRow, endCol, begCol, matrix);
			printFirstColumn(begCol,endRow, begRow, matrix);
			begRow++;
			begCol++;
			--endRow;
			--endCol;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = { {1,2,3,4},
						   {5,6,7,8},
						   {9,10,11,12} };
		printSpiralMatrix(matrix);
		}
	
	

}
