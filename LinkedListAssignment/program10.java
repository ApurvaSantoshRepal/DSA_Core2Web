/*
10. Identical Linked Lists
Given two Singly Linked List of N and M nodes respectively. The task is to check whether two
linked lists are identical or not.
Two Linked Lists are identical when they have the same data and with the same arrangement
too.
Example 1:
Input:
LinkedList1: 1->2->3->4->5->6
LinkedList2: 99->59->42->20
Output: Not identical
Example 2:
Input:
LinkedList1: 1->2->3->4->5
LinkedList2: 1->2->3->4->5

Output: Identical
Constraints:
1 <= N <= 10^3
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)

*/

import java.util.*;
class Node {
	int data ;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
class SinglyLinkedList{
	Node head = null;
	//add
	void addNode(int data){
        	Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next= head;
			head=newNode;
		}
	}
	//print
	void printSLL(){
		if (head==null){
			System.out.println("Linnked List is Empty");
		}
		else {
			Node temp = head;
			while (temp.next != null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addNode(10);
		sll.addNode(20);
		sll.addNode(30);
		sll.addNode(40);
		sll.addNode(50);
		sll.addNode (60);
		sll.printSLL();
	}
}
