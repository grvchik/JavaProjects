package June2020;

import java.sql.Timestamp;
import java.util.PriorityQueue;



class Item implements Comparable<Item> {
	public int valueIn;
	public static int pivot =10;
	public Item(int value) {
		this.valueIn = value;
	
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.valueIn-o.valueIn;
	}
}

public class PartitionList {

	public static int pivot;
	
	public static void partitionList(int[] nums) {
	  PriorityQueue<Item> pq = new PriorityQueue<Item>();	
	  for(int i=0;i<nums.length;i++) {
		  Item item = new Item(nums[i]);
		  pq.add(item);
	  }
	  
	  while(!pq.isEmpty()) {
		  System.out.println(pq.poll().valueIn);
	  }
	  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11,3,4,5,8,9,10,10,18};
		partitionList(nums);
	}

}
