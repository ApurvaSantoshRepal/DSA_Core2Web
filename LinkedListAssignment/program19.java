/*

19. Intersection Point in Y Shaped Linked Lists
Given two singly linked lists of size N and M, write a program to get the point where two linked
lists intersect each other.
Example 1:
Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:

Example 2:
Input:
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation:
4 5
| |
1 6
\ /
8 ----- 1
|
4
|
5
|

NULL
Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N + M ≤ 2*105
-1000 ≤ value ≤ 1000




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

	//Insertion Point
	int insertionPoint(Node head1,Node head2){
		Node ptr1=head1;
		Node ptr2= head2;
		while(ptr1 != ptr2){
			if(ptr1==null){
				ptr1=head2;
			}
			if(ptr2==null){
				ptr2=head1;
			}
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		if(ptr1==null){
			return -1;
		}
		else{
			return ptr1.data;
		}



	}
	

}
class Client {
	public static void main (String[] args){
	SinglyLinkedList sll = new SinglyLinkedList();
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);
 
        Node newNode = new Node(6);
        head2.next = newNode;
 
        newNode = new Node(9);
        head2.next.next = newNode;
 
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
 
        newNode = new Node(30);
        head1.next.next = newNode;
 
        head1.next.next.next = null;
	int insertionPoint = sll.insertionPoint(head1,head2);
	System.out.println("Insertion point is "+insertionPoint);
		

	}
}
