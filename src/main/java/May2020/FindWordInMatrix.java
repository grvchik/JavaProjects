package May2020;

import java.util.HashSet;
import java.util.Set;

public class FindWordInMatrix {
	static int rows;
	static int cols;
	 public static boolean exist(char[][] board, String word) {
	        if(board==null||board.length==0||board[0].length==0) return false;
	        rows = board.length;
	        cols = board[0].length;
	        char[] wordArr = word.toCharArray();
	        for(int i = 0; i < rows; i++){
	            for(int j = 0; j < cols; j++){
	                if(search(board, wordArr, 0, i, j, word.length()))
	                    return true;
	            }
	        }
	        return false;
	    }	

	  private static boolean search(char[][] board, char[] wordArr
              , int index, int i, int j, int targetLen){
		 if(index == targetLen) return true;
	        if(i<0||i>=rows||j<0||j>=cols) return false;
	        if(board[i][j]!=wordArr[index]) return false;
	        board[i][j] = '*'; //set visited
	        if(search(board, wordArr, index+1, i-1, j, targetLen) ||
	            search(board, wordArr, index+1, i+1, j, targetLen) ||
	            search(board, wordArr, index+1, i, j-1, targetLen) ||
	            search(board, wordArr, index+1, i, j+1, targetLen)){
	            return true;
	        }
	        else{
	          //  board[i][j] = wordArr[index];
	            return false;
	        }
	    }	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] matrix = { {'A','B','C','E'},
							   {'S','F','C','S'},
							   {'A','D','E','E'}
		};
		
		String str = "ABCCED";
		boolean res = exist(matrix, str);
		System.out.println(res);
	//	findWordInMatrix(str, searching, matrix, visitedRowCols, 0, 0, 0);
	}

}
