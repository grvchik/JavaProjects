package May2020;

public class LongestCommonSubString {

	public static void longestCommonSubString(String str1,String str2) {
		
		int rows = str1.length();
		int cols = str2.length();
		int minLength = Math.min(rows, cols);
		char [][] strCommon = new char[rows][cols];
		StringBuffer sb = new StringBuffer(minLength);
		for(int i=0;i<rows;i++) {
			char rowChar = str1.charAt(i);
			for(int j=0;j<cols;j++) {
				char colChar = str2.charAt(j);
				if (rowChar==colChar) {
					strCommon[i][j] =rowChar; 
					if(i==0 ||j==0) {
						sb.append(strCommon[i][j]);
					}
					else {
						if(Character.isLetter(strCommon[i][j]) ) {
							if(sb.length()==0) {
								sb.append(strCommon[i][j]);
							}
							else {
								if(Character.isLetter(strCommon[i-1][j-1])) {
									sb.append(strCommon[i][j]);
								}
								else {
									continue;
								}
							}
						}
						else {
							if(sb.length()>0) {
								sb.delete(0, sb.capacity());
							}
						}
					}
				}
			}
			
		}
		
		System.out.println(sb.toString());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="chamanraaj";
		String str2="manraaju";
		longestCommonSubString(str1, str2);
	}

}
