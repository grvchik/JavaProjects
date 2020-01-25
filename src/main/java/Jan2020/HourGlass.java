package Jan2020;

public class HourGlass {

	public static void calculateMaxSum(int[][] nums ) {
		
		if(nums==null || nums.length<=2) {
			return;
		}
		
		int rows = nums.length;
		int cols = nums[0].length;
		int max = 0;
		
	
		for(int row = 0;row<rows;row++) {
			
			if(row<1) {
				continue;
			}
			
			for(int col = 0;col<cols;col++) {
				
				if(col<1) {
					continue;
				}
				
			// if the element is 1 then check if it is an hourglass
				
				int aboveEl=0;
				int belowEl = 0;
				int aboveRd= 0;
				int belowRd=0;
				int aboveLd = 0;
				int belowLd = 0;
				if(row==3) {
					System.out.println(row);
				}
				if(nums[row][col]!=0) {					
					aboveEl = nums[row-1][col];
					if(row+1<=rows-1) {
						belowEl =  nums[row+1][col];
						belowLd =  nums[row+1][col-1];
						
					}
					
					
					if(row+1<=rows-1 && col+1<=cols-1) {
						belowRd =  nums[row+1][col+1];						
						aboveRd =  nums[row-1][col+1];
					}					
					aboveLd =  nums[row-1][col-1];
					
					if(aboveEl!=0 && belowEl!=0 && belowRd!=0 && belowLd!=0 && aboveRd!=0 && aboveLd!=0) {
						int sumSoFar = aboveEl+belowEl+belowRd+belowLd+aboveRd+aboveLd+nums[row][col];
						max = Math.max(sumSoFar, max);
					}					
					
				}// end of hourglass condition
				
				
			}
			
				
		}
		System.out.println(max);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[][]= 
			{
				
					{	1, 1, 1,  0,   0,    0},
					{	0, 1, 0,  0,   0,    0},
					{   1, 1, 1,  0,   0,    0},
					{   0, 9, 2,  -4, -4,    0},
					{   0, 0, 0,  -2,  0,    0 },
					{   0, 0, -1, -2, -4,    0 }};					
		
		
		calculateMaxSum(nums);	 
		}
				
	}


