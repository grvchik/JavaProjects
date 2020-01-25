package Jan2020;

import java.util.Arrays;

public class OverlappingRoom {

	
	public static int findMinRooms(int[][] classes) {
		
		int[] firstArray = new int[classes.length];
		int[] secondArray = new int[classes.length];
		
		for(int i=0;i<classes.length;i++) {		
			int rowArray[] = classes[i];
			firstArray[i] = rowArray[0];
			secondArray[i] = rowArray[1];		
		}
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		
		int counter = 0;
		for(int i=1;i<firstArray.length;i++) {
			++counter;
			int currX = firstArray[i];
			int currY = secondArray[i];
			int prevX = firstArray[i-1];
			int prevY = secondArray[i-1];
			
			boolean condition1  = (currX > prevX && currX<prevY);
			boolean condition2  = (currY> prevX && currY<prevY);
			
			if(condition1 || condition2) {
				--counter;
			}
			
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] rooms = { {30,75},{0,50},{80,150}};
		int num = findMinRooms(rooms);
		System.out.println(num);
		
	}

}
