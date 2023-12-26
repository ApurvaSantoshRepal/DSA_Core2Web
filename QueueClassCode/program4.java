//circular queue using linked list

import java.util.*;
class Node {
	int data;
	Node next = null;
	Node(int data){
		this.data=data;
	}
}
class CircularQueue{
	Node front = null;
	Node rear = null;
	void enqueue(int data){
		Node newNode = new Node(data);
		if(front==null){
			rear=newNode;
			rear.next=rear;
			front=newNode;
			front.next=front;
		}
		else{
		
			newNode.next=front;
			rear.next=newNode;
			rear=rear.next;
		}



	}
	int dequeue(){
		if(front==null){
			System.out.println("Circular Queue is empty");
			return -1;
		}
		else if(front==rear){
			int val = front.data;
			front=null;
			rear=null;
			return val;
		}
		else{
		int val = front.data;
		Node temp = front;
		while(temp.next != front){
			temp=temp.next;
		}
		temp.next=front.next;
		rear = temp;
		front=front.next;
                return val;


	}
	}
	int rear(){
		if(front==null){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return rear.data;
		}


	}
	int front(){
		if(front==null){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return front.data;
		}

	}
	void printQueue(){
		if(front == null){
			System.out.println("Queue is empty");
			return;
		}
		else{
			Node temp = front;
			while(temp.next != front){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}

	}
	boolean empty(){
		if(front==null){
			return true;
		}
		return false;

	}



	
}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		CircularQueue q = new CircularQueue();
		char ch ;
		do {
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.rare");
			System.out.println("5.front");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter data in Queue");
					int data = sc.nextInt();
					q.enqueue(data);
				}
				break;
				case 2:{
					       int ret = q.dequeue();
					       if(ret != -1){
						       System.out.println(ret+" delete ");
					       }
				}break;
				case 3:{
					       boolean ret = q.empty();
					       if(ret){
						       System.out.println("Queue is empty");
					       }
					       else{
						       System.out.println("Queue is not empty");
					       }
				}
				break;
			        case 4:{
					       int rear = q.rear();
					       if(rear!=-1){
						       System.out.println(rear+" rear ");
					       }
				}
				break;
				case 5:{
					       int front = q.front();
					       if(front!=-1){
						       System.out.println(front+" front ");
					       }
				}
				break;
				case 6:{
					       q.printQueue();
				}
				break;
				default:{
						System.out.println("Wrong choice");
				}
			}
				System.out.println("Do you want to continue ? ");
				ch = sc.next().charAt(0);


		}while(ch=='y' || ch=='Y');
	}


}
