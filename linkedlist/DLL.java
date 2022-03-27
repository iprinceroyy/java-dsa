package linkedlist;

public class DLL {

	Node head;
	private int size;
	public DLL() { this.size = 0; }

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
			head = node;	
		}
		head = node;
		size++;

	}

	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;

		node.next = null;

		if (head == null) {
			node.prev = null;
			node.next = head;
			head = node;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
		node.prev = last;
		size++;

	}

	public void insert(int after, int val) {

		Node p = find(after);

		if (p == null) {
			System.out.println("doesn't exist");
			return;
		}

		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if (node.next != null)
			node.next.prev = node;
		
		size++;
	}

	public Node find(int val) {
		Node node = head;
		while (node != null) {
			if (node.value == val) {
				return node;
			}
			node = node.next;
		}
		return null;
	}

	public void display() {
		Node temp = head;
		Node last = null; //for having last node to print in reverse
		System.out.print("Head-> ");
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			last = temp;
			temp = temp.next;
		}
		System.out.println("Tail");

		//print in reverse
		System.out.print("Tail-> ");
		while (last != null) {
			System.out.print(last.value + " -> ");
			last = last.prev;
		}
		System.out.println("Head");
	}

	private class Node{

		private int value;
		private Node next;
		private Node prev;

		public Node(int value) { this.value = value; }

		public Node(int value, Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}

}
