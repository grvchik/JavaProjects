package July2020;

public class FindIndexAfterRotation {

	
	public static int findIndexOf(int element,int [] nums) {
		
		int distanceFromEnd = findRotaionFromEnd(nums);
		
		int elementAtRotationPoint = nums[nums.length-distanceFromEnd];
		
		int beg = 0;
		int end = nums.length-1;
		int mid = beg + (end-beg)/2;
		if(element < elementAtRotationPoint) {
			end = end-distanceFromEnd;
			System.out.println("end"+end);
		}
		else {
			beg = end-distanceFromEnd+1;
			System.out.println("beg"+beg);
			mid = (beg+end)/2;
			
			while(beg<=end) {
				
				if(nums[mid]==element) {
					return mid;
				
				}
				else if(nums[mid]<element) {
					beg = mid+1;
				}
				else {
					end = mid-1;
				}
				mid = (beg+end)/2;
				System.out.println("mid"+mid);
				
			}
		}
		return -1;
	}
	
	
	public static int findRotaionFromEnd(int [] nums) {
		
		int lastElIndex = nums.length-1;
		int returnIndex=0;
		while(lastElIndex>0) {
			++returnIndex;
			int currElement = nums[lastElIndex];
			int prevElement = nums[lastElIndex-1];
			if(currElement<prevElement) {
				return returnIndex;
			}
			--lastElIndex;
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {13,18,25,2,8,10};
		
		findIndexOf(8,nums);
	
		
	}

}
