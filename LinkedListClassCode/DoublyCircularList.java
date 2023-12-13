class Node{
	int data;
	Node next=null;
	Node prev=null;
	Node(int data){
		this.data=data;
	}
}
class DoublyCircularLinkedList{
	Node head = null;
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
			head.next=head;
			head.prev=head;
		
		}
		else{
			newNode.next=head;
			newNode.prev=head.prev;
			head.prev.next=newNode;
			head.prev=newNode;
			head=newNode;
		}
	}
	void printDCLL(){


	}



}
class Client{
	public static void main(String[] args){
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
                dcll.addFirst(10);
		dcll.addFirst(20);
		dcll.addFirst(30);
		dcll.addFirst(40);
		dcll.printDCLL();
	}
}

