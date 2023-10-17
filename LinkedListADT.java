/***********************************
CLASS: LinkedListADT.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
13-10-2023
TEAM:
MMA
AUTHORS:
Muhannad Alasmari , 443102430
***********************************/
class Node <T>{
	public T data;
	public Node<T> next;
	

	public Node () {
		data = null;
		next = null;
	}

	public Node (T val) {
		data = val;
		next = null;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

}
public class LinkedListADT<T>{
	private Node<T> head;
	private Node<T> current;
	
	public LinkedListADT(){ //Creates a new linked list
		head = current = null;
	}
	
	public boolean empty(){ //Returns true if the list is empty, false otherwise
		return head == null;
	}
	
	public boolean full(){
		return false;
	}
	
	public void findFirst(){ //Sets current to the head of the linked list 
		current = head;
	}
	
	public boolean isLast(){ //returns true if current is on the last element, false otherwise
		return current.next == null;
	}
	
	public void findNext(){ //Sets current to the next element in the list
		current = current.next;
	}
	
	public void update(T c){ //Updates the current element with a new specified element
		current.data = c;
	}
	
	public T retrieve(){ //returns the current element's data
		return current.data;
	}
	
	public void add(T c){ //This method adds a new contact to the list
		if(empty())
			current = head = new Node<T>(c);
		else{
			Node<T> tmp;
			tmp = current.next;
			current.next = new Node<T>(c);
			current = current.next;
			current.next = tmp;
		}
	}
	
	public void addInOrder(T c){ //This method adds a new contact to the list by the order of names alphabetically 
		if(empty())
			current = head = new Node<T>(c);
		if(!search(c)){
			Node<T> n = new Node<T>(c);
			if(((Contact)c).compareTo(((Contact)head.data).getName())<0){
					n.next = head;
					head = n;
				}
			else{
					Node<T> inQueue = null, tmp = head;
					while(tmp!=null&&(((Contact)tmp.data).compareTo(((Contact)c).getName())<=0)){
						inQueue = tmp;
						tmp = tmp.next;
					}
					inQueue.next = n;
					n.next = tmp;
				}
		}
	}
	
	public void delete(){ //This method deletes a chosen contact from the list
		if(current==head)
			head = head.next;
		else{
			Node<T> tmp = head;
			while(tmp.next!=current)
				tmp = tmp.next;
			tmp.next = current.next;
		}
		if(current.next=null)
			current = head;
		else
			current = current.next;
	}
	
	
	public boolean search(T c){ //This method searches for a specific contact in the list and returns true if found, false otherwise 
		Node<T> tmp = head;
		while(tmp!=null){
			if(tmp.data.equals(c))
				return true;
			tmp = tmp.next;
		}
		return false;
	}
	public void display(){ //This method displays the data of all the linked list elements
		Node tmp;
		while(tmp!=null){
			System.out.print(tmp.data+"->");
			tmp = tmp.next;
		}
	}
}
