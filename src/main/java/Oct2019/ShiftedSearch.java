package Oct2019;
import java.io.*;
import java.util.*;
public class ShiftedSearch {
	




	  
	  static int shiftedArrSearch(int[] shiftArr, int num) {
	    // your code goes here
	  
	  int startIndex1 = 0;
	  int endIndex1 = -1;
	  int startIndex2 = -1;  
	  int endIndex2 =   shiftArr.length -1;
	 
	    for (int i=1;i<shiftArr.length;i++) {
	      int currentElement = shiftArr[i];
	      int prevElement = shiftArr[i-1];
	      if(prevElement > currentElement) {
	        endIndex1 = i-1;
	        startIndex2 = i;
	        break;
	      }
	      else {
	        continue;
	      }      
	    }
	    
	    int index = -1;
	    if(endIndex1==-1 || startIndex2==-1) {
	      endIndex1 = shiftArr.length -1;
	    }
	    
	     index = getIndex(shiftArr,startIndex1,endIndex1,num);
	    if(index==-1) {
	       index = getIndex(shiftArr,startIndex2,endIndex2,num);
	    }
	    System.out.println(index);
	    return index;
	  }

	  
	  
	  public static int getIndex(int[]arr, int beg, int end ,int num) {
	    
	  
	   
	    int mid = -1; 
	    while(beg <= end) {
	      
	      mid = (beg + end)/2;
	      if(arr[mid]> num ) {
	         end = mid-1;
	        System.out.println(" First Half beg"+beg+"end"+end);
	      }
	      else if(arr[mid]<num) {
	        beg = mid+1;
	           System.out.println(" Second  Half beg"+beg+"end"+end);
	      }
	 
	      else {
	     
	        return mid;
	      } 
	    }    
	    return -1;
	  }
	  
	  public static void main(String[] args) {
	    int[] shiftArr = {1,2};
	    int num = 2; 
	    shiftedArrSearch(shiftArr,2);
	  }

	}


	  
	 
	  

