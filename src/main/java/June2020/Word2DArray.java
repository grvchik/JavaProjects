package June2020;

public class Word2DArray {

	
	public static boolean doesWordExists(char[][] wordArray, String searchWord) {
		
		boolean visitedArray[][] = new boolean[wordArray.length][wordArray[0].length];
		
		for(int i=0;i<wordArray[0].length;i++) {
			for(int j=0;j<wordArray.length;j++) {
				if(wordArray[i][j]== searchWord.charAt(0) && doesWordExists(wordArray, searchWord, i, j, 0, visitedArray)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	public static boolean doesWordExists(char[][] wordArray,
										 String searchWord,
										 int row, int col,int index,boolean [][]visited) {
		
		if(row<0 ||col < 0 || row > wordArray.length-1 || col > wordArray[0].length-1) {
			return false;
		}
		
		if(index>=searchWord.length()-1) {
			return true;
		}
		
		if(wordArray[row][col]!=searchWord.charAt(index)) {
			return false;
		}
		visited[row][col] = true;
		if(doesWordExists(wordArray, searchWord, row+1, col, index+1, visited)) {
			return true;
		}
		if(doesWordExists(wordArray, searchWord, row-1, col, index+1, visited)) {
			return true;
		}		
		if(doesWordExists(wordArray, searchWord, row, col+1, index+1, visited)) {
			return true;
		}	
		if(doesWordExists(wordArray, searchWord, row, col-1, index+1, visited)) {
			return true;
		}	
		//visited[row][col] = false;
		return false;
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] word = {{ 'M' ,'A','C','H'},
				{'F', 'A','N','I'},
				{'G','K','G', 'K' }};
		boolean res = doesWordExists(word, "CHINA");
		System.out.println(res);
	}

}
