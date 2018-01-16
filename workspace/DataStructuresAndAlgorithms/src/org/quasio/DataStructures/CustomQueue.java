package org.quasio.DataStructures;

public class CustomQueue<E> {

	private Object arr[];
	private int front;
	private int rear;
	private int size;

	public CustomQueue() {
		arr = new Object[5];
	}
	
	public static void main(String[] args) {
		CustomQueue<Integer> q = new CustomQueue<>();
		System.out.println(q.add(12)+"\n");
		System.out.println(q.add(18)+"\n");
		System.out.println(q.add(16)+"\n");
		System.out.println(q.add(21)+"\n");
		System.out.println(q.add(24)+"\n");
		System.out.println(q.add(27)+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.remove()+"\n");
		System.out.println(q.element()+"\n");
	}

	public boolean add(E element) {
		if (rear < arr.length) {
			arr[rear++] = element;
			size++;
			return true;
		} else {
			System.out.println("Queue is full, Can not add " + element);
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public E remove() {
		if (size > 0) {
			size--;
			return (E) arr[front++];
		} else {
			System.out.println("Queue is empty");
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public E element() {
		if (size > 0) {
			return (E) arr[front];
		} else {
			System.out.println("Queue is empty");
			return null;
		}
	}

}
