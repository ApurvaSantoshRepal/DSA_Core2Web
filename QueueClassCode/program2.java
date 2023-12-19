// Queue implimentation using array


import java.util.*;
class QueueDemo{
	int queueArr[];
	int front;
	int rear;
	int maxSize;
	QueueDemo(int size){
		this.maxSize = size;
		this.queueArr= new int[size];
		this.rear=-1;
		this.front=-1;
	}
	void enqueue(int data){
		if(rear==maxSize-1){
			System.out.println("Queue is empty");
			return;
		}
		if(front==-1){
			front++;
			rear++;
			queueArr[rear]=data;
		}
		else{
			rear++;
			queueArr[rear]=data;
		}



	}
	int dequeue(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;

		}
		int val = queueArr[front];
		front++;

		if(rear<front){
			rear=-1;
			front=-1;
		}
		
		return val;
	}
	boolean empty(){
		if(rear==-1){
			return true;
		}
		else{
			return false;
		}
	}
	int front(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return queueArr[front];
		}
	}
	int rear(){
		if(rear==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else{
			return queueArr[rear];
		}
	}
	void printQueue(){
		for(int i = front;i<=rear;i++){
			System.out.print(queueArr[i]+" ");
		}
		System.out.println();
	}



}

class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		QueueDemo q = new QueueDemo(size);
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

