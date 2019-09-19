package Sept2019;

public class UrliFy {

	public static String getURlifiedVersion(String str) {
		char whitespace = ' ';
		int lastIndexOfWhiteSpace = str.lastIndexOf(whitespace);
		StringBuilder sb = new StringBuilder();
		char strArr[] = str.toCharArray();
		
		for(int i=0;i<lastIndexOfWhiteSpace;i++) {
			
			if(Character.isWhitespace(strArr[i])) {
				sb.append("%20%");
			}
			else {
				sb.append(strArr[i]);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Cheetah Chingari ";
		System.out.println("First Length"+str.length());
		System.out.println(getURlifiedVersion(str));
	}

}
