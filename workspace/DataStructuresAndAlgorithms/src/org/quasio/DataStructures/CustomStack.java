package org.quasio.DataStructures;

public class CustomStack<E> {
	private Object[] arr;
	private int size = 5;
	private int top = -1;

	public CustomStack() {
		arr = new Object[size];
	}

	public static void main(String[] args) {
		CustomStack<String> c = new CustomStack<>();
		c.pop();
		c.push("Aman");
		c.push("Gaurav");
		c.push("Chayal");
		c.push("Abhinav");
		c.push("Dravid");
		System.out.println(c.pop());
		System.out.println(c.peek());
		System.out.println();
		c.display();

	}

	private void display() {
		if (top != -1) {
			System.out.print("[ ");
			for (int i = top; i >= 0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("]");
		} else {
			System.out.println("Stack is empty");
		}
	}

	public boolean push(E element) {
		if (top + 1 < size) {
			arr[++top] = element;
			return true;
		} else {
			System.out.println("Stack is full");
			return false;
		}

	}

	@SuppressWarnings("unchecked")
	public E pop() {
		if (top != -1) {
			return (E) arr[top--];
		} else {
			System.out.println("Stack is empty");
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public E peek() {
		if (top != -1) {
			return (E) arr[top];
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}

}
