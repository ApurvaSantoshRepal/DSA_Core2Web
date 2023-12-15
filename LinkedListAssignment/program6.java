/*6. Add two numbers represented by Linked List
Given two numbers represented by two linked lists, write a function that returns a Sum list. The
sum list is a linked list representation of addition of two input numbers.
Example 1:
Input:
S1 = 3, S2 = 3
ValueS1 = {2,3,4}
ValueS2 = {3,4,5}
Output: 5 7 9
Explanation: After adding the 2 numbers the resultant number is 5 7 9.

Example 2:
Input:
S1 = 1, S2 = 2
ValueS1 = {9}
ValueS2 = {8,7}
Output: 9 6
Explanation: Add 9 and 7 we get 16. 1 is carried here and is added to 8. So the answer is 9 6
Constraints:
1 <= S1, S2 <= 100


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
