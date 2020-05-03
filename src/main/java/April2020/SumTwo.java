package April2020;

public class SumTwo {

	public static int getSum(int xorResult, int andResult) {
		if(andResult==0) return xorResult;
		System.out.println("===============");
		System.out.print(String.valueOf(xorResult));
		System.out.print(String.valueOf(andResult));
		System.out.println();
		int xorResultNew = xorResult^andResult;
		int andResultNew = xorResult&andResult;
		andResultNew = andResultNew<<1;
		
		return getSum(xorResultNew, andResultNew);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3;
		int num2 = 5;
		int res = getSum(num1, num2);
		System.out.println(res);
	}

}
