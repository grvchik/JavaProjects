package Jan2020;

public class SparseSearch {

	public static int getLocation(String item,int beg,int end,String[] strs) {
		int retItem = -1;
	   int mid = (beg + end)/2;
		while(beg<end) {
			
			String midStr = strs[mid];
			if(midStr.equalsIgnoreCase(item)) {
				retItem = mid;
				break;
			}
			while(midStr.isEmpty()) {
			 int left = mid-1;
			 int right = mid+1;
			 int leftRes = getLocation(item, beg, left, strs);
			 int rightRes = getLocation(item, right, strs.length-1, strs);
			 break;
			}
			
			if(item.equalsIgnoreCase(midStr)) {
				return mid;
			}
			else if(item.compareTo(midStr)<0) {
				return getLocation(item, mid+1, end, strs);
				
			}
			else{
				return getLocation(item, 0, mid-1, strs);
			}
		}
		
		return retItem;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"the","","","","bat","","ram","sham",""};
		String target = "ram";
		
		getLocation(target, 0, str.length-1, str);
	}

}
