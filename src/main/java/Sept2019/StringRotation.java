package Sept2019;

public class StringRotation {

	public static boolean isSubString(String s1,String s2) {
		
		StringBuilder s2Builder = new StringBuilder(s2);
		s2Builder.append(s2);
		
		if(s2Builder.indexOf(s1)!=-1) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "waterbottle";
		String str2 = "bottewater";
		boolean res = isSubString(str1, str2);
		System.out.println(res);
	}

}
