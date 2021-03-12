package Warren_Lab05;

import Warren_Lab05.Warren_Lab05.DoublyLinkedList.Node;

public class DoublyLinkedList {

	static class Node<A> {
		private A element;

		private Node<A> previous;

		private Node<A> next;

		
		public Node(A A, Node<A> p, Node<A> n) {
			element = A;
			previous = p;
			next = n;
		} 
		
		public Node(A a) {
			 next= null;
			 previous = null;
			 element=a;
		 }

		public A getElement() {
			return element;
		}

		public Node<A> getPrevious() {
			return previous;
		}

		public Node<A> getNext() {
			return next;
		}

		public void setPrevious(Node<A> p) {
			previous = p;
		}

		public void setNext(Node<A> n) {
			next = n;
		}

	}

	private Node<A> head;

	private Node<A> trail;

	private int length = 0;

	public DoublyLinkedList() {

		head = null; 

		trail = null; 

		length = 0;
	}

	public int getLength() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public A start() {

		if (isEmpty())
			return null;

		return head.getNext().getElement();

	}

	public A end() {

		if (isEmpty())
			return null;

		return trail.getPrevious().getElement();

	}

//public update methods 
	// adds element A to the front of the list

	public void addFirst(A a){
		Node<A> newest = new Node<>(a);
		if (head ==null) {
			head=newest;
			trail=newest;
		}
		
		else { 
			head.setPrevious(newest);
			newest.setNext(head);
			head=newest;
		}
		length++;
	}

	// Adds an element to the end of the list
	public void addLast(A a) {
		addBetween(a, trail.getPrevious(), trail);
	}

	// Update methods
	// Adds element A to the linked list in between the given nodes
	private void addBetween(A a, Node<A> predecessor, Node<A> successor) {
		// creating and linking a new node
		Node<A> newest = new Node<>(a, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrevious(newest);
		length++;
	}
	
	private A remove(Node<A> node){ 
		Node<A> predecessor = node.getPrevious();
		Node<A> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrevious(predecessor);
		length--;
		return node.getElement();
	}
	
	//Removes and returns the first element of the list 
	public A removeFirst(){
		if(isEmpty()) 
			return null;
		return remove(head.getNext());
	}
	
	//Removes and returns the last element of the list 
	public A removeLast(){
		if(isEmpty()) 
		return null;
		return remove(trail.getPrevious());
	}
	
   

	public String toString() {
		// initializing the variables
		Node<A> currentNode = head;
		String str= "";
		// Validating
		while (currentNode!= null) {
			str+= currentNode.getElement() + " ";
		currentNode.getElement();
			currentNode = currentNode.getNext();// updating the node order
		}
		return str;
	} 

}

}
