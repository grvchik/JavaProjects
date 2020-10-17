package May2020;

import java.util.ArrayList;
import java.util.List;

public class StringBreaker {

	public static List<String> getStringBreaked(String str, int k) {
		List<String> wordList = new ArrayList<>();
		String []  words = str.split(" ");
		StringBuilder sd = new StringBuilder(str.length());
		for(String word :words) {
			if(word.length()<=k) {
				sd.append(word);
			}
			else if( word.length()>k){
				continue;
			}
			
				wordList.add(sd.toString());
				sd.delete(0, sd.capacity());
			
		}
		return wordList;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yahin doobe din mere Yahin hote hain Savere";
		List<String> broken = getStringBreaked(str, 4);
		System.out.println(broken);
	}

}
