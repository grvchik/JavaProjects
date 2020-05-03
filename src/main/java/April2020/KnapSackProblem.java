package April2020;

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
	public static int getBestPossibleValue(List<Item>itemList, int maxCapacity) {
		int [] capacityArray = new int[maxCapacity+1];
		
		for(int i=0;i<capacityArray.length;i++) {
			int currentCapacity = i;
			int maxValue=0;
			for(Item item: itemList) {
				if(currentCapacity>=item.weight) {
					int remaininingCapacity = currentCapacity-item.weight;
					int value = item.value+capacityArray[remaininingCapacity];
					maxValue = Math.max(maxValue, value);
				}
			}
			capacityArray[currentCapacity] = maxValue;
			
		}
		System.out.println(capacityArray[maxCapacity]);
		return capacityArray[maxCapacity];
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
		getBestPossibleValue(itemList, capacity);
	}

}
