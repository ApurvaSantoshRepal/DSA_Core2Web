/*

13. Nth node from end of linked list
Given a linked list consisting of L nodes and given a number N. The task is to find the Nth node
from the end of the linked list.
Example 1:
Input:
N = 2

LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there are 9 nodes in the linked list and we need to find the 2nd
node from the end. the 2

nd node from the end is 8.

Example 2:
Input:
N = 5
LinkedList: 10->5->100->5
Output: -1
Explanation: In the second example, there are 4 nodes in the linked list and we need to find 5th
from the end. Since 'n' is more than the number of nodes in the linked list, the output is -1.
Note:
Try to solve it in a single traversal.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 <= L <= 10^6
1 <= N <= 10^6

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
			Node temp = head ;
			while (temp.next != null){
				temp = temp.next;
			}
			temp.next=newNode;
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
	// countNode
	int countNode(){
		Node temp = head;
		int count = 0;
		while (temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	int nthNodeFromEnd(int N){
		if(N>countNode()){
			return -1;
		}
		else if(N==countNode()){
			return head.data;
		}
		else{
			Node temp = head;
			int count = 0;
			while(count < countNode()-N){
				temp = temp.next;
				count++;
			}
			return temp.data;
		}
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
		System.out.println("Enter value of N :");
		int N = sc.nextInt();
		int  data = sll.nthNodeFromEnd(N);
		System.out.println(N+"th node from end is " +data);
		

	}
}
