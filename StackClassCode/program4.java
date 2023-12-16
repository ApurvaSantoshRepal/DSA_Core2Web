//Two Stack using Array


import java.util.*;
class TwoStack{

	int maxSize ;
	int top1 ;
	int top2;
	int stackArr[];
	TwoStack(int size){
		this.maxSize = size;
		this.stackArr = new int [size];
		top1=-1;
		top2=size;
	}
	void push1(int data){
		if(top2-top1>1){
			top1++;
			stackArr[top1]=data;
		}
		else{
			System.out.println("Stack OverFlow");
		}


	}
	void push2(int data){
		if (top2-top1>1){
			top2--;
			stackArr[top2]=data;
		}
		else{
			System.out.println("Stack OverFlow");
		}

	}
	int pop1(){
		if (top1==-1){
			System.out.println("Stack is Empty");
			return -1;
		}
		int val = stackArr[top1];
		top1--;
		return val;
	

	}
	int pop2(){
		if (top2 == maxSize){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			int val = stackArr[top2];
			top2++;
			return val;
		}


	}


}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack Array :" );
		int size = sc.nextInt();
		TwoStack ts = new TwoStack(size);
		char ch ;
		do{
			System.out.println("1. push1");
			System.out.println("2. push2");
			System.out.println("3. pop1");
			System.out.println("4. pop2");
			System.out.println("Enter Your choice ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					       System.out.println("Enter data for stack 1");
					       int data = sc.nextInt();
					       ts.push1(data);
				}
				break;
				case 2:{
					       System.out.println("Enter data for stack 2");
					       int data = sc.nextInt();
					       ts.push2(data);
				}
				break;
				case 3:{
					       int data = ts.pop1();
					       System.out.println("popped data from stack 1: "+ts.pop1());
				}
				break;
				case 4:{
					       int data = ts.pop2();
					       System.out.println("popped data from stack 2 :"+ts.pop2());


				}
				break;
				default:{
						System.out.println("Wrong choice");
				}
			}
			System.out.println("Do you want to continue ? (Y/y) ");

			ch = sc.next().charAt(0);
		}
		while(ch=='Y' || ch== 'y');
	}



}

