package Jan2020;

public class CountMovement {

	
	public int countMovement(String orig,String dest) {
		
		char origArray[] = orig.toCharArray();
		char targArray[] = dest.toCharArray();
		int result[][] = new int[orig.length()][dest.length()];
		int count=0;
			
		for(int row=0;row<result.length;row++) {
			
			for(int col = 0;col<result[0].length;col++) {
				
				if(row!=col && row>0 && col>0) {
					 int firstMax = Math.max(result[row-1][col],result[row][col-1]);
					 result[row][col] = Math.max(firstMax,result[row-1][col-1]);
					
				}
				else  {
					// column source
					// row targer
					if(orig.charAt(col)==dest.charAt(row)) {
						if(row>0 && col>0) {
							 result[row][col] =  result[row-1][col-1] ;	
						}
					}
					else {
						if(row==0 || col==0) {
							 result[row][col] = 1;
						}
						else {
							 result[row][col] =  result[row-1][col-1] +1;
						}
						
					}
				}
			}
			
		}
		
		return result[orig.length()-1][dest.length()-1] ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source ="raman";
		String dest = "gamand";
		CountMovement cm = new CountMovement();
		int begIndex=0;
		int min = Integer.MAX_VALUE;
		if(dest.length()>source.length()) {
			int diff = dest.length()-source.length();
			while(begIndex<=diff) {
				String destSub = dest.substring(begIndex,begIndex+source.length());
				int count = cm.countMovement(source, destSub);
				min = Math.min(min, count);
				begIndex++;
			}
			
		}
		else if(dest.length()<source.length()) {
			
		}
		else {
			
		}
		int ret = cm.countMovement(source, dest);
		System.out.println(ret);
		
	}

}
