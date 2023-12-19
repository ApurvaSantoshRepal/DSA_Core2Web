/*

18. Remove loop in Linked List
Given a linked list of N nodes such that it may contain a loop.
A loop here means that the last node of the link list is connected to the node at position
X(1-based index). If the link list does not have any loop, X=0.
Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the
loop.

Example 1:

Input:
N = 3
value[] = {1,3,4}
X = 2
Output: 1
Explanation: The link list looks like
1 -> 3 -> 4
^ |
|____|
A loop is present. If you remove it
successfully, the answer will be 1.
Example 2:
Input:
N = 4
value[] = {1,8,3,4}
X = 0
Output: 1
Explanation: The Linked list does not
contains any loop.
Example 3:
Input:
N = 4
value[] = {1,2,3,4}
X = 1
Output: 1
Explanation: The link list looks like
1 -> 2 -> 3 -> 4
^ |
|______________|
A loop is present.
If you remove it successfully,
the answer will be 1.
Expected time complexity: O(N)
Expected auxiliary space: O(1)
Constraints:
1 ≤ N ≤ 10^4



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
			Node temp = head;
			
			while(temp.next != null){
				temp= temp.next;
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
		
	void delLoop(){
		Node fast = head;
		Node slow = head;
		Node start = head;
		while(fast != null){
			slow = slow.next;
		        fast = fast.next;
			if(fast!=null){
				fast=fast.next;
			}
			if(slow==fast){
				
				while(start != slow){
					start = start.next;
					slow= slow.next;

				}
				while(fast.next != start){
					fast= fast.next;
				}
				fast.next=null;
				return ;

			}
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

                           
                SinglyLinkedList sl2 = new SinglyLinkedList();
		System.out.println("Enter the Size of Linked List");
		int size1 = sc.nextInt();
	        System.out.println("Enter Elements in Linked List");
		for (int i= 1;i<=size1;i++){
			sl2.addNode(sc.nextInt());
		}

		sl2.createLoopAt(3);
	        sl2.delLoop();
		sl2.printSLL();
		

	}
}
