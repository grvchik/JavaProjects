package Jan2020;

public class MergeSort {

	
	public static void mergeSort(int[] nums, int beg,int end) {

		if(end<2) {
			return;
		}
		
		int midPoint = (beg + end)/2;
		
		int []firstArray = new int[midPoint];
		int []secondArray = new int[end-midPoint];
		
		int index=0;
		for(int i=0;i<midPoint;i++) {
			firstArray[index++] = nums[i];
		}
		index=0;
		for(int i=midPoint;i<end;i++) {
			secondArray[index++] = nums[i];
		}
		
		
		mergeSort(firstArray, 0, firstArray.length);
		mergeSort(secondArray, 0, secondArray.length);
		
		mergeArrays(firstArray, secondArray);
		
	}
	
	
	public static int[] mergeArrays(int []arr1, int arr2[]) {
		
		int []retArray = new int[arr1.length+arr2.length];
		int retIndex=0;
		
		int firstBeg=0;
		int secondBeg = 0;
		int firstEnd = arr1.length;
		int secondEnd = arr2.length;
		
		while(firstBeg< firstEnd && secondBeg <secondEnd) {
			System.out.println("arr1 length"+arr1.length+" firstBeg"+firstBeg);
			
			if(arr1[firstBeg]<arr2[secondBeg]) {
			  retArray[retIndex++] = arr1[firstBeg];
			  firstBeg++;
			}
			else {
			  retArray[retIndex++] = arr2[secondBeg];
			  secondBeg++;
			}			
		}
		
		while(firstBeg<firstEnd) {
			 retArray[retIndex++] = arr1[firstBeg];
			 firstBeg++;
		}
		
		while(secondBeg<secondEnd) {
			 retArray[retIndex++] = arr2[secondBeg];
			 secondBeg++;
		}
		printArray(retArray);
		return retArray;
	}
	
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);	
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,4};
		int arr2[] = {3,6,7,8};
		
		int arr3[] = {8,6,7,4,2,3};
		mergeSort(arr3,0,arr3.length);
		mergeArrays(arr1, arr2);
	}

}
