//Inplace reverse using iterative and recursion 
//find middle element using normal approch and 2 pointer approch 
//
//


import java.util.*;
class Node{
	int data;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
class LinkedListDemo{
	Node head = null;
	//add Node
	void addNode(int data){
		Node newNode = new Node(data);
		if (head==null){
			head=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	//print ll
	void printLL(){
		Node temp= head;
		if(head==null){
			System.out.println("Linked List is Empty");
		}
		else{
			while (temp != null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();

		}
	}
	//reverse using iterative approch
        void reverseItr(){
	if (head == null || head.next==null)
			return ;
	

		Node prev = null;
		Node curr = head;
		Node forward = null;
		while (curr != null){
			forward = curr.next;
			curr.next=prev;
			prev = curr;
			curr= forward;
		}
		head = prev;
		
	}

	//reverse using recursion
        void reverseRecursion(Node prev , Node curr){
		if (curr == null ){
			head = prev;
			return ;
		}
		else {
			Node forward = curr.next;
			curr.next=prev;
			prev = curr;
			curr = forward;
		}

			reverseRecursion(prev,curr);
		


	}
	int countNode(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp=temp.next;
		}
		return count;
	}

	//Middle Element using Approch 1  
	void middleApproch1(){
		int len = countNode();
		if (len ==0 ){
			System.out.println("Linked List is Empty");
		}
		else{

		int count = 0;
		Node temp = head;
		while (count<len/2){
			count++;
			temp=temp.next;
		}
		System.out.println(temp.data);
		}

	}
	// middle Element using Approch 2
	void middleApproch2(){
		Node slow = head;
		Node fast = head.next;
		if(head==null){
			System.out.println(" Linked List is Empty: ");
		}
		else if (head.next==null){
			System.out.println(head.data);
		}
		else{
			while(fast != null){
				fast = fast.next;
				if(fast != null){
					fast=fast.next;
				}
				slow = slow.next;
			}
			System.out.println(slow.data);


		}

	}
}
class Client {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedListDemo ll = new LinkedListDemo();
		char ch;
		do{
			System.out.println("1. addNode");
			System.out.println("2. printLL");
			System.out.println("3. reverse LL using iterative Approch");
			System.out.println("4. reverse LL using Recursive Approch");
			System.out.println("5. Middle Element using Normal method");
			System.out.println("6. Middle Element using 2 Pointer Approch");
			System.out.println();
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1 :{
						System.out.println("Enter data ");
						int val= sc.nextInt();
						ll.addNode(val);
				}
				break;
				case 2: {
						ll.printLL();
				}
				break;
				case 3 :{
						System.out.println("Reverse Linked List using Iterative Approch:" );
						ll.reverseItr();
						ll.printLL();

				}
				break;
				case 4:{
					       System.out.println("Reverse Linked List using recursive Approch: ");
					       Node curr =ll.head;
					       Node prev = null;
					       ll.reverseRecursion(prev , curr);
					       ll.printLL();
				}
				break;
				case 5:{
					       System.out.println(" Middle Element using Approch 1 is ");
					       ll.middleApproch1();
				}
				break;
				case 6:{
					       System.out.println(" Middle Element using Approch 2 is");
					       ll.middleApproch2();
				}
				break;
				default:{
			                      System.out.println("Wrong Choice");
				}
			}
				System.out.println("Do you want to continue ? (y/Y) ");
				ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		

	}
}




