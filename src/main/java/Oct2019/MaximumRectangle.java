package Oct2019;

public class MaximumRectangle {

/**
 *  0	0	1
 *  
 *  0	0	1	
 * 
 * 
 * @param nums
 */
	
	public static void printGreaterRectangle(int[][] nums) {
		int rows = nums.length;
		int cols = nums[0].length;
		int length=0;
		int width=0;
		int x=0;
		int y=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(nums[i][j]==0) {
					x=i;
					y=j;
					 length = getLength(i,j,nums);
					 width = getWidth(i,j,nums);
					break;
				}
			}
			if(length>0||width>0) {
				break;
			}
		}	
		
		
		System.out.println("Co-ordinate is: x="+x+",y="+y);
		System.out.println("Length is "+length);
		System.out.println("Width is "+width);
		
		
	}
	
	
	public static int getWidth(int row,int col,int[][] nums) {
		int rows = nums.length;
		int width=0;
		for(int j=row;j<rows;j++) {			
			int element = nums[j][col];
			if(element==0) {
				++width;
			}
			else {
				break;
			}
			
		}
		return width;
	}
	
	public static int getLength(int row,int col,int[][] nums) {
		
		int [] rowArray = nums[row];
		int length =0;
		
		for(int i= col;i<rowArray.length;i++) {
			
			if(rowArray[i]==0) {
				++length;
			}
			else {
				break;
			}
		}
		
		return length;
	}
	
	
	public static void printGreatestRectangle2(int[][] nums) {
		
		int rows = nums.length;
		int cols = nums[0].length;
		int maxlength=0;
		int maxwidth = 0;
		String topLeftCoordinate = "";
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
			// case for 1st row or 1st column
			 if(i==0 ||j==0) {
			    if(nums[i][j]==0) {
				 if(topLeftCoordinate.equals("")) {
					topLeftCoordinate  = "Coordinate is x:"+i+" and y:"+j;
                                 }
				
				

				// check for top neighbor
				 if((i-1)>=0 && nums[i-1][j]==0) {
					 maxwidth = maxwidth + 1;
				 
				 }	
				// check for left neighbor

				 if((j-1)>=0 && nums[i][j-1]==0) {
					  maxlength= maxlength + 1;	
				 }	

                }
			    else {
				continue;
			    } // 			
				
			 } // end case for 1st row and column		.p
			 
			else {

				System.out.println("i="+i+",j="+j);
			    if(nums[i][j]==0) {
				 if(topLeftCoordinate.equals("")) {
					topLeftCoordinate  = "Coordinate is x:"+i+" and y:"+j;
                                 }

				

				// check for top neighbor
				 if(nums[i-1][j]==0) {
					 if(i+1>maxwidth) {
						 maxwidth = maxwidth + 1;	 
					 }
					 
				 
				 }	
				// check for left neighbor

				 if( nums[i][j-1]==0) {
					 if(j +1 >maxlength) {
						 maxlength= maxlength + 1;	 
					 }					 	
				 }	

                }	
			
			    else {
					// check for top neighbor and left neighbor
					 if( nums[i-1][j]==0 && nums[i][j-1]==0 ) {
						 
						 maxlength= Math.max(maxlength,maxwidth);
						 maxwidth=0;
					 }	
			    }	
			 }



			}// inner for
		}// outer for
		
		System.out.println("maxlength "+maxlength);
		System.out.println("maxwidth  "+maxwidth );
		System.out.println("topLeftCoordinate    "+topLeftCoordinate   );

	}// end of method

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {0},
				        {0},
				        {0}
				         }; 

		printGreaterRectangle(arr);
	}
}
