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
	void addLast(int data){
		Node newNode = new Node(data);
		if (head==null){
			head=newNode;
			head.next=head;
			head.prev=head;
		}
		else{
			Node temp = head;
			while (temp.next != head){
				temp=temp.next;
			}
			temp.next= newNode;
			newNode.next=head;
			newNode.prev=temp;
			head.prev=newNode;
		}
	

	}
	int countNode(){
		int count = 0;
		Node temp = head;
		while(temp.next != head ){
			count++;
			temp=temp.next;
		}
		count++;
		return count;
	}
	void addAtPos(int pos , int data){
		if (pos<=0 || pos >= countNode()+2){
			System.out.println("Wrong Input");
		}
		else if(pos==1){
			addFirst(data);
		}
		else if(pos == countNode()+1){
			addLast(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while (pos-2 != 0){
				pos --;
				temp=temp.next;
			}
			newNode.next= temp.next;
			newNode.prev=temp;
			newNode.next.prev=newNode;
			newNode.prev.next=newNode;
		}
	}
	void deleteFirst(){
		if(head==null){
			System.out.println("Empty List");
		}
		else{
			head.prev.next=head.next;
		        head.next.prev=head.prev;
			head=head.next;
		}

	}
      

	void printDCLL(){
		if (head==null){
			System.out.println("List is Empty");
		}
		else if (head.next==null){
			head=null;
		}
		else {
			Node temp = head ;
			while (temp.next != head){
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println(temp.data);
			System.out.println();
		}




	}
	void deleteLast(){
		if(head==null){
			System.out.println("Empty List");
		}
		else if (head.next==null){
			head=null;
		}
		Node temp = head;
		while (temp.next.next!=head){
			temp=temp.next;
		}
		temp.next.next = null;
		temp.next.prev=null;
		temp.next=head;
		head.prev=temp;
	}
	void deleteAtPos(int pos){
		if(pos<=0 || pos>=countNode()+1){
			System.out.println("Wrong Input");
		}
		else if (pos==1){
			deleteFirst();
		}
		else if (pos == countNode()){
			deleteLast();
		}
		else{
			Node temp=head;
			while(pos-2 !=0){
				pos--;
				temp=temp.next;
			}
			temp.next.prev=null;
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
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


		dcll.addLast(5);
		dcll.addLast(0);
		dcll.printDCLL();
		dcll.addAtPos(1,50);
		dcll.addAtPos(8,3);
		dcll.addAtPos(6,8965);
		dcll.printDCLL();

		dcll.deleteFirst();
		dcll.printDCLL();

		dcll.deleteLast();
		dcll.printDCLL();

		dcll.deleteAtPos(4);
		dcll.printDCLL();

		System.out.println("Total node : "+dcll.countNode());




	}
}

