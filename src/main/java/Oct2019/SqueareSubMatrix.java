package Oct2019;

public class SqueareSubMatrix {

	
public static int squareSubMatrix(int [][] arr)	{

	int max =0;
	int rows =arr.length;
	int cols = arr[0].length;
	int cache[][] = new int[rows][cols];
	for(int i = 0;i<rows;i++){
		
	   for(int j = 0;j<cols;j++){

		if(i==0 ||j==0) {
		 cache[i][j] = arr[i][j];	
		 System.out.println("cache formed at"+i+ " and "+j+" "+cache[i][j]);
		  continue;
		}

		if(arr[i][j]==1) {
		  //
		 System.out.println("row: "+i+" col:"+j);
		 System.out.println("cache[i-1][j]"+cache[i-1][j]);
		 System.out.println("cache[i][j-1]"+cache[i][j-1]);
		 System.out.println("cache[i-1][j-1]"+cache[i-1][j-1]);
			
		  cache[i][j] = Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1]);
		  max = Math.max(max, cache[i][j]);
		
		}
	   }
	} 
	return  max;
} 
	   
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{0,1,1,1},
				{0,1,1,0},
				{0,1,1,1},
		};
		int res = squareSubMatrix(arr);
		System.out.println("res"+res);
		}
	}


