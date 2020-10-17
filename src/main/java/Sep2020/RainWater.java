package Sep2020;

public class RainWater {

	
	public static int calculateTrappedRainWater(int[] array) {
		
		boolean leftBoundaryFound = false;
		boolean rightBoundaryFound = false;
		int i=1;
		int leftIndex=0;
		int rightIndex = 0;
		int total = 0;
		while(i<=array.length-1) {
			
			// if current element is more than previous then
			// left index is current
			if(array[i]<array[i-1] ) {
				i++;
				continue;
			}
		 
			if(i>0 && array[i]>array[i-1]) {
				rightIndex = i;
			}
			
			
			// Valley ends
			boolean condition1 = i==array.length-1 && array[i]>array[i-1];  // last element reached
			boolean condition2 = i+1<=array.length-1 && array[i+1]<array[i]; // valley ends
			if(condition1 || condition2) {
				if(leftIndex+1<rightIndex) {
					total = total +calculateArea(array, leftIndex, rightIndex);
					leftIndex=i;
					rightIndex=i;
				}		
			}
			
			// found a valley
	
			
			
			i++;
		}
		return total;
	}
	
	
	public static int calculateArea(int[] array, int fromIndex, int toIndex) {
		
		int area = 0;
		// find minimumum height
		int height = Math.min(array[fromIndex], array[toIndex]);
		int width = toIndex - fromIndex;
		area = width*height;
		
		//subtract all the areas in between
		for(int i=fromIndex+1;i<=toIndex-1;i++) {
			
			area = area-array[i];
			
		}
		
		return area;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int board[] = {6,4,5,7,8,3};
		
		int area = calculateArea(board, 0, 2);
	
		int rainwatertrappend = calculateTrappedRainWater(board);
		System.out.println(rainwatertrappend);
	}

}
