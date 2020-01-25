package Dec2019;

public class BalloonBursting {

	public static boolean canSafelyLand(int index, int[]nums) {
		
		if(index >=nums.length) {
			return true;
		}
		
		if(index==nums.length-1) {
			return getStatus(index, nums);
		}
		
		int prevIndex = index-1;
		int currIndex = index;;
		int nextIndex = index+1;
		
		if(prevIndex==0 ) {
			// if nextstep and one after next ar mines then return status from this one
			if(getStatus(nextIndex, nums)==false && getStatus(currIndex, nums)==false) {
				return true;
			}			
		   // else
			
			else  {
				if(!getStatus(nextIndex, nums)) {
					return true;
				}
				else if(!getStatus(currIndex, nums)) {
					return true;
				}
				else {
					return false;
				}
						
			}
		}
		else if((getStatus(nextIndex, nums) || getStatus(currIndex, nums))) {
				return canSafelyLand(nextIndex, nums);
			}		
		else {
			return false;
		}
		
}	
	
	
	
	private static boolean getStatus(int index,int[]nums) {
		if(nums[index]==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,0,1,1,0,1,0,1};
		boolean res = canSafelyLand(1, nums);
		System.out.println(res);
		
	}

}
