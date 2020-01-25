package Oct2019;

public class WildCardMatching {

	public boolean doesMatchHappen(String pattern,String str) {
		 pattern = " "+pattern;
		 str = " "+str;
		 boolean resultMatrix[][] = new boolean[str.length()][pattern.length()];
		 
		 
		 // first populate first row and first column
		 
		 int rowLength = str.length();
		 int colLength = pattern.length();
		 boolean top,left,diagonal;
		 
		    for(int j = 0;j<colLength;j++) {
		    
		       // for each column scan whole string
		       
		       for(int i = 0;i< str.length();i++) {
		       
		          if(i==0 && j==0) {
		           resultMatrix[i][j] = true;
		          }
		          // first row                                                                    
		          else if(i==0 && j>0) {                                                         
		          resultMatrix[i][j] = false;
		          }
		          //first column
		          else if(j==0 && i>0) {
		          resultMatrix[i][j] = false;
		          }
		          
		          else {
		            char patternChar = pattern.charAt(j);
		            char inputStr =  str.charAt(j);
		            
		            if((i-1)>=0 && (j-1)>=0) {
		             diagonal = resultMatrix[i-1][j-1];
		            }

		            if(inputStr == patternChar || patternChar=='?') {
		              resultMatrix[i][j] = resultMatrix[i-1][j-1];
		            }
		            
		            else if(patternChar =='*') {
		              resultMatrix[i][j] = resultMatrix[j-1][i] || resultMatrix[j][i-1];
		            }
		            
		            }
		            // diagnoal neighbor
		            
		          }  // for loop  
		       }
		    return resultMatrix[str.length()-1][pattern.length()-1];
		    
		    }

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WildCardMatching wcMatch = new WildCardMatching();
		boolean res = wcMatch.doesMatchHappen("X?Y", "aAY");
		System.out.println(res);
	}

}
