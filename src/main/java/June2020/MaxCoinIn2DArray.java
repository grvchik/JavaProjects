package June2020;

public class MaxCoinIn2DArray {

	public static int getMaxCoins(int[][] nums) {
		
		int [][] resultArray = new int[nums.length][nums[0].length];
		
		int rows = nums.length;
		int cols = nums[0].length;
		resultArray[0][0] = nums[0][0];
		int maxValue = 0;
		
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<cols;j++) {
				
				if(i==0 && j>0) {
					resultArray[i][j] = nums[i][j]+resultArray[i][j-1];					
				}
	
				else if(j==0 && i>0) {
					resultArray[i][j] = nums[i][j]+	resultArray[i-1][j];					
				}				
				else if(i==0 &&j==0) {
					continue;
				}
				else {
					int topSum = nums[i][j]+	resultArray[i-1][j];
					int leftSum = nums[i][j]+resultArray[i][j-1];	
					resultArray[i][j] = Math.max(topSum, leftSum);
				}
				
			}//inner for
			
		}//outer for
		
		System.out.println(resultArray);
		return 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {    {0,3,1,1},
				            {2,0,0,4},
				            {1,5,3,1} };
	
	int res = getMaxCoins(nums);
	System.out.println(res);
	}
}
