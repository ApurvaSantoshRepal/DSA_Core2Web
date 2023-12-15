/*
3.Linked List Insertion
Create a link list of size N according to the given input literals. Each integer input is
accompanied by an indicator which can either be 0 or 1. If it is 0, insert the integer in the
beginning of the link list. If it is 1, insert the integer at the end of the link list.
Hint: When inserting at the end, make sure that you handle NULL explicitly.
Example 1:
Input:
LinkedList: 9->0->5->1->6->1->2->0->5->0
Output: 5 2 9 5 6
Explanation:
Length of Link List = N = 5
9 0 indicated that 9 should be inserted in the beginning. Modified
Link List = 9.
5 1 indicated that 5 should be inserted in the end. Modified Link
List = 9,5.
6 1 indicated that 6 should be inserted in the end. Modified Link

List = 9,5,6.
2 0 indicated that 2 should be inserted in the beginning. Modified
Link List = 2,9,5,6.
5 0 indicated that 5 should be inserted in the beginning. Modified
Link List = 5,2,9,5,6.
Final linked list = 5, 2, 9, 5, 6.
Example 2:
Input:
LinkedList: 5->1->6->1->9->1
Output: 5 6 9

Expected Time Complexity: O(1) for insertAtBeginning() and O(N) for insertAtEnd().
Expected Auxiliary Space: O(1) for both.
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
	void addLast(int data){
        	Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp = head;
			while (temp.next != null){
				temp=temp.next;
			}

		       temp.next = newNode;
		}
	}
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next=head;
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

	void createSll(Node head1){

		Node temp1 = head1;
		Node temp2 = head1.next;
		while(temp2.next!=null){
			if (temp2.data==0){
				addFirst(temp1.data);
			}
			else{
				addLast(temp1.data);
			}
			temp1=temp1.next.next;
			temp2=temp2.next.next;
		}
		if (temp2.data ==0){
			addFirst(temp1.data);
		}
		else{
			addLast(temp1.data);
		}

	}

}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Linked List : ");
		int N = sc.nextInt();
		System.out.println("Enter Elements in Linked list : ");
		for (int i = 1;i<=N;i++){
			int val = sc.nextInt();
			sll.addLast(val);
		}
		sll.printSLL();
		SinglyLinkedList sll2 = new SinglyLinkedList();
		sll2.createSll(sll.head);
		sll2.printSLL();
	}
}
