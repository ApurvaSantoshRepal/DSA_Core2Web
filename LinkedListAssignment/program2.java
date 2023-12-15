/*
2.Find length of Loop
Given a linked list of size N. The task is to complete the function countNodesinLoop() that
checks whether a given Linked List contains a loop or not and if the loop is present then return
the count of nodes in a loop or else return 0. C is the position of the node to which the last node
is connected. If it is 0 then no loop.
Example 1:
Input:
N = 10
value[]={25,14,19,33,10,21,39,90,58,45}
C = 4
Output: 7
Explanation: The loop is 45->33. So

length of loop is 33->10->21->39->
90->58->45 = 7. The number 33 is
connected to the last node to form the
loop because according to the input the
4th node from the beginning(1 based
index) will be connected to the last
node for the loop.
Example 2:
Input:
N = 2
value[] = {1,0}
C = 1
Output: 2
Explanation: The length of the loop
is 2.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
1 <= N <= 500
0 <= C <= N-1

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
		if (head==null){
			head=newNode;
		}
		else{
			Node temp = head;
			while (temp.next != null){
				temp=temp.next;
			}
			temp.next = newNode;
		}
	}
        //print 
       void printSLL(){
	       Node temp = head;
	       if (head == null){
		       System.out.println("Linked List is Empty");
	       }
	       while (temp.next != null){
		       System.out.print(temp.data+"->");
		       temp=temp.next;
	       }
	       System.out.println(temp.data);
       }
       // createLoop in linked list
       void createLoopAtPos(int pos,int  N){
	       if (pos<=0 || pos>=N+1){
		       System.out.println("Wrong input");
	       }
	       else {
		       Node temp = head;
		       while (pos != 1){
			       pos--;
			       temp=temp.next;
		       }
		       Node temp2 = temp ;
		       while (temp2.next !=null){
			       temp2=temp2.next;
		       }
		       temp2.next=temp;
	       }
       }
       //Nodes in loop
      int countNodesInLoop(){
	       Node slow = head;
	       Node fast = head;
	       boolean flag = false ;
	       while(fast.next != null && fast.next != null){
		       slow = slow.next;
		       fast=fast.next.next;
		       if (slow==fast){
			       flag = true;
			       break;
		       }
	       }	    
	       if (flag){
		       int count = 1;
		       slow=slow.next;
		       while (slow != fast){
			       slow= slow.next;
			       count++;
		       }
               return count;
	       }
	       else {
		       return 0;
	       }
       }
}
class Client {
	public static void main(String[] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total Number of nodes");
		int N = sc.nextInt();
		int val = 0;
		for (int i= 1;i<=N;i++){
			sll.addNode(val);
			val = val +10;
		}
		sll.printSLL();
		System.out.println("Enter the pos ");

		int pos = sc.nextInt();
                sll.createLoopAtPos(pos, N);
	        System.out.println("Nodes in loops: "+sll.countNodesInLoop());

	}
}


