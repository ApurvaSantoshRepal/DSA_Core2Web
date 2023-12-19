/*
 
25. Finding middle element in a linked list
Given a singly linked list of N nodes.
The task is to find the middle of the linked list. For example, if the linked list is
1-> 2->3->4->5, then the middle node of the list is 3.
If there are two middle nodes(in case, when N is even), print the second middle element.
For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.
Example 1:
Input:
LinkedList: 1->2->3->4->5
Output: 3
Explanation: Middle of the linked list is 3.
Example 2:
Input:
LinkedList: 2->4->6->7->5->1
Output: 7
Explanation:
Middle of the linked list is 7.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 <= N <= 5000


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
	//int count Node 
        int countNode(){
		int count=0;
		Node temp = head;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	int midElement(){
		if(head==null){
			return -1;
		}
		int nodeCount= countNode();
		int mid = 0;
		if(nodeCount%2==0){
			mid = nodeCount/2;
		}
		else{
			mid = (nodeCount/2)+1;
		}
		Node temp = head;
		while(mid != 1){
			mid--;
			temp=temp.next;
		}
		return temp.data;
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
		System.out.println("Middle Element is : "+sll.midElement());

		

	}
}