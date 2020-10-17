package July2020;

public class StairCase {

	public static int getStairs(int number, int[] cache) {
		
		if(number<=3) {
			cache[number] = number;
			return cache[number];
		}
	

		if(cache[number]>0) {
			return cache[number];
		}
		
		cache[number] = getStairs(number-1, cache) + getStairs(number-2, cache);
		return cache[number];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 6;
		int[] cache = new int[number+1];
		
		int numbers = getStairs(number, cache);
		System.out.println(numbers);
	}

}
