package Sept2019;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
public class SumLinkedLIsts {

	public static ListNode getSummedList(ListNode node1,ListNode node2) {
		
		Deque<Integer> firstList = new LinkedList<Integer>();
		Deque<Integer> secondList = new LinkedList<Integer>();
		
		while(node1!=null) {
			firstList.push(node1.val);
			node1 = node1.next;
		}

		while(node2!=null) {
			secondList.push(node2.val);
			node2 = node2.next;
		}
		
		int pow1Counter = 0;
		int pow2Counter = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		while(!firstList.isEmpty()) {
			if(firstNumber==0) {
				firstNumber = firstNumber + firstList.pop();	
			}
			else {
				firstNumber = getTensValue(pow1Counter)*firstList.pop()+ firstNumber;
			}
			++pow1Counter;
		}
		
		return getListFromnumber(firstNumber);
	}
	
	public static int getTensValue(int counter) {
		
		int res=10;
		
		int i=1;
		
		while(i<counter) {
			res = res*10;
			++i;		
		}
		return res;
		
	}
	
	public static ListNode getListFromnumber(int number) {
		ListNode sentil = new ListNode(-1);
		
		ListNode temp = null;
		
		if(number<10) {
			temp = new ListNode(number);
			return temp;
		}
		
		while(number>10) {
			
			int remainder = number%10;
			ListNode newNode = new ListNode(remainder);
			temp = sentil;
			sentil.next = newNode;
			
			number= number-remainder;
			number = number/10;
			sentil = sentil.next;
		}
		
		
		sentil.next = new ListNode(number);
		
		return temp;
	}
	
	public static ListNode removeDuplicates(ListNode list) {
		ListNode sentilNode = new ListNode(-1);
		
		ListNode retNode = null;
		Set<Integer> uniqueSet = new HashSet<Integer>();
		while(list!=null){
			if(retNode==null) {
				retNode = new ListNode(list.val);
				uniqueSet.add(list.val);
				sentilNode.next = retNode;
			}
			else {
				if (!uniqueSet.contains(list.val)) {
					retNode.next = new ListNode(list.val);
					retNode = retNode.next;
					uniqueSet.add(list.val);
				}
			}
			list = list.next;
		}
		
		return sentilNode.next;
	}
	
	
	
	public static boolean isPalindrome(ListNode node) {
		ListNode slow = node;
		ListNode fast = node;
		Set <Integer> uniqueSet = new HashSet<Integer>();
		while(fast!=null && fast.next!=null) {
			uniqueSet.add(slow.val);
			fast = fast.next.next;
			slow = slow.next;
		}
		
		System.out.println("slow"+slow);
		return false;
	}
	
	
	public static ListNode getNode(ListNode node,int k) {;
		
		getKthNode(node, k);
		
		return node;
		
	}
	
	

	public static int getSize(ListNode n) {
		
		ListNode temp = n;
		int size = 0;
		while(temp!=null) {
			temp = temp.next;
			++size;
		}
		
		return size;
	}
	
	public static ListNode getKthNodeIteratively(ListNode node, int k) {
		
		
		ListNode slowPointer = node;
		ListNode fastPointer = node;
		
		int count = 0;
		int n = getSize(node);
		while(count< (n-k)) {
			fastPointer = fastPointer.next;			
			++count;
		}
		
		// now move both pointers
		
		while(fastPointer!=null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
				
		return slowPointer;
		
	}
	
	
	public static int getKthNode(ListNode curr, int k) {

		// base case
		  if( curr == null) {
		    int counter = 0;
		    return counter;
		  }

		   int currValue =  1 + getKthNode(curr.next,k);
		   
		   if(currValue==k) {
			   System.out.println(k+"th to last node is"+curr.val);
		   }
		   
		   return currValue;	
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(4);
		ListNode n3 = new ListNode(3);
		ListNode nmiddle = new ListNode(5);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		nmiddle.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		//getSummedList(n1,n1);
		//removeDuplicates(n1);
		//isPalindrome(n1);
	//	ListNode node = getNode(n1,2);
		ListNode node = getKthNodeIteratively(n1, 2);
		System.out.println("node"+node);
		
	}

}
