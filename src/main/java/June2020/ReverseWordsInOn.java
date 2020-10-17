package June2020;

public class ReverseWordsInOn {

	
	public static void reverseWords(char[] message) {
		
		reverseMessage(message);
		
		//now reverse words
		
		int leftIndex = 0;
		int rightIndex = 1;
		
		while(rightIndex<=message.length-1) {
			if(Character.isWhitespace(message[rightIndex])){
				reversewordsInString(message,leftIndex,rightIndex-1);
			   leftIndex = rightIndex+1;
			}
			++rightIndex;
		}
		
		
	}
	
	public static void reversewordsInString(char[] message,int fromIndex,int toIndex) {

		char temp = 0;
		while(fromIndex<toIndex) {
			temp = message[fromIndex];
			message[fromIndex] = message[toIndex];
			message[toIndex] = temp;	
			++fromIndex;
			--toIndex;
		}
	
		
	}
	
	public static char[] reverseMessage(char[] message) {
		int leftIndex = 0;
		int rightIndex = message.length-1;
		char temp = 0;
		while(leftIndex<rightIndex) {
			temp = message[leftIndex];
			message[leftIndex] = message[rightIndex];
			message[rightIndex] = temp;		
			++leftIndex;
			--rightIndex;
		}
		return message;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] message ={'C','h','i','n','a', ' ', 'G','a','t','e', ' ','y','e',' ','r','a','h','a'};
		reverseWords(message);
		
	}

}
