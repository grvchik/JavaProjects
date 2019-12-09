package Nov2019;

public class BuildCombinations {

	public void buildCombination(int begIndex,int startLeft,  int num) {
		  if(startLeft==num ) {     
		   return ;
		  }
		 
		  
		 
		 int endIndex = (num*2)-2;
		 for(int i=0;i<num;i++) {
			 char[] bracketArray = new char[num*2];
			 if(startLeft==endIndex) {
				 break;
			 }
			 bracketArray[begIndex] = '(';
			 bracketArray[startLeft] = '(';
			 bracketArray[endIndex] = '(';
			 --endIndex;
		 }
		 
		 buildCombination(begIndex,++startLeft,num);
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuildCombinations bc = new BuildCombinations();
		int num = 3;
		int endLeft = (2*num)-1;
		bc.buildCombination(0, 1,  num);
	}

}
