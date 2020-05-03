package Oct2019;

public class MergeSort {


public void mergeSort(int[] num, int length) {
   if(length <2) {
   	return;
    }

   int midPoint = length/2;	

   int remainingLength = length - midPoint;  

   int first[] = new int[midPoint];
   int second[] = new int[remainingLength]; 

  for(int i=0;i<first.length;i++) {
	  first[i] =  num[i];
  }
  int k=0;
  for(int j=first.length;j<length;j++) {
	  second[k++] = num[j];
  }
   
  mergeSort(first,midPoint);
  mergeSort(second,remainingLength );

  merge(first,second,num, midPoint,remainingLength) ; 
}



public void merge(int[] first,int[] second,int[] num, int firstLength,int secondLength) 
{
int i=0;
int j=0;
int k=0;
while(i<=firstLength-1 && j<=secondLength-1) {
 if(first[i]<second[j]) {
   num[k++] = first[i];
   i++;
 }
 else {
   num[k++] = second[j];
   j++;
 } 
}

// put remaining into the main
while(i<firstLength) {
  num[k++] = first[i];
  i++;
 }

while(j<secondLength) {
  num[j] = second[j];
  j++;

 }



}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {4,3,2,8};
		MergeSort ms = new MergeSort();
		ms.mergeSort(nums, nums.length);
		
	}

}
