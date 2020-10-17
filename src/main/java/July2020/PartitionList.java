package July2020;

class ListNode{
	public int value;
	public ListNode next;
	public ListNode(int value) {
	   this.value = value;	
	}
	
	
}
public class PartitionList {

	
	public static void createList (int[] nums,int pivot) {
		
		ListNode sentilLessNode = new ListNode(-1);
		ListNode sentilMoreNode = new ListNode(-1);
		ListNode lessList = new ListNode(-1);
		ListNode morerList = new ListNode(-1);
		sentilLessNode= lessList;
		sentilMoreNode = morerList;
		
		for(int i=0;i<nums.length;i++) {
				if(nums[i]<pivot) {
					lessList.next = new ListNode(nums[i]);
					lessList = lessList.next;				
				}
				else {
					morerList.next = new ListNode(nums[i]);
					morerList = morerList.next;
				}
		}
		
		lessList.next = sentilMoreNode.next;
		
		System.out.println(sentilLessNode);
		System.out.println(sentilMoreNode);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6,3,2,4,5,8,7};
		createList(nums,6);
	}

}
