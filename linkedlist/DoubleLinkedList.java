package linkedlist;

public class DoubleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL list = new DLL();
		list.insertFirst(23);
		list.insertFirst(12);
		list.insertFirst(1);
		list.insertFirst(40);
		list.insertFirst(10);
		list.insertLast(50);
		list.insert(1, 34);
		list.display();

	}

}
