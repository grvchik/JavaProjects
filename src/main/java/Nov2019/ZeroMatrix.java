package Nov2019;

public class ZeroMatrix {

	
public void makeAllRowsColsZero(int[][] matrix) {
	int targetRow = -1;
	int targetCol = -1;
	boolean foundMatch = false;

	for(int row = 0; row<matrix.length;row++) {
	  for (int col = 0; col < matrix[0].length;col++) {
	  
	  	if(matrix[row][col] == 1) {
	  		targetRow = row;
	  		targetCol = col;
	  	   foundMatch = true;
	  	   break;  	
	  	}
	  }
    }  //for
	
	if(foundMatch && targetRow!=-1 && targetCol!=-1) {
		makeRowCol(targetRow, targetCol, matrix);
	}
}

	
	
	public void makeRowCol(int row,int col, int[][] matrix) {

	    for(int i=0;i<matrix.length;i++) {    
	      matrix[i][col] = 1;    
	    }


	    for(int j=0;j<matrix[0].length;j++) {    
	      matrix[row][j] = 1;
	    }


	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] array= {{ 0,0,1},{0,0,0},{0,0,0}};
       ZeroMatrix zm = new ZeroMatrix();
       zm.makeAllRowsColsZero(array);
	}

}
