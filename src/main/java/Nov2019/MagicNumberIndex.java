package Nov2019;

public class MagicNumberIndex {

	public int getMagicIndex(int[]arr) {
		int high = arr.length-1;
		int low = 0;
		int mid = (low+high)/2;


while(low<=high) {
	mid = (low+high)/2; 
  // find the middle element
  int midElement = arr[mid];
  
  if(midElement < mid) {
  
    high = mid;
  }
  else if(midElement > mid) {
    low = mid;
  }
  
  if(midElement==mid) {
  
   return mid;
  }
}

return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,	3,	4,	4,	4,	5};
		MagicNumberIndex mgi = new MagicNumberIndex();
		int index = mgi.getMagicIndex(arr);
		System.out.println(index);
	}

}
