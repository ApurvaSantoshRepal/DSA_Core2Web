//Input restricted 

import java.util.*;
class InputRestrictedQueue{
	int front =-1;
	int rear =-1;
	int maxSize;
	int queueArr[];
	InputRestrictedQueue(int size){
		this.queueArr=new int[size];
		this.maxSize = size;
	}
	int dequeueFront(){
		if(front==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else if(front==rear){
			int val= queueArr[front];
			rear=front=-1;
			return val;
		}
		else{
			int val = queueArr[front];
			front++;
			return val;
		}


	}
	void enqueueRear(int data){
		if (front==-1){
			front=rear=0;
		}
		else if(rear==maxSize-1){
			System.out.println("Queue is full");
			return;
		}

		else{
			rear++;
		}
	
		queueArr[rear]=data;

	}
	int dequeueRear(){
		if(rear==-1){
			System.out.println("Queue is empty");
			return -1;
		}
		else if (rear==front){
			int val = queueArr[front];
			rear=front=-1;
			return val;
		}
		else{
			int val = queueArr[rear];
			rear--;
			return val;
		}
	}




	
	void printQueue(){
		for (int i = front;i<=rear;i++){
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
		InputRestrictedQueue q = new InputRestrictedQueue(size);
		char ch ;
		do {
			
			System.out.println("1.dequeueFront");
			System.out.println("2.enqueueRear");
			System.out.println("3.dequeueRear");
			System.out.println("4.printQueue");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice){
		
				case 1:{
					       int ret = q.dequeueFront();
					       if(ret != -1){
						       System.out.println(ret+" delete from front");
					       }
				}break;
				case 2:{
					       System.out.println("Enter data in Queue from rear");
					       int data = sc.nextInt();
					       q.enqueueRear(data);

				}
				break;
			        case 3:{
					       int ret = q.dequeueRear();
					       if(ret != -1){
						       System.out.println(ret + " delete from rear");
					       }
				}
				
				break;
				case 4:{
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

