/*
9. Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with
duplicate values) from the given list (if exists).

Note: Try not to use extra space. The nodes are arranged in a sorted way.
Example 1:
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time. So we need
to remove it once.
Example 2:
Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation: In the given linked list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5
times. So we need to remove any four 2.
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)
Constraints:
1 <= Number of nodes <= 10^5
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
	void removeDuplicates(){
             Node curr = head;
	     while (curr != null){
		     Node temp = curr;
		     while(temp != null && curr.data==temp.data){
			     temp = temp.next;
		     }
		     curr.next = temp;
		     curr=temp;
	     }
	}

}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Linked List");
		int size = sc.nextInt();
	        System.out.println("Enter Elements in Linked List");
		for (int i= 1;i<=size;i++){
			sll.addNode(sc.nextInt());
		}

		sll.printSLL();
		System.out.println("After remove duplicate elements:");
		sll.removeDuplicates();
		sll.printSLL();

	}
}
