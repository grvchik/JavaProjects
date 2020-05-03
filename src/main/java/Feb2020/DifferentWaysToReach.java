package Feb2020;

public class DifferentWaysToReach {

	public static void noOfWays(int[][] nums) {
		
	int sourceRow = 0;
	int sourceCol = 0;
	int targetRow = nums.length-1;
	int targetCol = nums[0].length-1;
	int[] ways = {0};
	findWays(sourceRow, sourceCol, targetRow, targetCol, ways);
	System.out.println(ways[0]);
	}
	
	public static void findWays(int sourceRow,int sourceCol,int targetRow,int targetCol,int[] ways) {
		
		if(sourceCol >targetCol ) {
			return;
		}
		
		if(sourceRow >targetRow ) {
			return;
		}
		
		
		if(sourceRow==targetRow && sourceCol==targetCol) {
			int currValue = ways[0];
			ways[0] = currValue+1;
			
		}
		System.out.println("Moving right"+sourceRow+","+sourceCol);
		
		findWays(sourceRow, ++sourceCol, targetRow, targetCol, ways);
		System.out.println("Moving down"+sourceRow+","+sourceCol);
		findWays(++sourceRow, sourceCol, targetRow, targetCol, ways);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twod = new int[3][4];	
		noOfWays(twod);
	}

}
