package Feb2020;

public class MaximumStudents {

	 public static int maxStudents(char [][] seats) {
		 int retMax =0;
	        if(seats==null ||seats.length==0) {
	        	return retMax;
	        }
	       
	        int rows = seats.length;
	        int columns = seats[0].length;
	        
	        for(int i=0;i<=rows-1;i++) {
	        	
	        	for(int j=0;j<=columns-1;j++) {
	        		
	        		if(seats[i][j]=='.' && !isCheatingPossible(seats, i, j)) {
	        			++retMax;
	        		}	        		
	        	}	        	
	        }
	        
	        return retMax;
	        
	    }	
	
	 
	 public static boolean isCheatingPossible(char [][] seats,int currRow,int currCol) {
		 
		 
		 
		 char leftNeighbor= 's';
		 char topLeftNeighor = 's';
		 char rightNeighbor = 's';
		 char topRightNeighbor = 's';
		 
		//left neighbor is possible ? if yes then is the seat good if yes then return true
		 if(currCol-1>=0) {
			 leftNeighbor = seats[currRow][currCol-1];
			 if(leftNeighbor!='#') {
				 return true;
			 }
		 }
		 
			//right neighbor is possible ? if yes then is the seat good if yes then return true 
		 
		 if(currCol+1<=seats[0].length-1) {
			 rightNeighbor = seats[currRow][currCol+1];
			 if(rightNeighbor!='#') {
				 return true;
			 }
		 }	
		 
		 // top left
		 if(currCol-1>=0 && currRow-1>=0) {
			 topLeftNeighor = seats[currRow-1][currCol-1];
			 if(topLeftNeighor!='#') {
				 return true;
			 }		 
		 }
		 
		 
		 // top right
		 if(currCol+1<=seats[0].length-1 && currRow-1>=0) {
			 topRightNeighbor = seats[currRow-1][currCol+1];
			 if(topRightNeighbor!='#') {
				 return true;
			 }		 
		 }
		 
		 boolean condition1 = leftNeighbor=='s' || leftNeighbor=='#';
		 boolean condition2 = rightNeighbor=='s' || rightNeighbor=='#';
		 boolean condition3 = topLeftNeighor=='s' || topLeftNeighor=='#';
		 boolean condition4 = topRightNeighbor=='s' || topRightNeighbor=='#';
		 
		if(condition1 && condition2 && condition3 && condition4 ) {
			return false;
		}
		
		 return true;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] seating = {{'.','#'},
				            {'#','#'},
				            {'#','.'},
				            {'#','#'},
				            {'.','#'}};
		int output = maxStudents(seating);
		System.out.println(output);
		
	}

}
