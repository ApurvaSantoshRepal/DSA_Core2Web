

class Node {
	int data;
	Node next=null;
	Node prev=null;
	Node(int data){
		this.data = data;
	}
}
class LinkedList {
	Node head = null;
	void addFirst(int data){
		Node newNode = new Node(data);
		if (head==null){
			head = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	void printDLL(){
		Node temp = head;
		if(head == null ){
			System.out.println("Doubly Linked List");
		}
		else {
			System.out.println("List from head to tail");
			while (temp.next!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
			System.out.println("List from tail to head ");
			while (temp != null){
				System.out.print(temp.data+" ");
				temp = temp.prev;
			}
			System.out.println();
		}
	}
	void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}
		else {
			Node temp = head;
			while (temp.next!=null){
				temp=temp.next;
			}
			temp.next = newNode;
			newNode.prev=temp;
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
 	void addAtPos(int pos,int data){  
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
			newNode.prev = temp;
			temp.next.prev=newNode;
			temp.next=newNode;
		}




	}
	void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
		}
		else if(head.next==null){
			head=null;
		}
		else{
			head = head.next;
			head.prev=null;
		}
	}
	void deleteLast(){
		if(head==null){
			System.out.println("List is Empty");
		}
		else if(head.next==null){
			head = null;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev=null;
		}
	}
	void  deleteAtPos(int pos){
		if (pos<=0 || pos>=countNode()+1){
			System.out.println("Wrong Input");
		}
		else if(pos==1){
			deleteFirst();
		}
		else if(pos==countNode()){
			deleteLast();
		}
		else{
			Node temp = head;
			while(pos-2 !=0){
				pos--;
				temp=temp.next;
			}
			temp.next=temp.next.next;
			temp.next.prev.prev=null;
			temp.next.prev.next=null;
			temp.next.prev=temp;
		}
	}

			

}
class Client{
	public static void main(String args[]){
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.printDLL();
		ll.addLast(5);
		ll.printDLL();
		ll.addAtPos(2,33);
		ll.addAtPos(4,25);
		ll.printDLL();
		ll.deleteFirst();
		ll.printDLL();
		ll.deleteLast();
		ll.printDLL();
		ll.deleteAtPos(3);
		ll.printDLL();


	}
}


