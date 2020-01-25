package Oct2019;

public class MergeArrays {

	
public int[] mergeArrays(int [] arrLeft, int[] arrRight){	

int leftIndex = 0;
int rightIndex = 0;
int i = 0;

int arr[] = new int[arrLeft.length + arrRight.length];


while(leftIndex<arrLeft.length && rightIndex <arrRight.length) {



 
if(arrLeft[leftIndex] < arrRight[rightIndex]) {
  arr[i++] = arrLeft[leftIndex];
  ++leftIndex;
} 
else {
  arr[i++] = arrRight[rightIndex];
  ++rightIndex;
 }
}

while(leftIndex<=arrLeft.length-1) {
	arr[i++] = arrLeft[leftIndex++];
}

while(rightIndex<=arrRight.length-1) {
	arr[i++] = arrRight[rightIndex++];
}


System.out.println(arr);
return arr;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] left = {2,4,5};
		int[] right = {3,6,7,8};
		MergeArrays mergeArrays = new MergeArrays();
		mergeArrays.mergeArrays(left, right);
		
	}

}
