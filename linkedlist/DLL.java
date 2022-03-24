package linkedlist;

public class DLL {

	private Node head;
	private Node tail;
	private int size;
	public DLL() { this.size = 0; }
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
			return;
			
		}
		head = node;
		
	}
	
	public void display() {
		Node temp = head;
		System.out.print("Head-> ");
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("Tail");
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
