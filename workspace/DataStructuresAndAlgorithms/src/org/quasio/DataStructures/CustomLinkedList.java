package org.quasio.DataStructures;

public class CustomLinkedList<E> {
	public static void main(String[] args) {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.display();
		System.out.println();
		list.add("Aman");
		list.add("Bhavya");
		list.add("Chayal");
		list.add("Dhawan");
		list.display();
		System.out.println();
		System.out.println(list.get(6));
	}

	private Link<E> head;

	CustomLinkedList() {

	}

	static class Link<E> {
		E data;
		Link<E> next;

		Link(E data) {
			this.data = data;
		}
	}

	public E get(int index) {
		if (head == null) {
			System.out.println("List is Empty!!!");
			return null;
		}
		Link<E> current = head;
		int i = 0;
		while (current != null && i < index) {
			current = current.next;
			i++;
		}
		if (current == null) {
			System.out.println("Not sufficient elements in list");
			System.out.println("List size : " + i);
			return null;
		}

		return current.data;
	}

	public boolean add(E data) {
		Link<E> entry = new Link<E>(data);
		if (head == null) {
			head = entry;
			return true;
		}
		Link<E> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = entry;
		return true;
	}

	public boolean remove(E data) {
		if (head == null) {
			return false;
		}
		if (head.data.equals(data)) {
			head = head.next;
			return true;
		}
		Link<E> current = head;
		Link<E> previous = null;
		while (current != null && !(current.data.equals(data))) {
			previous = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println(data + " is not present in list.");
			return false;
		}
		previous.next = current.next;

		return true;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is Empty!!!");
			return;
		}
		Link<E> current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

}


/*
 * System.out.println(); list.remove("Mohit"); list.remove("Bhavya");
 * list.display(); System.out.println(); list.remove("Aman"); list.display();
 * System.out.println(); list.remove("Dhawan"); list.display();
 * System.out.println(); list.remove("Aman"); list.display();
 */
