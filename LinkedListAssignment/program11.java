/*
 

11. Insert in Middle of Linked List
Given a linked list of size N and a key. The task is to insert the key in the middle of the linked
list.
Example 1:
Input:
LinkedList = 1->2->4
key = 3
Output: 1 2 3 4
Explanation: The new element is inserted after the current middle element in the linked list.
Example 2:
Input:
LinkedList = 10->20->40->50
key = 30
Output: 10 20 30 40 50
Explanation: The new element is inserted after the current middle element in the linked list and
Hence, the output is 10 20 30 40 50.
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)
Constraints:
1 <= N <= 10^4



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
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;


	}	
	void insertMiddleOfLinkedList(int data){
		int nodeCount = countNode(head);
		int pos = 0;
		if (nodeCount % 2==0){
			pos = nodeCount/2;
		}
		else{
			pos = (nodeCount/2)+1;
		}

		Node newNode = new Node(data);
		Node temp = head;
		while(pos-1 !=0){
			pos--;
			temp=temp.next;
		}
		newNode.next = temp.next;
		temp.next= newNode;
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

		System.out.println("Enter the Element to insert middle of linked list");
		int data = sc.nextInt();
		sll.insertMiddleOfLinkedList(data);
		sll.printSLL();
		

	}
}
