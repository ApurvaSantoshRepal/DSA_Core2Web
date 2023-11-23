class Node{
	int data;
	Node next = null;
	Node(int data){
		this.data= data;
	}
}
class SinglyCircularLinkedList{
	Node head = null;
	void addFirst(int data){
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			head.next = head;
		}
		else{
			Node temp = head;
			while (temp.next!=head){
				temp= temp.next;
			}
			newNode.next = head;
			temp.next= newNode;
			head= newNode;
		}


	}
	void printCSLL(){
		if(head==null){
			System.out.println("Circular Singly Linked List is Empty");
		}
		else{
			Node temp = head;
			while(temp.next!=head){
				System.out.print(temp.data+"->");
				temp=temp.next;
			
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	void addLast(int data){
		Node newNode = new Node(data);
		if (head==null){
			head=newNode;
			head.next=head;
		}
		else{
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
		}
	}
	int countNode(){
		if(head==null)
			return 0;
		int count = 0;
		Node temp = head;
		while(temp.next !=head){
			temp=temp.next;
			count++;
		}
		count++;
		return count;
	}
	void addAtPos(int pos,int data){
		if(pos<=0 || pos>=countNode()+2){
			System.out.println("Wrong Input");
		}
		else if(pos==1){
			addFirst(data);

		}
		else if(pos==countNode()+1){
			addLast(data);
		}
		else{
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2!=0){
				pos--;
				temp =temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;


		}


	}
	void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
		}
		else if(head.next==head){
			head =null;
		}
		else{
			Node temp=head;
			while(temp.next !=head){
				temp=temp.next;
			}
			temp.next = head.next;
			head=head.next;
		}
	}
	void deleteLast(){

		if(head==null){
			System.out.println("List is empty");
		}
		else if(head.next==head){
			head=null;
		}
		else{
			Node temp = head;
			while(temp.next.next != head){
				temp = temp.next;
			}
			temp.next.next=null;
			temp.next=head;

		}
	}
	void deleteAtPos(int pos){
		if(pos<=0 || pos>countNode()+1){
			System.out.println("Wrong Input");
		}
		else if(pos==1){
			deleteFirst();
		}
		else if(pos==countNode()){
			deleteLast();
		}
		else{
			Node temp=head;
			while(pos-2!=0){
				pos--;
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}


	}




}
class Client{
	public static void main(String[] args){
		SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
		scll.printCSLL();
		scll.addFirst(5);
		scll.addFirst(10);
		scll.addFirst(15);
		scll.addFirst(20);
		scll.printCSLL();
		scll.addLast(25);
		scll.addLast(30);
		scll.printCSLL();
                System.out.println(scll.countNode());
		scll.addAtPos(2,55);
		scll.printCSLL();
		scll.deleteFirst();
		scll.printCSLL();
		scll.deleteLast();
		scll.printCSLL();
		scll.deleteAtPos(2);
		scll.printCSLL();
	


	}
}
