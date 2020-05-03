package Jan2020;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import Nov2019.TowerHopp;

public class LengthCommonSubstring {

	public static int getMinimumString(String str1,String str2) {

		Set<Integer> rowSet  = new HashSet<Integer>();
		Set<Integer> columnSet  = new HashSet<Integer>();
		int res=0;
		char [] char1Arr = str1.toCharArray();
		char [] char2Arr = str2.toCharArray();
		
		int rows = char1Arr.length;
		int cols = char2Arr.length;
		int [][] results = new int[rows][cols];
		
		
		int lastRow=0;
		int lastCol=0;
		for(int row=0;row<rows;row++) {
			
			
			for(int col=0;col<cols;col++) {
			
				if(char1Arr[row]==char2Arr[col] ) {
					// check if this row was processed earlier
					// if not then set the value of cell to 1
					if(!rowSet.contains(row) && !columnSet.contains(col)) {
						// check if rowset is not empty 
						// if empty then set this value
						if(rowSet.size()==0) {
							results[row][col]=1;
							lastRow=row;
							lastCol = col;
							rowSet.add(row);
							columnSet.add(col);
						}
						else {
							// if earlier cell is right of this cell mark it invalid ,delete from set
							// and put value as 1
							// in else condition increase the value
							
							if(row>=lastRow && col>=lastCol) {
								rowSet.add(row);
								columnSet.add(col);
							}
							else {
								rowSet.remove(lastRow);
								rowSet.remove(lastCol);
								rowSet.add(row);
								rowSet.add(col);
							}

							lastRow = row;
							lastCol = row;
							results[row][col]=rowSet.size()+1;							
						}						
					}
					else {
						//check if this column was also already processed
						if(columnSet.contains(col)) {
							break;	
						}
						else {
							if(columnSet.size()==0) {
								results[row][col]=1;
							}
							else {

								// if earlier cell is right of this cell mark it invalid ,delete from set
								// and put value as 1
								// in else condition increase the value
								
								if(row>=lastRow && col>=lastCol) {
									rowSet.add(row);
									columnSet.add(col);
								}
								else {
									rowSet.remove(lastRow);
									columnSet.remove(lastCol);
									rowSet.add(row);
									columnSet.add(col);
								}

								lastRow = row;
								lastCol = row;
								results[row][col]=columnSet.size()+1;							
								
							}
						}
					}
				}
			}
			
			res  = Math.max(rowSet.size(), columnSet.size());

		}
		
		
		System.out.println(res);
		return res;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMinimumString("shinchan","nohara");
	}

}
