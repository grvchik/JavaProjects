package April2020;

public class LongestCommonSubString {

	
	public static void findLongestCommonSubStr(String str1,String str2) {
		
		int cols = str1.length();
		int rows = str2.length();
		
		char[][] container = new char [rows][cols];
		
		char[] colArray = str1.toCharArray();
		char[] rowArray = str2.toCharArray();
		
		for(int i=0;i<colArray.length;i++) {
			char colch =colArray[i]; 
			for(int j=0;j<rowArray.length;j++) {
				char rowch =rowArray[j]; 
				if(rowch==colch) {
					container[j][i] = rowch;
				}				
			}			
		}
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<cols;i++) {
			
			for(int j=0;j<rows;j++) {
				if(Character.isLetter(container[j][i])) {
					
					while(j<rows && i<cols) {
						if(Character.isLetter(container[j][i])) {
							sb.append(container[j][i]);
						}
						else {
							sb.delete(0, sb.capacity());
							break;
						}
						j++;
						i++;
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
		findLongestCommonSubStr(str1, str2);
	}

}
