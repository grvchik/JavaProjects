package Mar2020;

public class NonDecreasingArray {


    public static boolean checkPossibility(int[] arr) {
            int counter = 0;
    
    for(int i=1;i<=arr.length-2;i++) {
    
     int prevElement = arr[i-1];
     int currElement = arr[i];
     int nextElement = arr[i+1];
     
     if(prevElement < currElement && currElement < nextElement) {
       continue;
     }
     else {
       ++counter;
     }
    }
    
    if(counter==1) return true;
    return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,5,6,10,7};
		boolean res = checkPossibility(nums);
		System.out.println(res);
	}

}
