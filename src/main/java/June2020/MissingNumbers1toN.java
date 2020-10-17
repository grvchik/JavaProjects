package June2020;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers1toN {

  public static int[] getArrayOfMissingNumbers(int[] nums) {
	  
	  int maxLength = nums.length+2;
	  int missing[] = new int[2];
	  Set<Integer> missingNumnbersSet = new HashSet<Integer>();
 	  
	  for(int num:nums) {
		  missingNumnbersSet.add(num);
	  }
	  
	  while(maxLength>0) {
		  if(!missingNumnbersSet.contains(maxLength)) {
			  if(missing[0]==0) {
				  missing[0] = maxLength;
			  }
			  else {
				  missing[1] = maxLength;
			  }
		  }
		  --maxLength;
	  }
	  return missing;
  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,4,5,2};
		int missing[] = getArrayOfMissingNumbers(nums);
		System.out.println(missing);
	}

}
