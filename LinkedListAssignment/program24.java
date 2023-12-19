/*

24. Check if Linked List is Palindrome
Given a singly linked list of size N of integers. The task is to check if the given linked list is
palindrome or not.
Example 1:
Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.
Example 2:
Input:
N = 4
value[] = {1,2,3,4}
Output: 0
Explanation: The given linked list
is 1 2 3 4 , which is not a palindrome
and Hence, the output is 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space Usage: O(1) (ie, you should not use the recursive stack space as
well)
Constraints:
1 <= N <= 10^5

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
	void printSLL(Node head){
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
	//count node
	int countNode(){
		int count=0;
		Node temp = head;
		while(temp != null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	Node reverse(Node head ){
		if(head==null || head.next==null){
			return head;
		}
		Node curr= head;
	        Node prev = null;
		Node forward = null;
		while(curr != null){
			forward= curr.next;
			curr.next= prev;
			prev=curr;
			curr=forward;
		}
		head = prev;
		return head;
			
		
	}
	//midele node
	Node middleNode(){
	
		int mid  = countNode()/2;
		Node middleNode = head;
		while(mid > 1){
			mid--;
			middleNode=middleNode.next;
		}
		return middleNode;
	}

	boolean isPalindrome(){
		if (head==null){
			return false;
		}
		if(head.next==null){
			return true;
		}
		Node middleNode = middleNode();
		Node tail = reverse(middleNode.next);
		
		Node temp = head;
		while(tail != null){
			if (tail.data != temp.data){
				return false;
			}
			tail=tail.next;
			temp=temp.next;
		}
		return true;

		
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

		sll.printSLL(sll.head);
	System.out.println(sll.isPalindrome());

	}
}
