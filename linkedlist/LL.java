package linkedlist;

public class LL {

	private Node head;
	private Node tail;
	private int size;
	public LL(){
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if (tail == null) {
			tail = head;
		}
		size++;	
	}
	
	public void insertLast(int val) {
		if (tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int val, int pos) {
		if (pos == 0) {
			insertFirst(val);
			return;
		}
		
		if (pos == size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}
	
	public int deleteFirst() {
		int val = head.value;
		head = head.next;
		if (tail == head) tail = null;
		size--;
		
		return val;
	}
	
	public int deleteLast() {
		int val = tail.value;
		if (head == tail) {
			return deleteFirst();
		}

		Node temp = head;
		for (int i = 1; i < size-1; i++) {
			temp = temp.next;
		}
		tail = temp;
		tail.next = null;
		size--;
		return val;
	}
	
	public int delete(int index) {
		
		if (index == 0) return deleteFirst();
		
		if (index == size-1) return deleteLast();
		
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		int val = temp.value;
		temp.next = temp.next.next;
		size--;
		
		return val;
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		Node temp = head;
		System.out.print("Head-> ");
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
