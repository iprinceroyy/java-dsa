package linkedlist;

public class DLL {

	private Node head;
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
