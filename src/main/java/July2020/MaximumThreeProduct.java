package July2020;

public class MaximumThreeProduct {

	
	public static int getProductOfThree(int[] nums) {
		
		int greater = nums[0];
		int greattwo = nums[0];
		int greatThtee = nums[0];
		
		for(int i=1;i<=nums.length-1;i++) {
			
			int curElement = nums[i];
			greater =Math.max(greater, curElement);
			greattwo = Math.max(greattwo, greater*curElement);
			if(i>=2) {
				greatThtee = Math.max(greatThtee, greattwo*curElement);
			}
			
		}
		return greatThtee;
	}
	
	public static void main(String g[]) {
	
		int[] nums = {-10,-10,5,2};
		int product = getProductOfThree(nums);
		System.out.println(product);
	}
	
}
