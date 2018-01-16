package org.quasio.learning.sortingAlgorithm;

public class SelectionSort {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		generateRandomArray();
		selectionSort();
		printArray();

	}

	private static void selectionSort() {
		for (int i = 0; i < arr.length; i++) {
			int pos = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[pos] > arr[j]) {
					pos = j;
				}
			}
			swap(i, pos);
		}
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray() {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private static void generateRandomArray() {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 20) + 1;
	}

}
