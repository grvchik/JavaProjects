package Nov2019;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountedCompleter;

public class CountRectangles {
	Set<String> countCombinations = new HashSet<String>();
	public void helper(int[][] nums, int begcol,int begrow,int endcol,int endrow) {
		if(begcol==endcol || begrow==endrow) {
			System.out.println("Ending the iteration");
			return;
		}
		
		if(begcol<0 || endcol<0 || begrow<0 ||endrow<0) {
			return;
		}

		if(begrow==nums.length || begcol==nums[0].length 
			|| endrow==nums.length || endcol==nums[0].length ) {
			return;
		}
		
		if((begrow-1)>=0 &&  begcol<endcol)  {
			if(begrow==3) {
				System.out.println("stop here");
			}
			System.out.println("begrow:"+begrow+",begcol:"+begcol);
			System.out.println("endrow:"+endrow+",endcol:"+endcol);
			countCombinations.add("begrow:"+begrow+",begcol:"+begcol+"endrow:"+endrow+",endcol:"+endcol);
			helper(nums,begcol,--begrow,endcol,endrow);
			// once this is done call helper on remaining matrix
		
			helper(nums,begcol,++begrow,--endcol,endrow);
			
			helper(nums,++begcol,++begrow,++endcol,endrow);
			
			helper(nums,--begcol,begrow,--endcol,--endrow);
			
			helper(nums,++begcol,begrow,++endcol,--endrow);
		}
	}
	
	public int getSize() {
		return this.countCombinations.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coordinates[][] = { {0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		CountRectangles rect = new CountRectangles();
		
		rect.helper(coordinates,0,2,3,0);
		System.out.println(rect.getSize());
	}

}
