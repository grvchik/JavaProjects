package Feb2020;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	static long countInversions(int[] arr) {
		int mid = arr.length/2;
		Long inversions = 0L;
		List<Long> inversion = new ArrayList<Long>();
		inversion.add(0L);
		mergeSort(arr, arr.length, inversion);
		System.out.println("Inversion-->"+inversion.get(0));
		return inversion.get(0);
	}
	
	static void mergeSort(int[]nums,int length,List<Long> inversion) {
		if(length<2) {
			return ;
		}
		
	  int midPoint = length/2;
	  int[] firstArray = new int[midPoint];
	  int[] secondArray = new int[length-midPoint];
	  
	  int r = 0;
	  for(int i=0;i<=midPoint-1;i++) {
		  firstArray[r++] = nums[i];
	  }
	  r=0;
	  for(int j=midPoint;j<=length-1;j++) {
		  secondArray[r++] = nums[j];
	  }
	  
	  long inversionC = inversion.get(0)+1;
	  inversion.set(0, inversionC);
	  mergeSort(firstArray, midPoint,inversion);
	   inversionC = inversion.get(0)+1;
	  inversion.set(0, inversionC);
	  
	  mergeSort(secondArray, length-midPoint,inversion);
	  merge(firstArray, secondArray, nums);
	}
	
	public static void merge(int[] arr1,int []arr2,int []res) {
		
		int arr1Beg=0;
		int arr2Beg = 0;
		int arr1End = arr1.length;
		int arr2End = arr2.length;
		int k=0;
		while(arr1Beg<arr1End && arr2Beg<arr2End) {
			if(arr1[arr1Beg]<=arr2[arr2Beg]) {
				res[k++] = arr1[arr1Beg];
				++arr1Beg;
			}
			else {
				res[k++] = arr2[arr2Beg];
				++arr2Beg;
			}
		}
		
		
		while(arr1Beg<arr1End) {
			res[k++] = arr1[arr1Beg];
			++arr1Beg;
		}

		while(arr2Beg<arr2End) {
			res[k++] = arr2[arr2Beg];
			++arr2Beg;
		}
		printArray(res);
	}
	
	
	public static void printArray(int[] res) {
		for(int num:res) {
			System.out.print(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {1,2};
		int arr2[] = {3,4};
		int res[] = {3,2,1,4};
		countInversions(res);
		
		
	}

}
