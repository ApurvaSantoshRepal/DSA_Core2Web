
import java.util.*;
class DoubleEndedQueue{
	int queueArr[];
	int front;
	int rear;
	int maxSize;
	DoubleEndedQueue(int size){
		this.queueArr=new int[size];
		this.front=-1;
		this.rear=-1;
		this.maxSize=size;
		
	}
	boolean isFull(){
		return( (front==0 && rear==maxSize-1)||(front==rear+1));

		
	}
	boolean isEmpty(){
		return (front==-1);
	}

		
	void enqueueFront(int data){
		if (isFull()){
		     System.out.println("Queue is full");
		     return;
		}
		else if(front==-1){
			front=rear=0;
		}
		else if (front==0){
			front=maxSize-1;
		}
		else{
			front--;
		}
		queueArr[front]=data;
	}




	
	int dequeueFront(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		int val = queueArr[front];
		if (front==rear){
			front=-1;
			rear=-1;
		}
		else if (front ==maxSize-1){
			front=0;
		}
		else{
			front++;
		}
		return val;


			

	}
	void enqueueRear(int data){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		if(front==-1){
			rear=front=0;
		}
		else if (rear==maxSize-1){
			rear=0;
		}
		else{
			rear++;
		}
		queueArr[rear]=data;


	}
	int dequeueRear(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		int val= queueArr[rear];
		if (rear==maxSize-1){
			rear=0;
		}
		else if(front==rear){
			front=rear=-1;
		}
		else{
			rear++;
		}
		return val;


	}
	void printQueue(){
		if(front<=rear){
			for(int i = front;i<=rear;i++){
				System.out.print(queueArr[i]+" ");
			}
		}
		else{
			for(int i= front;i<maxSize;i++){
				System.out.print(queueArr[i]+" ");
			}
			for(int i = 0;i<=rear;i++){
				System.out.print(queueArr[i]+" ");
			}
			System.out.println();
		}

	}



}

class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		DoubleEndedQueue q = new DoubleEndedQueue(size);
		char ch ;
		do {
			System.out.println("1.enqueueFront");
			System.out.println("2.dequeueFront");
			System.out.println("3.enqueueRear");
			System.out.println("4.dequeueRear");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter data in Queue from front ");
					int data = sc.nextInt();
					q.enqueueFront(data);
				}
				break;
				case 2:{
					       int ret = q.dequeueFront();
					       if(ret != -1){
						       System.out.println(ret+" delete from front");
					       }
				}break;
				case 3:{
					       System.out.println("Enter data in Queue from rear");
					       int data = sc.nextInt();
					       q.enqueueRear(data);

				}
				break;
			        case 4:{
					       int ret = q.dequeueRear();
					       if(ret != -1){
						       System.out.println(ret + " delete from rear");
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

