package July2020;

class NumberDetails  implements Comparable<NumberDetails>{
	public int length;
	public int value;
	public NumberDetails(int length,int value) {
		this.length = length;
		this.value = value;
	}
	@Override
	public int compareTo(NumberDetails o) {
		return this.length-o.length;		
	}
	
}

public class MaximumPossibleNumber {

	private int minLength;
	public int getMinLength() {
		return minLength;
	}


	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}


	public int getMaxLength() {
		return maxLength;
	}


	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}


	private int maxLength;
	
	
	
	public  void setMinMaxLimit(int[] nums) {
		int minLength = Integer.MAX_VALUE;
		int maxLength = Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			minLength = Math.min(minLength, String.valueOf(num).length());
			maxLength = Math.max(maxLength, String.valueOf(num).length());
		}
	   this.setMinLength(minLength);
	   this.setMaxLength(maxLength);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
