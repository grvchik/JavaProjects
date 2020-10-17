package July2020;

public class NoOfWays {
  public static int total=0;
	public static int getNoOfWays(int[][] matrix ,int row,int col,int[][] cache) {
		if(row<0 || col<0 ||row==matrix.length ||col==matrix[0].length) {
			return 0;
		}
		
		if(row==matrix.length-1 && col == matrix[0].length-1) {
			return 1;
		}
		
		if(cache[row][col]>0) {
			return cache[row][col];
		}
	 
		cache[row][col]= getNoOfWays(matrix,  row+1, col,cache)+getNoOfWays(matrix,  row, col+1,cache);
	 
		
	  
		
		return cache[row][col];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = new int[5][5];
		int[][] cache = new int[6][6];
		int num = getNoOfWays(nums,  0, 0,cache);
		System.out.println(num);
	}

}
