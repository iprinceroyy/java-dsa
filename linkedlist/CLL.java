package linkedlist;

public class CLL {

	private Node head;
	private Node tail;
	private int size;
	public CLL() { this.size = 0; }	

	public void insert(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
		size++;
	}
	
	public void delete(int val) {
		Node temp = head;
		
		if (temp == null) return;
		
		if (head == tail) {
			head = null;
			tail = null;
			return;
		}
		
		if (temp.value == val) {
			temp = temp.next;
			tail.next = temp;
			return;
		}
		
		do {
			Node n = temp.next;
			if (n.value == val) {
				temp.next = n.next;
				break;
			}
			temp = temp.next;
		} while (temp != head);
	}

	public void display() {
		Node temp = head;
		if (head != null) {
			do {
				System.out.print(temp.value + " -> ");
				if (temp.next != null)
					temp = temp.next;
				
			} while (temp != head);
		}
		System.out.println("Head");
	}


	private class Node{
		private int value;
		private Node next;

		public Node(int value) { this.value = value; }

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
