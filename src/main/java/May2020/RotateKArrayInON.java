package May2020;

public class RotateKArrayInON {

	public static void reverseList(int[] num,int k) {
		
		reverseList(num, 0, k-1);
		reverseList(num, k,num.length-1);
		reverseList(num, 0,num.length-1);
	}
	
	
	public static void reverseList(int[] num,int from, int to) {
		
		while(from<to) {
			int temp = num[from];
			num[from] = num[to];
			num[to] = temp;
			from++;
			to--;
		}
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5,6};
		int k= 2;
		reverseList(num,k);
	}

}
