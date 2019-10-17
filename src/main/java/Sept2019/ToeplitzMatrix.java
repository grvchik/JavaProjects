package Sept2019;

public class ToeplitzMatrix {

	public static boolean isTopelitxMatrix(int arr[][]) {
		
		int cols = arr[0].length;
		int rows = arr.length;
		int colLoopCounter=0;
		
		
		while(colLoopCounter<=cols-1) {
			
			 int rowLoopCounter = 0;
			 if(colLoopCounter==cols-1) {
				 break;
			 }
			 while(rowLoopCounter<=rows-1) {
				int colTemp = colLoopCounter;
			    int curElement = arr[rowLoopCounter][colLoopCounter];
			    
			   for(int j = rowLoopCounter+1;j<=rows-1;j++) {
			    int nextElement =  -1;
			     // check for boundary condition
			     ++colTemp;
			     if(colTemp<=cols-1) {
			        nextElement = arr[j][colTemp];
			        if(curElement!=nextElement) {
			           return false;
			        }
			     }
			     else {
			     	continue;
			     }
			   }
			 
			  ++rowLoopCounter;
			 }
			 
			 ++colLoopCounter;
			}

			return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowArray[][] = {
				{1,2,3,4},
				{5,1,2,3},
				{6,5,1,2}				
		};

		boolean res = isTopelitxMatrix(rowArray);
		System.out.println(res);
	}

}
