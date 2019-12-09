package Nov2019;

/**
 * 1	0	1	0
 * 
 * 0	1	0	1
 * 
 * 0	1   0   0
 * ----------------
 * 1    1    1    
 * 1<<2
 * @author I813402
 *
 */
public class ClearBit {

	public int clearBit(int num, int pos) {
		
		System.out.println(Integer.toBinaryString(num));
		int oneMovement = 1<<pos;
		int negateOne = ~oneMovement;
		System.out.println(Integer.toBinaryString(oneMovement));
		System.out.println(Integer.toBinaryString(negateOne));
		System.out.println(Integer.toBinaryString(negateOne&num));
		return negateOne&num;
	}
	
	public static void main(String g[]) {
		ClearBit cb = new ClearBit();
		cb.clearBit(10, 1);
	}
}
