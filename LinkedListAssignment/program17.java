/*

17. Detect Loop in linked list
Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can
contain a self loop.
Example 1:

Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True
Explanation: In above test case N = 3. The linked list with nodes N = 3 is given. Then the value
of x=2 is given which means the last node is connected with the x

th node of the linked list.

Therefore, there exists a loop.
Example 2:
Input:
N = 4
value[] = {1,8,3,4}
x = 0
Output: False
Explanation: For N = 4 ,x = 0 means
the lastNode->next = NULL, then
the Linked list does not contains
any loop.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ N ≤ 10^4
1 ≤ Data on Node ≤ 10^3
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
	//count node
	int countNode(){
		Node temp = head;
		int count = 0;
		while(temp!= null){
			count++;
			temp = temp.next;
		}
		return count;
	}

	//create loop at pos 
	void createLoopAt(int pos){
		if (pos>=countNode()+1){
			System.out.println("Wrong input");
			return;
		}
		Node temp = head;
		while(pos!=1){
			pos--;
			temp = temp.next;
		}
		Node curr = temp;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next=curr;
	}
		
	void detectLoop(){
		Node fast = head;
		Node slow = head;
		while(fast != null){
			slow = slow.next;
		        fast = fast.next;
			if(fast!=null){
				fast=fast.next;
			}
			if(slow==fast){
				System.out.println("Loop Detected");
				return ;
			}
		}
		System.out.println("Loop is not detected");
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
		sll.detectLoop();

		sll.printSLL();


                SinglyLinkedList sl2 = new SinglyLinkedList();
		System.out.println("Enter the Size of Linked List");
		int size1 = sc.nextInt();
	        System.out.println("Enter Elements in Linked List");
		for (int i= 1;i<=size1;i++){
			sl2.addNode(sc.nextInt());
		}

		sl2.createLoopAt(3);
		sl2.detectLoop();

		
		
		

	}
}
