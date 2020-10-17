package Aug2020;

import java.util.HashMap;
import java.util.Map;

public class PerfectSquares {

	public static int perfectSquares(int number,Map<Integer,Integer> cacheMap) {
		if(number<=3) {
			return number;
		}
		
		int result = number;	
		for(int i=1;i<number;i++) {
			int temp = i*i;
			if(temp >number) {
				break;
			}
					
			if(cacheMap.get(number-temp)==null) {
				int temp2 = perfectSquares(number-temp, cacheMap);
				result = Math.min(result,temp2+1);
				cacheMap.put(number-temp, result);
			}
			else {
				result = cacheMap.get(number-temp);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 32;
		Map<Integer,Integer> cacheMap = new HashMap<Integer,Integer>();
		int res = perfectSquares(num,cacheMap);
		System.out.println(res);
	}

}
