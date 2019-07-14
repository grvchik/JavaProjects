package July;

import java.util.ArrayList;
import java.util.Arrays;
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

	public static int getOptimalValue(List<Item> items, int capacity) {
		int[][] placeholderArray = new int[items.size()][capacity + 1];
		for (int[] v : placeholderArray) {
			Arrays.fill(v, -1);
		}

		return getOptimalValue(items, items.size() - 1, capacity, placeholderArray);
	}

	public static int getOptimalValue(List<Item> items, int index, int availableCapacity, int[][] placeHolderArray) {

		// exit condition
		if (index < 0) {
			return -1;
		}

		// Condition 1 with current item
		if (placeHolderArray[index][availableCapacity] == -1) {
			// witout index
			int withoutIndex = getOptimalValue(items, index - 1, availableCapacity, placeHolderArray);
		
			int withIndex   =  -1;
			if(availableCapacity < items.get(index).weight) {
				withIndex = 0;
			}
			else {
				withIndex =items.get(index).value + getOptimalValue(items, index - 1, availableCapacity - items.get(index).weight, placeHolderArray); 
			}
			 
			
			// get the maximum
			placeHolderArray[index][availableCapacity] = Math.max(withoutIndex, withIndex);
		}
		return placeHolderArray[index][availableCapacity];
		// Condition 2 without current item

	}

	public static void main(String g[]) {
		Item item1 = new Item(4, 1);
		Item item2 = new Item(2, 2);
		Item item3 = new Item(6, 7);
		Item item4 = new Item(8, 3);
		Item item5 = new Item(4, 9);
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(item1);
		itemList.add(item2);
		itemList.add(item3);
		itemList.add(item4);
		itemList.add(item5);

		int capacity = 10;

		int optimalValue = getOptimalValue(itemList, capacity);
		System.out.println(optimalValue);
	}

}
