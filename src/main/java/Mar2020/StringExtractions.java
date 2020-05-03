package Mar2020;

public class StringExtractions {

	
	public static void main(String g[]) {
		String returnMessage = "{ message:  \"Job already exists\", }";
		
		int messageLength = "message".length()+1;
		int messageIndex = returnMessage.indexOf("message");
	
		if(messageIndex!=-1) {
			System.out.println(returnMessage.substring(messageLength+messageIndex));
		}
		
	}
	
}
