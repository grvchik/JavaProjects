package Oct2019;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

 class WordMovement {
	
	public  int counter;
	public String currentWord;
	
	public WordMovement(String curWord,int count) {
		this.counter = count;
		this.currentWord = curWord;
	}
}

public class DictionaryWords {
	
	public  int getNumberOfMoves(String source,String target,String[] wordList) {
	
		List<String> strList = new LinkedList<String>(Arrays.asList(wordList));
		Deque<WordMovement> stack = new LinkedList<WordMovement>();
		WordMovement topElement = null;
		WordMovement wordMovement = new WordMovement( source,1);
		stack.push(wordMovement);
		
		while(!stack.isEmpty()) {
			
			 topElement = stack.peek();
			 if(topElement.currentWord.equalsIgnoreCase(target)) {
				 break;
			 }
			 topElement = stack.pop();
			String currentWord = topElement.currentWord;
			
			   for(int j=0;j<strList.size();j++) {	
				   String word = strList.get(j);
				if(this.isAdjacentWord(currentWord, word)) {
					WordMovement newWordMovement = new WordMovement(word, topElement.counter +1);
					System.out.println(topElement.currentWord+"->");
					stack.push(newWordMovement);
					strList.remove(j);
					j--;
				}				
			}
		}
	
		if( topElement!=null && topElement.currentWord.equalsIgnoreCase(target)) {
			return topElement.counter;
		}
		return -1;
	}
	
	
	
	
	
	
	public  boolean isAdjacentWord(String source,String targetWord) {
		
	char[] sourceArray = source.toCharArray();
		
		
		

		
		char[] targetArray = targetWord.toCharArray();
		int diffCounter = 0;
		for (int i = 0;i<sourceArray.length;i++) {
			int diff = sourceArray[i] - targetArray[i];
			if(diff!=0) {
				++diffCounter;
			}			
		}		
		
		if(diffCounter==1) {
			return true;
		}
	
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String wordList[] = {"pot","pom","bit","pit","tom","tog","dog" };
		String sourceWord = "but";
		String targetWord = "dog";
		DictionaryWords dw = new DictionaryWords();
		int moves = dw.getNumberOfMoves(sourceWord, targetWord, wordList);
		System.out.println(moves);
	}

}
