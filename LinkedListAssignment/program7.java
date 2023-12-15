/*
7. Swap Kth nodes from ends
Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the
beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not
change the content of the nodes.

Example 1:
Input:
N = 4, K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after swapping the 1st node from the beginning and end the
new list will be 4 2 3 1.

Example 2:
Input:
N = 5, K = 7
value[] = {1,2,3,4,5}
Output: 1
Explanation: K > N. Swapping is invalid. Return the head node as it is.
Expected Time Complexity: O(n)
Expected Auxiliary space Complexity: O(1)

Constraints:
1 <= N <= 10^3
1 <= K <= 10^3

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
