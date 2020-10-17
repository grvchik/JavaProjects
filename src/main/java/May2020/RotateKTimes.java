package May2020;

public class RotateKTimes {

	public static void rotateKtimes(int[] num,int k) {
		
		for(int i=1;i<=k;i++) {
			rotateOneTime(num);
		}
		System.out.println(num);
	}
	
	public static void rotateOneTime(int[] num) {
		int first = num[0];
		for(int i=0;i<=num.length-2;i++) {
			num[i] = num[i+1];			
		}
		num[num.length-1] = first;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,3,4,5,6};
		rotateKtimes(nums, 2);
	}

}
