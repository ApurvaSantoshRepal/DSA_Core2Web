/*
21. Merge two sorted linked lists
Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge
both of the list (in-place) and return head of the merged list.

Example 1:
Input:
N = 4, M = 3
valueN[] = {5,10,15,40}
valueM[] = {2,3,20}
Output: 2 3 5 10 15 20 40
Explanation: After merging the two linked lists, we have merged list as 2, 3, 5, 10, 15, 20, 40.
Example 2:
Input:
N = 2, M = 2
valueN[] = {1,1}
valueM[] = {2,4}
Output:1 1 2 4
Explanation: After merging the given two linked lists , we have 1, 1, 2, 4 as output.
Expected Time Complexity : O(n+m)
Expected Auxiliary Space : O(1)
Constraints:
1 <= N, M <= 104
0 <= Node's data <= 105
**/


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
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next=newNode;
	
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
	Node mergeLL(Node head1 , Node head2){
		Node newNode = new Node(0);
		Node temp = newNode;

		while(true){
			if(head1==null){
				temp.next=head2;
				break;
			}
			if(head2==null){
				temp.next=head1;
				break;
			}
			if(head1.data<=head2.data){
				temp.next=head1;
				head1=head1.next;
			}
			else{
				temp.next=head2;
				head2=head2.next;
			}
			temp=temp.next;
		}



		return newNode.next;
	}



}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Size of Linked List");
		int size = sc.nextInt();
	        System.out.println("Enter Elements in Linked List");
		for (int i= 1;i<=size;i++){
			sll.addNode(sc.nextInt());
		}
		SinglyLinkedList sll2 = new SinglyLinkedList();
		System.out.println("Enter  Size of Second Linked List");
		int size2 = sc.nextInt();
		System.out.println("Enter Elements in Linked List ");
		for (int i = 1;i<=size2;i++){
			sll2.addNode(sc.nextInt());
		}
	

                Node head =sll.mergeLL(sll.head,sll2.head);
                sll.printSLL(head);


	}
}
