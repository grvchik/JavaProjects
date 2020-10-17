package June2020;

public class CountSorts {

	
	public static int[] getSortedScores(int[] nums,int highestscore) {
		
		int[] placeholderArray = new int[highestscore+1];
		
		for(int i=0;i<nums.length;i++) {
			int score = nums[i];
			placeholderArray[score] = placeholderArray[score]+1;
		}
		
		
		//now iterate through original array and start putting the elements in the order
		// we receive from placeholder array and keep decrementing the counter
		int startIndex = 0;
		
		for(int j=0;j<placeholderArray.length;j++) {
			if(placeholderArray[j]>0) {
				nums[startIndex++] = j;
				placeholderArray[j] = placeholderArray[j]-1;
			}			
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {37,89,41,65,91,53};
		
		num = getSortedScores(num,91);
		System.out.println(num);
	}

}
