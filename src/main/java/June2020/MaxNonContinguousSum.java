package June2020;

public class MaxNonContinguousSum {
public int maxSum=0;
	public static int getSumFromIndex(int fromIndex,int sum,int[] nums) {
		int newSum = 0;
		if(fromIndex<=nums.length-1) {
			newSum  = newSum + nums[fromIndex];
		}
		newSum = newSum +sum;
		if(fromIndex>nums.length-1) {
			return newSum;
		}
	
	
		return Math.max(getSumFromIndex(fromIndex+2,sum,nums),(getSumFromIndex(fromIndex+1,sum,nums)));
		
	}
	
	
	public static int findMaxSum(int[] nums) {
		
		int cache[] = new int[nums.length+1];
		if(nums.length<=2) {
			return Math.max(nums[0],nums[1]);
		}
		
		cache[0] = Math.max(0, nums[0]);
		cache[1] = Math.max(cache[0], nums[1]);
		System.out.println("cache[0] is "+cache[0] );
		System.out.println("cache[1] is "+cache[1] );
		int sum=0;
		for(int i=2;i<nums.length;i++) {
			sum = nums[i];
			int withSum = sum+cache[i-2];
			int withoutSum = cache[i-1];
			cache[i] = Math.max(withSum, withoutSum);
			System.out.println("cache["+i+"] is "+cache[i] );
		}
		
		return cache[nums.length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {5,2,2,5};
		//int newSum = getSumFromIndex(1, 0, nums);
		int newSum = findMaxSum(nums);
		System.out.println(newSum);
	}

}
