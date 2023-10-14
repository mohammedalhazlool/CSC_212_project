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
			if(((Contact)c).compareTo(((Contact)head.data).getContactname())<0){
					n.next = head;
					head = n;
				}
			else{
					Node<T> inQueue = null, tmp = head;
					boolean isEqual = (((Contact)tmp.data).compareTo(((Contact)c).getContactname())<=0);
					while(tmp!=null&&isEqual){
						inQueue = tmp;
						tmp = tmp.next;
					}
					inQueue.next = n;
					n.next = tmp;
				}
		}
	}
	
	public void delete(T c){ //This method deletes a chosen contact from the list
		if(current==head)
			head = current = head.next;
		else{
			Node<T> previous = null;
			Node<T> tmp = head;
			while(tmp!=null&&tmp.data!=c){
				previous = tmp;
				tmp = tmp.next;
			}
			if(tmp.data==c){
				previous.next = tmp.next;
			}
		}
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
	
}
