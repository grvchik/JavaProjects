package April2020;

public class ShiftingStrings {

	public static boolean isShiftingPossible(int shiftIndex,String str1,String str2) {
		if(shiftIndex>=str2.length()) {
			return str1.equals(str2);
		}
		
		if(!str1.equalsIgnoreCase(str2)) {
			String firstChar = String.valueOf(str1.charAt(0));
			String remainingStr = str1.substring(1);
			String newStr1 = remainingStr+firstChar;
			return isShiftingPossible(shiftIndex+1, newStr1, str2);
		}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2="acb";
		
		boolean res = isShiftingPossible(0, str1, str2);
		System.out.println(res);
	}

}
