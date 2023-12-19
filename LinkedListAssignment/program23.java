/*
 23. Merge Sort for Linked List
Given Pointer/Reference to the head of the linked list, the task is to Sort the given linked list
using Merge Sort.
Note: If the length of the linked list is odd, then the extra node should go in the first list while
splitting.
Example 1:
Input:
N = 5
value[] = {3,5,2,4,1}

Output: 1 2 3 4 5
Explanation: After sorting the given linked list, the resultant matrix will be 1->2->3->4->5.
Example 2:
Input:
N = 3
value[] = {9,15,0}
Output: 0 9 15
Explanation: After sorting the given linked list , the resultant will be 0->9->15.
Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)
Constraints:
1 <= N <= 105

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
	//countNode
	int countNode(Node head){
		int count = 0;
		Node temp = head;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	//
        Node middleNode(Node head){
		int mid = countNode(head)/2;
		Node temp = head;
		while(mid>1){
			mid--;
			temp=temp.next;
		}
		return temp;
	}
       Node merge(Node head1 , Node head2){
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
         

       Node mergeSort(Node head , Node middleNode){
	       while(head.next!=null){
		       Node temp2= middleNode.next;
		       Node temp1=head;
		       middleNode.next=null;
		       Node m1=middleNode(temp1);
		       Node m2=middleNode(temp2);
		       Node x =mergeSort(temp1,m1);
		       Node y =mergeSort(temp2,m2);
		       return merge(x,y);


	       }
	       return head;

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

		Node middleNode = sll.middleNode(sll.head);
	       Node head= sll.mergeSort(sll.head,middleNode);
	       sll.printSLL(head);
	

	}
}
