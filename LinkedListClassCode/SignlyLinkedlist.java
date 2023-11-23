class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class LinkedList{
	Node head = null;
	void addFirst(int data){
		Node newNode = new Node(data);
		if (head==null){
			head = newNode;
		}
		else{
			newNode.next=head;
			head = newNode;
		}
	}
	void printSLL(){
		Node temp = head;
		if (head==null){
			System.out.println("LinkedList is empty");
			return;
		}

		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	void addLast(int data){
		Node newNode = new Node(data);
		Node temp = head;
		if(head==null){
			head = newNode;

		}
		else{
			while(temp.next !=null){
				temp=temp.next;
			}
			temp.next=newNode;


		}
	}
	void addAtPos(int pos , int data){
		Node newNode=new Node(data);
	        if(pos<=0 || pos>countNode()+2){
			System.out.println("Wrong Input");
		}
		else if(pos==1){
			addFirst(data);
		}
		else if (pos == countNode()+1){
			addLast(data);
		}
		else{
			Node temp = head;
			while(pos-2 !=0 ){
				pos--;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next=newNode;
		}
	}
	int countNode(){
		int count =0;
		Node temp = head;
		while(temp != null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	void deleteFirst(){
		if(head == null ){
			System.out.println("LinkedList is Empty");
		}
		else if(head.next == null){
			head = null;
		}
		else{
			head = head.next;
		}
	}
	void deleteLast(){
		Node temp = head;
		if (head == null){
			System.out.println("LinkedList is Empty");
			return;
		}
		if(head.next==null){
			head = null;
		}

		while(temp.next.next!=null){
			temp = temp.next;
		}
		temp.next = null;
	}
	void deleteAtPos(int pos){
		if(pos<0 || pos > countNode()+1){
			System.out.println("Linked List is empty");
		}
		else if (pos==1){

			deleteFirst();
		}
		else if(pos==countNode()){
			deleteLast();
		}
		else{
			Node temp = head;
			while(pos-2!=0){
				pos--;
				temp=temp.next;
			}
			temp.next = temp.next.next;
		}
	



	}


}
class Client{
	public static void main(String[] args){
		LinkedList ll= new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		
		ll.printSLL();
		ll.addLast(40);

		
		ll.printSLL();
		ll.addAtPos(2,25);

		
		ll.printSLL();
		ll.deleteFirst();
		ll.printSLL();
		ll.deleteLast();
		ll.printSLL();
		ll.deleteAtPos(2);
		ll.printSLL();

	}
}
