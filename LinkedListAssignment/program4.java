/*
4.Doubly linked list Insertion at given position
Given a doubly-linked list, a position p, and an integer x. The task is to add a new node with
value x at the position just after p

th node in the doubly linked list.

Example 1:
Input:
LinkedList: 2<->4<->5
p = 2, x = 6
Output: 2 4 5 6
Explanation: p = 2, and x = 6. So, 6 is inserted after p, i.e, at position 3 (0-based indexing).
Example 2:
Input:
LinkedList: 1<->2<->3<->4
p = 0, x = 44
Output: 1 44 2 3 4
Explanation: p = 0, and x = 44 . So, 44 is inserted after p, i.e, at position 1 (0-based indexing).
Expected Time Complexity : O(N)
Expected Auxiliary Space : O(1)

Constraints:
1 <= N <= 10^4
0 <= p < N
*/


import java.util.*;
class Node {
	int data ;
	Node next=null;
	Node prev = null;
	Node(int data){
		this.data=data;
	}
}
class DoublyLinkedList{
	Node head = null;
	//add
	void addFirst(int data){
        	Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		
		}
		else{
			newNode.next= head.next;
			head.prev=newNode;
			head=newNode;

	
		}
	}
	void addLast(int data){
		Node newNode = new Node(data);
		if (head==null){
			head= newNode;
		
		}

		else{

			Node temp = head ;
			while (temp.next != null){
				temp = temp.next;
				
				
			}
		       temp.next=newNode;
		       newNode.prev=temp;
		}
	}


	//print
	void printDLL(){
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
	int countNode(){
		Node temp = head;
		int count =0;
		while (temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	void addAtPos(int pos,int data){
		if(pos<0 || pos>=countNode()){
			System.out.println("Wrong Input");
		}
		else if (pos==countNode()-1){
			addLast(data);
		}
		else{
			Node temp= head;
			Node newNode= new Node(data);
			while(pos != 0){
				pos--;
				temp=temp.next;
			}
			newNode.next=temp.next;
			newNode.prev=temp;
			newNode.next.prev=newNode;
			temp.next=newNode;
		}



	}
}
class Client {
	public static void main (String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of Doubly Linked List");
		int N = sc.nextInt();
		System.out.println("Enter Elemets in Linked List");

		for(int i=1;i<=N;i++){
			dll.addLast(sc.nextInt());
		}

		dll.printDLL();
		System.out.println("Enter Pos: ");
		int pos = sc.nextInt();
		System.out.println("Enter data ");
		int data = sc.nextInt();

		dll.addAtPos(pos,data);
		dll.printDLL();
	}
}
