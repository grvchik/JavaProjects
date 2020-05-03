package Feb2020;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DoubleExists {

	  public static boolean checkIfExist(int[] arr) {
		  Set<Integer> arraySet = new  HashSet<Integer>();
		  
		  if(arr==null && arr.length==0) {
			  return false;
		  }
		  
		  for(int num:arr) {
			  arraySet.add(num);
		  }
		  
		  Iterator<Integer> arrayIter = arraySet.iterator();
		  while(arrayIter.hasNext()) {
			  Integer val = arrayIter.next();
			  Integer doubleVal =val*2;
			  if(arraySet.contains(doubleVal)) {
				  return true;
			  }
		  }
		  return false;
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {7,1,14,11};
		System.out.println(checkIfExist(num));
	}

}
