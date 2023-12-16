//Stack Implementation using Array


import java.util.*;
class StackDemo{
	int maxSize;
	int stackArr[];
	int top =-1;
	StackDemo(int size){
		this.maxSize = size;
		this.stackArr = new int[size];
	}
	void push(int data){
		if (top == maxSize-1){
			System.out.println("Stack OverFlow");
		}
		else{
		
			top++;
			stackArr[top]=data;
		}

	}
	int pop(){
		if (top == -1){
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			int val = stackArr[top];
			top--;
			return val;
		}
	}
	boolean empty(){
		boolean flag = false;
		if (top==-1){
			flag = true;
		}
		return flag;
	}
	int peek(){
		if (top==-1){
			System.out.println("Stack is Empty");
			return -1;

		}
		else{
			return stackArr[top];
		}
	}
}

class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int size = sc.nextInt();
		StackDemo s = new StackDemo(size);

		char ch ;
		do{
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. empty");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					       System.out.println("Enter the data : ");
					       int data = sc.nextInt();
					       s.push(data);
				}
				break;
				case 2:{
					       int data = s.pop();
					       System.out.println(data+" is popped element");
				}
				break;
				case 3:{
					       int data = s.peek();
					       System.out.println(data+ " is peek element");
				}
				break;
				case 4:{
					       boolean flag = s.empty();
					       if (flag){
						       System.out.println("Stack is Empty");
					       }
					       else{
						       System.out.println("Stack is not Empty");
					       }

				}
				break;
				default :{
						 System.out.println("Wrong choice");
				}
			}
				
				System.out.println("Do you want to continue ? (Y/y)");
				ch = sc.next().charAt(0);
			
		}while(ch == 'Y' || ch == 'y');

	}
}

