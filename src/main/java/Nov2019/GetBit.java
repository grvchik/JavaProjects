package Nov2019;

public class GetBit {

	
	
	public boolean getBit(int number,int pos) {
		
		return ((number & (1<<pos)) != 0);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetBit gb =new GetBit();
		boolean res = gb.getBit(5, 3);
		System.out.println(res);
		
		
	}

}
