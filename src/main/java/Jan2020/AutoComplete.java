package Jan2020;

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

	public static TrieNode trie; 
	
	
	public static void buildTrie(String[] dict) {	
		 trie = new TrieNode("");
		for(String word :dict) {
			insertWordToTrie(word);
		}		
	}
	
	
	public static List<String> getWordsForPre(String pre,String[] dict) {
		  List<String> results = new LinkedList<String>();
		  
		
		  TrieNode curr = trie;
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
	
	
	public static void findWordsFromTrie(TrieNode cur, List<String> results){
		// base condition
		if(cur.isWord) {
			results.add(cur.prefix);
			return;
		}
		
		for(Character ch: cur.prefix.toCharArray()) {
			if(cur.children.containsKey(ch)) {
				cur = cur.children.get(ch);
				findWordsFromTrie(cur, results);
			}
		}
	}
	
	public static void insertWordToTrie(String word) {	
		TrieNode cur = trie;
		for(int i=0;i<word.length();i++) {			
			char ch = word.charAt(i);
			String post = word.substring(0,i+1);
			if(!cur.children.containsKey(ch)) {
				cur.children.put(ch, new TrieNode(post));
			}
			cur = cur.children.get(ch);
			
			if(i==word.length()-1) {
				cur.isWord = true;
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"dog","deer","deal"};
		buildTrie(str);
		List<String> words =  getWordsForPre("de",str);
		System.out.println(words);
		}

}
