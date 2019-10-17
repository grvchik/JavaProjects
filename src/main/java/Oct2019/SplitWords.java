package Oct2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SplitWords {

	public List<String> getWords(String inputString) {
		List<String> retList = new ArrayList<String>();
		
		int startIndex = 0;
		int wordlength = 0;
	
		for(int i=0;i<inputString.length();i++){
			char character = inputString.charAt(i);
			
			if(Character.isLetterOrDigit(character)) {
				if(wordlength==0) {
					startIndex = i;	
				}
				
				wordlength++;
			}
			else {
				// find substring using start index and word length
				String word = inputString.substring(startIndex, startIndex+wordlength);
				retList.add(word);
				wordlength=0;
			}
			
			
		}
		
		return retList;
	}
	
	
	
	public static void shuffleArray(int[] array) {
		if(array.length<-1) {
			return ;
		}
		
		for(int index = 0;index<=array.length-1;index++) {
	
			int randomIndex = getRandom(index, array.length-1);
			
			if(index!=randomIndex) {				
				int oldVal = array[randomIndex];				
				array[randomIndex] = 	array[index];
				array[index] =oldVal;				
			}
		}// for
		
		System.out.println(array);
	}
			
		
		
		
	
	
	
	public static int getRandom(int low,int high) {
		
		int floor = low;
		int ceiling = high - low+1;
		
		int res = new Random().nextInt(ceiling);
		
		return res+floor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "There is no time today. Milte Milte haseen";
		SplitWords swords = new SplitWords();
		swords.getWords(input);
		
		
		int arr[] = {3,4,5,2,7,8};
		shuffleArray(arr);
		
	}

}
