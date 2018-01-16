package org.quasio.learning.sortingAlgorithm;

public class QuickSort {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		generateRandomArray();
		quickSort(0, arr.length - 1);
		printArray();

	}

	private static void quickSort(int start, int end) {
		if (start > end) {
			return;
		}
		int pivot = pivot(start, end);

		quickSort(start, pivot - 1);
		quickSort(pivot + 1, end);
		return;
	}

	private static int pivot(int start, int end) {
		int pivot = arr[end];
		int pivotPos = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				swap(i, pivotPos);
				pivotPos += 1;
			}
		}
		swap(pivotPos, end);
		return pivotPos;
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

	private static int[] generateRandomArray() {
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 20) + 1;

		return arr;
	}

}

/*
 * package org.quasio.learning.sortingAlgorithm;
 * 
 * public class QuickSort {
 * 
 * public static void main(String[] args) { int[] array = generateRandomArray();
 * printArray(quickSort(0, array.length - 1, array)); }
 * 
 * private static int[] quickSort(int start, int end, int... arr) { if (start >
 * end) { return arr; }
 * 
 * int pivot = arr[end]; int pivotPos = start; for (int i = start; i < end; i++)
 * { if (arr[i] <= pivot) { arr = swap(i, pivotPos, arr); pivotPos += 1; } } arr
 * = swap(pivotPos, end, arr); arr = quickSort(start, pivotPos - 1, arr); arr =
 * quickSort(pivotPos + 1, end, arr); return arr; }
 * 
 * private static int[] swap(int i, int j, int... arr) { int temp = arr[i];
 * arr[i] = arr[j]; arr[j] = temp; return arr; }
 * 
 * private static void printArray(int... arr) { for (int i = 0; i < arr.length;
 * i++) System.out.println(arr[i]);
 * 
 * }
 * 
 * private static int[] generateRandomArray() { int[] arr = new int[10]; for
 * (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 20) + 1;
 * 
 * return arr; }
 * 
 * }
 */
