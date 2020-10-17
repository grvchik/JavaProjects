package Jan2020;

import java.util.regex.Pattern;

public class RegularExression {

	public boolean doesRegExMatch(String regex,String input) {
		
	
		regex = " "+regex;
		input = input;
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
		Pattern pt = Pattern.compile("[a-zA-Z]?_[a-zA-Z]?");
		String regex = "*._.*";
		String input = "a_Z";
		boolean res = regexObj.doesRegExMatch(regex, input);
		boolean res2 =pt.matcher(input).matches();
		System.out.println(res2);
		
	}

}
