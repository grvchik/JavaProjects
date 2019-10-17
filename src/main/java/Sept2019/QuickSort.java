package Sept2019;

public class QuickSort {

	public static void quickSort(int[]arr,int beg, int end) {
		int pivot = (beg + end)/2;
		int low = beg;
		int high = end;
		 while(beg < end) {

			    if(arr[beg] > arr[pivot]) {
			       swapValues(arr,beg,pivot);
			      }
			    else {
			      ++beg;
			     }

			   if (arr[pivot]>arr[end]) {
			       swapValues(arr,end,pivot);
			    }
			   else {
			     --end;
			   } 
			 }

		     if(low+1 != beg ) {
		    	 quickSort(arr,low,beg);	 
		     }
			 
		     if(end+1 != high ) {
		    	 quickSort(arr,end,high); 
		     }
			
	}
	
	
	public static void swapValues(int[]array, int index1,int index2) {
		
		int temp = array[index1];
		 array[index1] =  array[index2];
		 array[index2] = temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input  = {9,3,8,7,6,5};
		quickSort(input, 0, input.length-1);
		System.out.println(input);
	}

}
