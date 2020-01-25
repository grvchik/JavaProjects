package Jan2020;

public class RegularExression {

	public boolean doesRegExMatch(String regex,String input) {
		
	
		regex = " "+regex;
		input = " "+input;
		boolean result[][] = new boolean[input.length()][regex.length()];		
		result[0][0] = true;
		
		char regExArray[] = regex.toCharArray();
		char inputCharArray[] = input.toCharArray();
		
		for(int i=0;i<result.length;i++) {
			if(i==5) {
				System.out.println("i is"+i);
			}
			
			for(int j=0;j<result[0].length;j++) {
				
				if(i==0||j==0) {
					result[i][j]=false;
					continue;
				}
				
				if(regExArray[j]==inputCharArray[i] || regExArray[j]=='.') {
					result[i][j]=true;
				}
				else if(regExArray[j]=='*') {
					result[i][j]= result[i-1][j-1]|| result[i][j-1];
				}
				else  {
					result[i][j]=false;
				}
			}
			
		}
		return result[result.length-1][result[0].length-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularExression regexObj = new RegularExression();
		String regex = "chor.b";
		String input = "choraaab";
		boolean res = regexObj.doesRegExMatch(regex, input);
		System.out.println(res);
		
	}

}
