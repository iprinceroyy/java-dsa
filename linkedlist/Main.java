package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		list.insertFirst(2);
		list.insertFirst(7);
		list.insertFirst(1);
		list.insertFirst(23);
		list.insertFirst(19);
		list.insertLast(10);
		list.insert(100, 3);
		list.display();
		System.out.println("first deleted item " + list.deleteFirst());
		System.out.println("last deteled item " + list.deleteLast());
		System.out.println("deteled item " + list.delete(2));
		list.display();
		System.out.println("size = " + list.size());

	}

}
