/*

16. Rotate a Linked List
Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a
given positive integer smaller than or equal to length of the linked list.
Example 1:
Input:
N = 5
value[] = {2, 4, 7, 8, 9}
k = 3
Output: 8 9 2 4 7
Explanation:
Rotate 1: 4 -> 7 -> 8 -> 9 -> 2
Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
Example 2:
Input:
N = 8
value[] = {1, 2, 3, 4, 5, 6, 7, 8}
k = 4
Output: 5 6 7 8 1 2 3 4
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
Constraints:
1 <= N <= 10^3
1 <= k <= N


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
			temp.next= newNode;

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
	//countNode
	int countNode(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	//rotate the list
	void rotateList(int k ){
		int totalNode = countNode();
		int pos = k%totalNode;
		while(pos>0){
			Node temp = head;
			Node curr = head;
			while (curr.next != null){
				curr= curr.next;
			}
			curr.next=temp;
			head = head.next;
			temp.next=null;
			pos--;
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
		System.out.println("Enter value of k : ");
		int k = sc.nextInt();
		System.out.println("After rotation : ");
		sll.rotateList(k);
		sll.printSLL();
		

	}
}
