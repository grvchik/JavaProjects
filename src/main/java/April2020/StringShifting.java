package April2020;

public class StringShifting {

	public static boolean isRotationPossible(String str1,String str2) {
		
		String temp = str1+str1;
		
		if(temp.indexOf(str2)!=-1) {
			return true;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "acb";
		
		boolean res = isRotationPossible(str1, str2);
		System.out.println(res);
	}

}
