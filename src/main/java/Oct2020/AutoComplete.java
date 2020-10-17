package Oct2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;







class TrieNode {
	public Character prefix;
	public boolean isWord;
	
	public Map<Character,TrieNode> children;
	
	
	public TrieNode(Character pre) {
		this.prefix = pre;
		this.children = new HashMap<Character, TrieNode>();
	}
	
}

public class AutoComplete {

	
	public TrieNode root = null; 
	
	
	public AutoComplete() {
		this.root =  new TrieNode('*'); 
	}
	
	public void insertWordIntoTrie(TrieNode node,String word) {
		if(word.length()==0) {
			return;
		}
		char [] wordArray = word.toCharArray();
		TrieNode cur = node;
		TrieNode newNode = null;
		int curIndex = 0;
		char currentChar = '\0';
		while(word.length() > curIndex && cur.children.get(currentChar = word.charAt(curIndex))!=null) {					
			cur  =cur.children.get(currentChar);			
			curIndex++;
		}
			
		while(word.length() > curIndex) {
			currentChar = word.charAt(curIndex);
			curIndex++;
			newNode = new TrieNode(currentChar);
			if(curIndex==word.length()) {
				newNode.isWord=true;
			}
			cur.children.put(currentChar, newNode);
			cur = newNode;
		}
		
	}
	
	

	
	public int search( String val) {
		char currentChar = '\0';
		int curIndex = 0;
		TrieNode cur = this.root;
		int curDepth=0;
		while(val.length()>curIndex && cur.children.get(currentChar = val.charAt(curIndex))!=null) {
			++curDepth;
			++curIndex;
			cur = cur.children.get(currentChar);
		}
		
		if(curDepth>=0) {
			return curDepth;
		}
		return -1;
	}
	
	
	
	public void buildSearchResults(String str,List<String> results) {	
		char[] charra = str.toCharArray(); 
		root = root.children.get(charra[0]);
	    buildSearchResults(root, str, results);
	}
	
	
	public void buildSearchResults(TrieNode node,String str,List<String> results) {
		
		if( node.isWord==true) {
			
			results.add(str);
			return;
		}
		
		//children
		if(node.children!=null) {
			
			for(Map.Entry<Character, TrieNode> obj :node.children.entrySet()) {
				String key = obj.getKey()+"";
				TrieNode value = obj.getValue();
				buildSearchResults(value, str+key, results);
			}
		}
	}
	
	
	public void addWordsToTrie(List<String> words) {
		
		for(String word: words) {
			insertWordIntoTrie(root,word);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		AutoComplete acomp = new AutoComplete();
		List<String> wordList = new ArrayList<String>();
		wordList.add("Baazi");
		wordList.add("Bahu");
		acomp.addWordsToTrie(wordList);
		System.out.println(acomp.root);
		int depth = acomp.search("Ba");
		System.out.println(depth);
		List<String> res = new ArrayList<String>();
		acomp.buildSearchResults( "B",res);
		System.out.println(res);
	}

}
