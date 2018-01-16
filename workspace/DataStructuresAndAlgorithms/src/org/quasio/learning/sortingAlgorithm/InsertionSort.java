package org.quasio.learning.sortingAlgorithm;

public class InsertionSort {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		generateRandomArray();
		insertionSort();
		printArray();

	}

	private static void insertionSort() {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int value = arr[i];
			while (j > 0 && arr[j-1] > value) {
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=value;
		}
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
