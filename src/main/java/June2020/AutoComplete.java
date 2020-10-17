package June2020;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;



class TrieNode {
	public String prefix;
	public boolean isWord;
	
	public Map<Character,TrieNode> children;
	
	
	public TrieNode(String pre) {
		this.prefix = pre;
		this.children = new HashMap<Character, TrieNode>();
	}
	
}
public class AutoComplete {

	public static TrieNode root;
	
	
	public static void insertWords(String[] dictionary) {
		root = new TrieNode("");
		for (String word: dictionary) {
			insertWord(word);
		}
	}
	public static List<String> getWordsForPre(String pre,String[] dict) {
		List<String> results = new LinkedList<String>();
		TrieNode curr = root;
		for(char c: pre.toCharArray()) {
			if(curr.children.containsKey(c)) {
				curr = curr.children.get(c);
			}
			else {
				return results;
			}
		}
		  findWordsFromTrie(curr,results);
		  return results;
	}
	
	
	public static void findWordsFromTrie(TrieNode curr,List<String> results ) {
		if(curr.isWord) {
			results.add(curr.prefix);
		
		}
		
	
		
		for( int i=0;i<curr.prefix.toCharArray().length;i++) {
			char ch =curr.prefix.toCharArray()[i];
			if(curr.children.containsKey(ch)) {
				curr = curr.children.get(ch);
			
				findWordsFromTrie(curr, results);
			}
		}
		
	}
	
	// Insert a word into the trie
	private static void insertWord(String s) {
	    // Iterate through each character in the string. If the character is not
	    // already in the trie then add it
		TrieNode curr =  root;
	    for (int i = 0; i < s.length(); i++) {
	    	System.out.println(s.charAt(i));
	        if (!curr.children.containsKey(s.charAt(i))) {
	        	if(i+1<=s.length()-1) {
	        		String nextStr = String.valueOf(s.charAt(i+1));
	        		 curr.children.put(s.charAt(i), new TrieNode(nextStr));
	        		 curr = curr.children.get(s.charAt(i));
	        	}
	           
	        }
	       
	        if (i == s.length() - 1) curr.isWord = true;
	    }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []dictionary = {"aaja","re" ,"aa", "zara" ,"aajdmi","abhimaan"};
	   insertWords(dictionary);
		List<String> words =	   getWordsForPre("aa", dictionary);
		System.out.println(words);
	}

}
