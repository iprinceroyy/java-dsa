package linkedlist;

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLL list = new CLL();
		list.insert(34);
		list.insert(10);
		list.insert(8);
		list.insert(40);
		list.insert(45);
		list.delete(40);
		list.display();
	}

}
