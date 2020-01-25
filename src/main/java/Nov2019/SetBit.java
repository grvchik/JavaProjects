package Nov2019;

public class SetBit {
	
	public int setBit(int number,int pos) {
		System.out.println(Integer.toBinaryString(number));
		int shiftednumber = 1<<pos;
		System.out.println(Integer.toBinaryString(shiftednumber));
		int orResult = number | shiftednumber;
		System.out.println(Integer.toBinaryString(orResult));
		return orResult;
	}
	/** 1 0	1	0**/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetBit gb =new SetBit();
		int res = gb.setBit(5,1);
		System.out.println(res);
		
		
	}
}
