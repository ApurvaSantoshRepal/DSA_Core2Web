/*
Problem Statement 7:
Swap kth node from start and end 
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
	int countNode(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	//swap kth Node
	Node swapKthNode(int k ){
		
		int count = countNode();
		if (k>count || k*2-1==count){
			return head;
		}
		Node x = head;
		Node x_prev = null;
		for (int i=1;i<k;i++){
			x_prev=x;
			x=x.next;
		}
		Node y=head;
		Node y_prev=null;
		for(int i=1;i<count-k+1;i++){
			y_prev=y;
			y=y.next;
		}
		if(x_prev != null){
			x_prev.next=y;
		}
		if(y_prev != null){
			y_prev.next = x;
		}

		Node temp = y.next;
		y.next=x.next;
		x.next=temp;
		if(k==1){
			head=y;
		}
		if(k==count){
			head=x;
		}
		return head;
	}
}
class Client {
	public static void main (String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		sll.addNode(10);
		sll.addNode(20);
		sll.addNode(30);
		sll.addNode(40);
		sll.addNode(50);
		sll.addNode (60);
		sll.printSLL(sll.head);
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		Node head = sll.swapKthNode(k);
		System.out.println("After swap");
		sll.printSLL(head);
	


	}
}
