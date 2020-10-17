package July2020;

public class LongestPandromicSubString {

	
	public static int longestPalndromicSubString(String str) {
		int[][] result = new int[str.length()][str.length()];
		
		char frontArray[]  = str.toCharArray();
		char backArray[] = str.toCharArray();
		boolean firstTimeIndex = false;
		int startIndex=-1;
		int cols = frontArray.length;
		int rows = backArray.length;
		int maxIndex = -1;
		
		int index = 0;
		for(int j = frontArray.length-1;j>=0;j--) {
			backArray[index++] = frontArray[j];
		}
		
		for(int i = 0;i<cols;i++) {
			
			for(int j = 0;j<rows;j++) {
				char frontChar = frontArray[i];
				char backChar = backArray[j];
				
				if(frontChar!=backChar) {
					continue;
				}
				
				if(i==0 || j==0) {
					result[j][i] =1;
				
					if(!firstTimeIndex) {
						firstTimeIndex = true;
						startIndex = rows-j;
					}
				
				}
		
				else {
					result[j][i] =result[j-1][i-1] +1;
				}
				maxIndex = Math.max(maxIndex, result[j][i]);
				
			}
		}
		System.out.println("startIndex"+startIndex);
		System.out.println("maxIndex"+maxIndex);
		return maxIndex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bananas";
		int length = longestPalndromicSubString(str);
		System.out.println(length);
	}

}
