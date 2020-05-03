package April2020;

public class MergeArrays {

	public static void mergeArrays(int[]big,int[]small) {
		
		int mergeIndex = big.length-1;
		int bigIndex =mergeIndex-small.length;
		int smallIndex = small.length-1;
				
		
		while(mergeIndex>=0 && bigIndex>=0 && smallIndex>=0) {
			//small tail value is bigger than big tail value
			if(big[bigIndex]<small[smallIndex]) {
				big[mergeIndex] = small[smallIndex];
				//since small value got a seat decrement it
				--smallIndex;
			}
			else {
				big[mergeIndex] = big[bigIndex];
				--bigIndex;
			}
			--mergeIndex;
		}
		
		System.out.println(big);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] big = {1,3,4,0,0,0};
		int [] small = {2,5,6};
		mergeArrays(big, small);
	}

}
