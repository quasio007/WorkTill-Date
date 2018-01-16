package org.quasio.learning.sortingAlgorithm;

public class BubbleSort {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		generateRandomArray();
		bubbleSort();
		printArray();

	}

	private static void bubbleSort() {
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(j,j+1);
				}
			}
		}
	}

	private static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j] =temp;
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
