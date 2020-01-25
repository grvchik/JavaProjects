package Jan2020;

import java.util.LinkedList;
import java.util.Queue;

public class FormAWord {

	  public void  helper( Queue<String> newdict, String[] existingList, String dictionary) {
		  

		   if(dictionary.length()==0 || existingList.length==newdict.size()) {
		      return ;
		      
		      
		   }

		  
		   
		   for( int i=0;i<existingList.length;i++) {   
		    if(existingList[i].equals("")) {
		       continue;
		    }   
		     if(dictionary.startsWith(existingList[i])) {
		       newdict.add(existingList[i]);
		       dictionary = dictionary.substring(existingList[i].length());
		       existingList[i] = "";
		       break;
		     }   
		   }
		  
		  helper(newdict,existingList,dictionary);
		  		  
		  }
		  
		  

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String existingList[] = { "senyorita", "love" ,"i", "it","you","when","me","call"};
		String dictionary = "iloveitwhenyoucallmesenyorita";
		Queue<String> newSentence = new LinkedList<String>();
		FormAWord faw = new FormAWord();
		faw.helper(newSentence, existingList, dictionary);
		System.out.println(newSentence);
		
	}

}
