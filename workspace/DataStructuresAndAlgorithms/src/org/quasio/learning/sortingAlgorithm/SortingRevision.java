package org.quasio.learning.sortingAlgorithm;

public class SortingRevision {
	static int[] arr = new int[10];

	public static void main(String[] args) {
		populateArray();
		displayArray();
		// System.out.println("\nAfter Bubble Sort :: ");
		// bubbleSort();

		// System.out.println("\nAfter Selection Sort :: ");
		// selectionSort();

		// System.out.println("\nAfter Insertion Sort :: ");
		// insertionSort();

		// System.out.println("\nAfter Shell Sort :: ");
		// shellSort();

		// System.out.println("\nAfter Quick Sort :: ");
		// quickSort(0, arr.length-1);

		System.out.println("\nAfter Merge Sort :: ");
		mergeSort(0, arr.length - 1);
		displayArray();
	}

	public static void mergeSort(int start, int end) {
		if (start >= end)
			return;

		if (end - start >= 2) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int i = 0;
			int j = mid + 1;
			int k = start;
			int itemsInPart1 = mid - start + 1;

			while (k <= end && j<arr.length) {
				if (arr[j] < arr[k]) {
					int temp = arr[j];
					shift(k, j);
					arr[k] = temp;
					j++;
				} else {
					i++;
				}
				if (i > itemsInPart1) {
					j++;
				}
				k++;
			}

		} else {
			if (arr[end] < arr[start]) {
				swap(start, end);
			}

		}

	}

	private static void shift(int start, int end) {
		while (end > start) {
			arr[end] = arr[--end];
		}

	}

	public static void quickSort(int start, int end) {
		if (start > end)
			return;

		int pivotIndex = calculatePivotIndex(start, end);
		quickSort(start, pivotIndex - 1);
		quickSort(pivotIndex + 1, end);
	}

	private static int calculatePivotIndex(int start, int end) {
		int pivotValue = arr[end];
		int pivotIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] < pivotValue) {
				swap(i, pivotIndex);
				pivotIndex++;
			}
		}
		swap(pivotIndex, end);

		return pivotIndex;
	}

	public static void shellSort() {
		int interval = 13;
		while (interval > 0) {
			for (int i = interval; i < arr.length; i++) {
				int temp = arr[i];
				int j = i;
				while (j >= interval && arr[j - interval] > temp) {
					arr[j] = arr[j - interval];
					j -= interval;
				}
				arr[j] = temp;
			}
			interval = (interval - 1) / 3;
		}

	}

	public static void insertionSort() {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[--j];
			}
			arr[j] = temp;
		}
	}

	public static void selectionSort() {
		for (int i = 0; i < arr.length; i++) {
			int minValueIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[minValueIndex] > arr[j]) {
					minValueIndex = j;
				}
			}
			swap(i, minValueIndex);
		}
	}

	public static void bubbleSort() {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(j, j + 1);
				}
			}
		}
	}

	private static void swap(int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	private static void populateArray() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 90);
		}

	}

	private static void displayArray() {
		System.out.println();
		for (int i : arr)
			System.out.println(i);
	}

}
