package Nov2019;

public class TowerHopp {

	public int numberOfSteps(int curIndex,int [] nums,int distancdFromTail) {
		// base conditions
		if(nums[curIndex]>distancdFromTail-1 && curIndex>0) {
			return 0;
		}
		else if(nums[curIndex]<=distancdFromTail-1 && curIndex>0) {
			return -1;
		}
		else {
			int currMax = nums[curIndex];
			int maxIndex = curIndex;
			for(int i = curIndex+1;i<distancdFromTail;i++) {
				if(nums[i]>currMax) {
					currMax = nums[i];
		
				}
			}
			
			if(maxIndex==-1) {
				return -1;
			}
			else {
				maxIndex = maxIndex+currMax;
				return numberOfSteps(maxIndex, nums, distancdFromTail-maxIndex)+1;
			}
		}
	}
	

	public boolean isTowerHoppable(int []nums) {
		
		int numOfSteps = -1;
		
		numOfSteps = numberOfSteps(0, nums, nums.length);
		
		if(numOfSteps==0 || numOfSteps==-1) {
			return false;			
		}
		else {
			return true;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerHopp th = new TowerHopp();
		int nums[] = {2,2,0,0,2,0};
		System.out.println(th.isTowerHoppable(nums));
		
	}

}
