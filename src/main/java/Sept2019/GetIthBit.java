package Sept2019;

public class GetIthBit {

	public static int sumTwoNumbers(int first,int second) {
		if(second==0) {
			return first;
		}
		int xorResult = first^second;
		int andResult = first&second;
		
		int carry = andResult<<1;
		
		return sumTwoNumbers(xorResult,carry);
	}
	
	public static boolean getBit(int num,int i) {
		System.out.println(Integer.toBinaryString(num));
		int shiftedNum = 1<<i;
		String shiftedNumStr = Integer.toBinaryString(shiftedNum);
		System.out.println(shiftedNumStr);
		int andResult = num&shiftedNum;
		String andResultStr = Integer.toBinaryString(andResult);
		System.out.println(andResultStr);
		return(andResult!=0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = getBit(3, 1);
		int sum = sumTwoNumbers(2,3);
	}

}
