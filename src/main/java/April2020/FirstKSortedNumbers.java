package April2020;

import java.util.Comparator;
import java.util.PriorityQueue;

class NumberComparator implements Comparator<Integer>{
    public Integer number1;

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.intValue()-o1.intValue();
	}

	
}

public class FirstKSortedNumbers {

	public static void sortNumbers(int[] numbers,int k) {
		if(k>numbers.length) {
			throw new IllegalArgumentException();
		}
		PriorityQueue<Integer> heap = getPriorityQueue(numbers, k);
		
		int nums[] =  getArrayFromHeap(heap);
		System.out.println(nums);
	}
	
	public static int[] getArrayFromHeap(PriorityQueue<Integer> heap) {
		int [] nums = new int[heap.size()];
		
		for(int i=nums.length-1;i>=0;i--) {
			nums[i] = heap.poll();
		}
		
		return nums;
	}
	
	public static PriorityQueue<Integer> getPriorityQueue(int[] nums,int k) {
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k, new NumberComparator());
		
		for(int num:nums) {
			if(heap.size()<k) {
				heap.add(num);
			}
			else if(num< heap.peek()) {
				heap.poll();
				heap.add(num);
			}
		}
		return heap;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,9,3,12,1};
		int k = 3;
		sortNumbers(nums,k);
	}

}
