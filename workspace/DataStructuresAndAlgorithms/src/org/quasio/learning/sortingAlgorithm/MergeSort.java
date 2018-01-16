package org.quasio.learning.sortingAlgorithm;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("MergeSort:: \n");
		int[] arr = generateRandomArray();
		printArray(mergeSort(arr));
	}

	private static int[] mergeSort(int... arr) {
		if (arr.length < 2) {
			return arr;
		}

		int mid = arr.length / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];
		int j = 0;
		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[j++];
		}
		for (int i = 0; i < arr.length - mid; i++) {
			rightArr[i] = arr[j++];
		}
		int[] sortedArr1 = mergeSort(leftArr);
		int[] sortedArr2 = mergeSort(rightArr);

		return combinedArray(sortedArr1, sortedArr2);
	}

	private static int[] combinedArray(int[] arr1, int[] arr2) {
		int i, j, k;
		int[] arr = new int[arr1.length + arr2.length];

		i = j = k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				arr[k++] = arr1[i++];
			} else {
				arr[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			arr[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr[k++] = arr2[j++];
		}

		return arr;
	}

	private static void printArray(int... arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

	private static int[] generateRandomArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 20) + 1;

		return arr;
	}

}
