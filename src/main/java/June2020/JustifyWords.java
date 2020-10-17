package June2020;

public class JustifyWords {

	
	public static void justifyString (String[] words,int k) {
		int lengthCounter = 0;
		StringBuffer sb = new StringBuffer();
		int counter=0;
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			if(counter +word.length() >k) {
				sb.append("\n");
				--i;
				counter=0;
			}
			else {
				sb.append(word).append(" ");
				counter = counter+word.length()+1;
			}
		  
		}
		System.out.println(sb.toString());
	}
	
	
	public static void deleteCharAndAddWhiteSpace(StringBuffer sb, int deletionCount) {
		
		int length = sb.toString().length();

	
		
		while(deletionCount>=0) {
			 sb.append(" ");
			 --deletionCount;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String [] dictionary = {"Tere","siva","kisko","sochu","main","meri","soch","pe","tum","baithe","ho"};
	justifyString(dictionary, 10);
		
	}

}
