package Dec2019;

public class UniqueString {

	public static boolean isUnique(String str) {
		
		int [] num = new int[256];
		
		char [] strChar = str.toCharArray();
		
		for(int i=0;i<strChar.length;i++) {
			int integerValue = strChar[i];
			
			if(num[integerValue]!=0) {
				return false;
			}
			else {
				num[integerValue] = 1;
			}
			
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "chamn";
		boolean res = isUnique(str);
		System.out.println(res);

	}

}
