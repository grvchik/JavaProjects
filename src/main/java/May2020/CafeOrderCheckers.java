package May2020;

import java.util.PriorityQueue;

public class CafeOrderCheckers {

	public static void buildProperFCFS(int[] cafeOrders,int[] dineInOrders) {
		
		int cafeLength = cafeOrders.length-1;
		int dineInLength = dineInOrders.length-1;
		
		int cafeIndex=0;
		int dineIndex=0;
		int finalArray[] = new int[cafeLength+dineInLength];
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		int finalIndex=0;
		while(cafeIndex<=cafeLength && dineIndex<=dineInLength) {
			if(cafeOrders[cafeIndex]< dineInOrders[dineIndex]) {
				finalArray[finalIndex] = cafeOrders[cafeIndex];
				cafeIndex++;
			}
			else {
				finalArray[finalIndex] = dineInOrders[dineIndex];
				dineIndex++;
			}
		
			finalIndex++;
		}
		
	  printArray(finalArray);
	}
	
	public static void printArray(int[]array) {
		for(int num:array) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cafeArray = {1,3,4,6,8,9};
		int[] dineArray = {2,5,7};
		buildProperFCFS(cafeArray, dineArray);
	}

}
