package April2020;

public class StairCase {

	public static int getStairs(int nums) {
		
		int cache[] = new int[nums+1];
		
		return getStairsWithCache(nums, cache);
		
	}
	
	
	public static int getStairsWithCache(int number,int[]cache) {
		if(number<=3) {
			cache[number] = number;		
		}
		
		if(number==4) {
			cache[number] = 5;
		}
		
		if(cache[number]>0) {
			return cache[number];
		}
		
		cache[number] = getStairsWithCache(number-1, cache) +getStairsWithCache(number-2, cache);
		return cache[number];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = getStairs(5);
		System.out.println(res);
	}

}
