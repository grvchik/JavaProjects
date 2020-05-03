package Feb2020;

public class SpiralMMatrix {

	public static void spiralMatrix(int[][] nums ) {
		
		int begRow = 0;
		int endRow = nums.length-1;
		int begCol = 0;
		int endCol = nums[0].length-1;
		
		while(begRow<=endRow || begCol<=endCol) {
			System.out.println("b begRow"+begRow);
			System.out.println("b endRow"+endRow);
			System.out.println("b begCol"+begCol);
			System.out.println("b endCol"+endCol);		
			begRow++;
			endRow--;
			begCol++;
			endCol--;
			System.out.println("begRow"+begRow);
			System.out.println("endRow"+endRow);
			System.out.println("begCol"+begCol);
			System.out.println("endCol"+endCol);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[3][4];
		spiralMatrix(num);
	}

}
