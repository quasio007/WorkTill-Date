package org.quasio.learning.sortingAlgorithm;

public class ShellSort {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		System.out.println("Shell Sort::");
		generateRandomArray();
		shellSort();
		printArray();
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}

	private static void shellSort() {
		int interval = 13;

		while (interval > 0) {

			for (int outer = interval; outer < arr.length; outer++) {
				int temp = arr[outer];
				int inner = outer;
				while (inner > interval - 1 && arr[inner - interval] > temp) {
					arr[inner] = arr[inner - interval];
					inner -= interval;
				}
				arr[inner] = temp;
			}
			interval = (interval - 1) / 3;
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
