package July2020;

public class CharacterCounter {

	public static String getDecodedVersion(String str) {
		
		int counter=1;
		char [] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer(str.length());
		char lastchar = '0';
		for(int i=0;i<charArray.length;i++) {
			if(i>0 && lastchar== charArray[i]) {
				
				++counter;
			}
			else if(i==0) {
				 lastchar = charArray[i];
				 continue;
			}
			else {
				
				sb.append(counter).append(lastchar);
				counter = 1;
				
			}
			 lastchar = charArray[i];
		}
		
		
			sb.append(counter).append(lastchar);
	
	
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAAABBBCCDA";
		String decoded = getDecodedVersion(str);
		System.out.println(decoded);
	}

}
