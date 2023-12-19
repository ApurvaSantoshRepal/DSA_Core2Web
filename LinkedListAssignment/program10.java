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
	//count Node
	int countNode(Node head){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;

	}


	// isIdentical
	boolean isIdentical(Node sl1,Node sl2){
		int sl1Count = countNode(sl1);
		int sl2Count = countNode(sl2);
	
		if(sl1Count == sl2Count){
			Node h1 = sl1;
			Node h2 = sl2;
			while (h1 != null && h2 != null){
				if (h1.data != h2.data){
					return false;
				}
				h1 = h1.next;
				h2 = h2.next;

			}
			return true;



		}
		else{
			return false;
		}

	}

}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sl1 = new SinglyLinkedList();
		SinglyLinkedList sl2 = new SinglyLinkedList();
	        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of LL1");
		int s1 = sc.nextInt();
		System.out.println("Enter the size of LL2");
		int s2 = sc.nextInt();
		System.out.println("Enter data in LL1");
		for(int i= 1;i<= s1;i++){
			sl1.addNode(sc.nextInt());
		}
		System.out.println("Enter data in LL2");
		for(int i = 1;i<=s2;i++){
			sl2.addNode(sc.nextInt());
		}
		sl1.printSLL();
		sl2.printSLL();
		
		SinglyLinkedList sl3 = new SinglyLinkedList();
		boolean flag = sl3.isIdentical(sl1.head,sl2.head);
		if(flag){
			System.out.println("Linked List are identical");
		}
		else{
			System.out.println("Linked List are not identical");
		}
																																															 
	}
}
