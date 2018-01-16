package org.quasio.learning.searchingAlgorithm;

public class BinarySearch {
	static int[] arr = new int[10];

	public static void main(String[] args) {
		generateRandomArray();
		insertionSort();
		printArray();
		binarySearch(3);

	}

	private static void binarySearch(int element) {
		int start = 0;
		int last = arr.length - 1;

		while (!(start > last)) {
			int mid = (last - start) / 2;
			if (element > arr[mid]) {
				start = mid + 1;
			} else if (element < arr[mid]) {
				last = mid - 1;
			} else {
				System.out.println("\nFound a Match for " + element + " at Index " + mid);

				start = last + 1;
			}

		}

	}

	private static void insertionSort() {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int value = arr[i];
			while (j > 0 && arr[j - 1] > value) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = value;
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
/*
 * 
 * public void binarySearchForValue(int value){
 * 
 * int lowIndex = 0; int highIndex = arraySize - 1;
 * 
 * while(lowIndex <= highIndex){
 * 
 * int middleIndex = (highIndex + lowIndex) / 2;
 * 
 * if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
 * 
 * else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
 * 
 * else {
 * 
 * System.out.println("\nFound a Match for " + value + " at Index " +
 * middleIndex);
 * 
 * lowIndex = highIndex + 1;
 * 
 * }
 * 
 * printHorzArray(middleIndex, -1);
 * 
 * }
 * 
 * }
 */
