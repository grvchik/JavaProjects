package April2020;

public class WordIn2DArray {

	public static boolean doesWordExists(char[][] wordArray,String searchWord) {
	
		boolean res[][] = new boolean[wordArray.length][wordArray[0].length];
		
		int rows = wordArray.length;
		int cols = wordArray[0].length;
		
		
		
		for(int i=0;i<rows;i++) {
		
			for(int j=0;j<cols;j++) {
				if(search(wordArray,i,j,searchWord,0,res)==true) {
					return true;
				}
			}			
		}
		
		
		return false;
	}
	
	
	public static boolean search(char[][] wordArray,
			int row,int col,String searchWord,
			int index, boolean[][] visited) {
	
		if(row< 0 || col < 0 || row > wordArray.length || col > wordArray[0].length ) {
			return false;
		}
		
		if(index>=searchWord.length()) {
			return true;
		}
		
		char currChar = searchWord.charAt(index);
		
		if (wordArray[row][col]!=currChar) {
			return false;
		}
		if(visited[row][col]==true) {
			return false;
		}
		
		visited[row][col] = true;
		
		if(search(wordArray, row+1, col, searchWord, index+1, visited)) {
			return true;
		}
		if(search(wordArray, row-1, col, searchWord, index+1, visited)) {
			return true;
		}
		if(search(wordArray, row, col+1, searchWord, index+1, visited)) {
			return true;
		}
		if(search(wordArray, row, col-1, searchWord, index+1, visited)) {
			return true;
		}
		visited[row][col] = false;
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char word[][] = {
		
		{'T','E','R','I'},
		{'G','A','L','I'},
		{'Y','A','A','N'}};
	
	  boolean res =  doesWordExists(word, "TERLA");
	  System.out.println(res);
	}

}
