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
	//addFirst
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

	
	//reverse Node 
        static Node reverse(Node head1){
		
		if (head1 == null){
			return null;
		}
	       Node forward=null;
	       Node curr = head1;
	       Node prev = null;
	       while (curr != null){
		       forward = curr.next;
		       curr.next=prev;
		       prev = curr;
		       curr=forward;
	       }
	       head1= prev;
	       printSLL(head1);
	       return head1;
	}
	//addTwo Nodes 
         static  Node addTwoNode(Node L1 , Node L2){
		
		if (L1==null){
			return L2;
		}
		else if (L2==null){
			return L1;
		}
		else {
			
			int carry=0;
		   
			Node head = null;
			
                       

			while (L1 !=null || L2 != null || carry != 0){
				
				int data1 = 0;
				int data2 = 0;
				if (L1 != null){
					data1=L1.data;
				}
				if (L2 != null){
					data2=L2.data;
				}
				int sum = data1+data2+carry;
				int digit = sum %10;
				carry = sum /10;
			        Node newNode = new Node(digit);
				if (head==null){
					
					head = newNode;
				}
				else{
		
					newNode.next= head;
					head=newNode;
				}

				if (L1 != null){
					L1=L1.next;
				}
				if(L2 != null){
					L2=L2.next;
				}
			}
		
			
			return head;
		}
	 }


	//print
	 static void printSLL(Node head){
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
		SinglyLinkedList L1 = new SinglyLinkedList();
		SinglyLinkedList L2 = new SinglyLinkedList();
		SinglyLinkedList L3 = new SinglyLinkedList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of L1");
		int size1 = sc.nextInt();
		System.out.println("Enter data in L1");
		for (int i= 1;i<=size1;i++){
			L1.addNode(sc.nextInt());
		}
		System.out.println("Enter size of L2");
		int size2 = sc.nextInt();
		System.out.println("Enter data in L2");
		for (int i =1;i<=size2;i++){
			L2.addNode(sc.nextInt());
		}
	        
	
                Node head1 =SinglyLinkedList.addTwoNode(L1.head,L2.head);
		SinglyLinkedList.printSLL(head1);
                

       
		
	}
}
