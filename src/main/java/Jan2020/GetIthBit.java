package Jan2020;

public class GetIthBit {

	public static int getIthBit(int num,int index) {
		int movement = 1<<index;
		System.out.println(Integer.toBinaryString(movement));
		int res = movement & num;
		int finalR =  (res!=0?1:0);
		System.out.println(finalR);
		return finalR;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		getIthBit(number, 2);
	}

}
