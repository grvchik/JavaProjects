package July2020;

public class WordExistence {
	
	
	
	public static boolean doesWordExists(char[][]dictionary,String word) {
		
		int rows = dictionary.length-1;
		int cols = dictionary[0].length-1;
		boolean[][] visistedArray = new boolean[dictionary.length][dictionary[0].length];	
		char[] wordArray = word.toCharArray();
		
		for(int i=0;i<=rows;i++) {
			
			for(int j = 0;j<=cols;j++) {
				
				if(dictionary[i][j]==wordArray[0]) {
					boolean res = doesNeighborExists(0, i, j, dictionary, visistedArray, wordArray);
					if (res) {
						return res;
					}
				}
				
			}
			
		}
		return false;
	}
	
	
	public static  boolean doesNeighborExists(int currIndex,int row,int col,char[][]dictionary ,
			boolean[][] visitedArray, char[] charArray){
		
		if(row>dictionary.length-1 || col >dictionary[0].length-1 || row<0 ||col<0) {
			return false;
		}
		
		if(visitedArray[row][col]==true) {
			return false;
		}
		
		if(currIndex==charArray.length-1 && charArray[currIndex]==dictionary[row][col]) {
			visitedArray[row][col]=true;
			return true;
		}
		
		if( charArray[currIndex]!=dictionary[row][col]) {
			
			return false;
		}
		visitedArray[row][col]=true;
		boolean left = doesNeighborExists(currIndex+1, row, col-1, dictionary, visitedArray, charArray);
		
		
		boolean down = doesNeighborExists(currIndex+1, row+1, col, dictionary, visitedArray, charArray);
		
		
		boolean right = doesNeighborExists(currIndex+1, row, col+1, dictionary, visitedArray, charArray);
		
		
		if(left==false && down==false && right==false) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] dictionary = {
					{'A','B','C','E'},
					{'S','F','C','S'},	
					{'A','D','E','E'}								
				};
		
		String word = "SEE";
		boolean[][] visistedArray = new boolean[dictionary.length][dictionary[0].length];
		boolean res= doesWordExists(dictionary, word);
		System.out.println(res);
		}
	

}
