package Oct2020;

import java.util.ArrayList;
import java.util.List;



class Item {
	int value;
	int weight;

	Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
}
public class KnapSackProblem {

	public static int findBestPossibleValue(List<Item> itemList, int capacity) {
		
			int capacityArray[] = new int[capacity+1];	
			for(int i=0;i<capacityArray.length;i++) {
				int maxValue = 0;
				for(Item item : itemList) {
				    if(item.weight<=i) {
				    	int remainingCapacity = i-item.weight;
				    	int proposedValue = item.value;
				    	capacityArray[i] =  proposedValue+capacityArray[remainingCapacity];  
				    	maxValue = Math.max(capacityArray[i], maxValue);
				    }
			   }//items
				capacityArray[i] =maxValue;
			}			
		return capacityArray[capacity];	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item(1, 6);
		Item item2 = new Item(2, 10);
		Item item3 = new Item(3, 12);
		Item item4 = new Item(8, 3);
		Item item5 = new Item(4, 9);
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);

		int capacity = 21;
		int value = findBestPossibleValue(itemList, capacity);
		System.out.println(value);
	}

}
