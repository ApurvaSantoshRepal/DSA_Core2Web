/*


15. Remove duplicates from an unsorted linked list
Given an unsorted linked list of N nodes. The task is to remove duplicate elements from this
unsorted Linked List. When a value appears in multiple nodes, the node which appeared first
should be kept, all other duplicates are to be removed.
Example 1:
Input:
N = 4
value[] = {5,2,2,4}
Output: 5 2 4
Explanation:Given linked list elements are 5->2->2->4, in which 2 is repeated only. So, we will
delete the extra repeated elements 2 from the linked list and the resultant linked list will contain
5->2->4
Example 2:
Input:
N = 5
value[] = {2,2,2,2,2}
Output: 2
Explanation:Given linked list elements are 2->2->2->2->2, in which 2 is repeated. So, we will
delete the extra repeated elements 2 from the linked list and the resultant linked list will contain
only 2.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)
Constraints:
1 <= size of linked lists <= 10^6

0 <= numbers in list <= 10^4



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
				temp=temp.next;
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
        void removeDuplicates(){
              Node curr = head;
	      if (head==null || head.next == null){
		      return ;
	      }
	      HashSet<Integer> hs = new HashSet<Integer>();
	      Node prev = null;
	      while(curr != null){
		      if(!hs.contains(curr.data)){
			      hs.add(curr.data);
			      prev=curr;
			      curr=curr.next;
		      }
		      else{
			      prev.next = curr.next;
			      curr = curr.next;
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
		sll.removeDuplicates();
		sll.printSLL();

	}
}
