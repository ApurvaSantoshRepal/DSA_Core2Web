/*
8. Delete without head pointer

You are given a pointer/ reference to the node which is to be deleted from the linked list of N
nodes. The task is to delete the node. Pointer/ reference to the head node is not given.
Note: No head reference is given to you. It is guaranteed that the node to be deleted is not a tail
node in the linked list.
Example 1:
Input:
N = 2
value[] = {1,2}
node = 1
Output: 2
Explanation: After deleting 1 from the linked list, we have remaining nodes as 2.
Example 2:
Input:
N = 4
value[] = {10,20,4,30}
node = 20
Output: 10 4 30
Explanation: After deleting 20 from the linked list, we have remaining nodes as 10, 4 and 30.
Expected Time Complexity : O(1)
Expected Auxiliary Space : O(1)
Constraints:
2 <= N <= 10^3
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
