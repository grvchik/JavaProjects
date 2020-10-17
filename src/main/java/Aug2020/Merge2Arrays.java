package Aug2020;

public class Merge2Arrays {

	public static int[] mergeArrays(int[] array1,int[] array2) {
		
		int [] result = new int[array1.length+array2.length];
		
		int index1 = 0;
		int index2 = 0;
		int combinedIndex=0;
		
		while(index1< array1.length && index2<array2.length) {
			if(array1[index1] <= array2[index2]) {
				result[combinedIndex] = array1[index1];
				index1++;			
			}
			else {
				result[combinedIndex] = array2[index2];
				index2++;			
			}
			combinedIndex++;
		}
		
		while(index1<array1.length) {
			result[combinedIndex] = array1[index1];
			index1++;
		}

		while(index2<array2.length) {
			result[combinedIndex] = array2[index2];
			index2++;			
		}
	
		System.out.println(result);
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
		
		mergeArrays(alicesArray, myArray);
	}

}
