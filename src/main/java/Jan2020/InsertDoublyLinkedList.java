package Jan2020;

import java.util.Scanner;


public class InsertDoublyLinkedList {
	static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        DoublyLinkedListNode tempNode = null;
        DoublyLinkedListNode sentil = new DoublyLinkedListNode(-1);
        boolean middleRecord = false;
        // 
        if(data<head.data) {
            tempNode = new DoublyLinkedListNode(data);
            return tempNode;
        }
        sentil.next = head;
        head.prev = sentil;
        while(head!=null) {
            if(head.next!=null && head.data<data && data<head.next.data) {
                
                tempNode = new DoublyLinkedListNode(data);
                DoublyLinkedListNode headPointer = head;
                DoublyLinkedListNode headPointerNext = head.next;
                tempNode.next =  headPointer.next;  
                headPointerNext.prev = tempNode;
                head.next = tempNode;
                tempNode.prev = head;
                middleRecord = true;         
            }
            else {
            	if( head.next==null && head.data<data) {
                    tempNode = new DoublyLinkedListNode(data);
                    tempNode.prev = head;
                    head.next = tempNode;
            	}
            }
            head = head.next;
        }

        
        return sentil;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListNode one = new DoublyLinkedListNode(1);
		DoublyLinkedListNode two = new DoublyLinkedListNode(3);
		DoublyLinkedListNode three = new DoublyLinkedListNode(5);
		
		one.next=two;
		two.prev=one;
		two.next=three;
		three.prev=two;
		
		DoublyLinkedListNode res = sortedInsert(one, 10);
		System.out.println(res);
	}

}
