package Aug2020;

import java.util.HashMap;
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
	
	
	public static void insertWordInTrie(String word) {
		TrieNode cur = root;
		
		for(int i=0;i<word.length();i++) {
			char pre = word.charAt(i);
			String post = word.substring(i+1,i+2);
			if (!root.children.containsKey(pre)) {
				root.children.put(pre, new TrieNode(post));
			}
			cur = root.children.get(word.charAt(i));
			if(i==word.length()-1) {
				cur.isWord = true;
			}
		}
		
	//	traverseTrie(cur);
		System.out.println("traversal");
	}
	
	public static void traverseTrie(TrieNode cur) {
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "chaman";
		root = new TrieNode("");
		insertWordInTrie(str);
	}

}
