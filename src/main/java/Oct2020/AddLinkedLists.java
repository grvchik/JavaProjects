package Oct2020;



public class AddLinkedLists {

	public static LinkedList addTwoLists(LinkedList l1,LinkedList l2) {
		LinkedList sentilNode = new LinkedList(-1);
		LinkedList constr = sentilNode;
		
		int carry=0;
		int sum=0;
		while(l1!=null && l2!=null) {
			
			sum = l1.value+l2.value;
			
			
			if(carry>0) {				
				
				sum= sum+carry;
				
			}
			
			if(sum/10>0) {
				carry = sum%10;
				sum = sum/10;
			}

			constr.next = new LinkedList(sum);
			sum=0;
			constr = constr.next;	
			
			l1 = l1.next;
			l2 = l2.next;
		}
		
		
		boolean enterInOne = false;
		while(l1!=null) {
			enterInOne = true;
			sum = sum+carry+l1.value;
			constr.next = new LinkedList(sum);
			constr = constr.next;	
			l1 = l1.next;
			
		}

		
		while(l2!=null) {
			enterInOne = true;
			sum = sum+carry+l2.value;
			constr.next = new LinkedList(sum);
			constr = constr.next;	
			l2 = l2.next;
		}		
		
		if(!enterInOne && carry>0) {
			constr.next = new LinkedList(carry);
			
		}
		
		return sentilNode.next;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1a = new LinkedList(3);
		LinkedList l1b = new LinkedList(1);
		LinkedList l1c = new LinkedList(4);
		
		l1a.next = l1b;
		l1b.next = l1c;
		
		LinkedList l2a = new LinkedList(7);
		LinkedList l2b = new LinkedList(0);
		LinkedList l2c = new LinkedList(9);

		l2a.next = l2b;
		l2b.next = l2c;
		LinkedList res = addTwoLists(l1a,l2a);
		System.out.println(res);
	}
	// TODO Auto-generated method stub

	
	
}
