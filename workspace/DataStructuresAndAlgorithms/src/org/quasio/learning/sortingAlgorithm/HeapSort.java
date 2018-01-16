package org.quasio.learning.sortingAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class HeapSort {
	static int maxSize = 14;
	static int arrLength = maxSize;
	static int[] arr = new int[maxSize];
	static Map<Integer, Property> depthProtertyMap = new HashMap<>();
	static final int inputLength = 3;

	public static void main(String[] args) {
		populateArray();
		displayArray();
		printTree();
		heapArray();
		printTree();
		System.out.println("\n");
		heapSort();
		displayArray();
		printTree();

	}

	private static void heapSort() {
		for (int i = arr.length - 1; i > 0; i--) {
			int data = pop();
			insert(data, i);
		}
	}

	private static void insert(int data, int index) {
		arr[index] = data;
	}

	private static int pop() {
		int data = arr[0];
		arr[0] = arr[--arrLength];
		heapArray();
		return data;
	}

	private static void heapArray() {
		// i<(arrLength-2)/2, as after that point node will not have any child, so no
		// sense of heaping
		for (int i = (arrLength - 2) / 2; i >= 0; i--) {
			int currentIndex = i;
			while (currentIndex <= (arrLength - 2) / 2) {
				int leftChildIndex = 2 * currentIndex + 1;
				int rightChildIndex = leftChildIndex + 1;
				int biggerChildIndex = leftChildIndex;

				if (!(rightChildIndex >= arrLength)) {
					if (arr[leftChildIndex] > arr[rightChildIndex]) {
						biggerChildIndex = leftChildIndex;
					} else {
						biggerChildIndex = rightChildIndex;
					}
				}

				if (arr[currentIndex] < arr[biggerChildIndex]) {
					swap(currentIndex, biggerChildIndex);
					currentIndex = biggerChildIndex;
				} else {
					break;
				}
			}

		}
	}

	private static void swap(int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}

	private static void populateArray() {
		for (int i = 0; i < arrLength; i++) {
			int random = (int) (Math.random() * 1000);
			arr[i] = random;
		}
	}

	private static void displayArray() {
		for (int i = 0; i < maxSize; i++)
			System.out.println(arr[i]);

		System.out.println();
	}

	private static void printTree() {
		System.out.println("\n\nTree:: ");
		int arrDepth = getDepth(maxSize);
		setMapValues(arrDepth);
		boolean isFirstElementInRow = true;
		int lastDepth = 0;

		for (int i = 0; i < maxSize; i++) {
			int currentDepth = getLogBaseTwo(i + 1);
			int space = depthProtertyMap.get(currentDepth).getSpace();
			int indentation = depthProtertyMap.get(currentDepth).getIndentation();
			String spaceString = getBlankString(space);
			String indentationString = getBlankString(indentation);

			int arrElement = arr[i];
			String modifiedElement = getInputOfFixedSize(arrElement);

			// Check if row has been changed::
			if (currentDepth > lastDepth) {
				System.out.println();
				isFirstElementInRow = true;
				lastDepth = currentDepth;
			}

			if (isFirstElementInRow) {
				System.out.print(indentationString + modifiedElement);
				isFirstElementInRow = false;
			} else {
				System.out.print(spaceString + modifiedElement);
			}

		}

	}

	private static String getBlankString(int num) {
		String returnString = "";
		while (num > 0) {
			returnString += " ";
			num--;
		}
		return returnString;
	}

	private static String getInputOfFixedSize(int input) {
		String returnValue = String.valueOf(input);
		int inputLenght = String.valueOf(input).length();
		if (inputLenght > HeapSort.inputLength) {
			System.out.println("'" + input + "' as a input is not valid");
		}

		switch (inputLenght) {
		case 0:
			returnValue = "000";
			break;
		case 1:
			returnValue = "00" + input;
			break;
		case 2:
			returnValue = "0" + input;
			break;
		case 3:
			break;
		}
		return returnValue;
	}

	private static void setMapValues(int depth) {
		int indentation = 0;
		int space = inputLength;
		depthProtertyMap.put(depth, new Property(indentation, space));

		for (int i = depth - 1; i >= 0; i--) {
			indentation = space;
			space = 2 * space + inputLength;
			depthProtertyMap.put(i, new Property(indentation, space));
		}
	}

	private static int getDepth(int arrLength) {
		if (arrLength == 0) {
			return -1;
		}
		return getLogBaseTwo(arrLength);
	}

	private static int getLogBaseTwo(int arrLength) {
		return (int) (Math.log(arrLength) / Math.log(2));
	}

}

class Property {
	private int indentation;
	private int space;

	public Property(int indentation, int space) {
		this.indentation = indentation;
		this.space = space;
	}

	public int getIndentation() {
		return indentation;
	}

	public int getSpace() {
		return space;
	}

	@Override
	public String toString() {
		return " indentation->" + indentation + " : space->" + space;
	}
}

/*
 * 
 * private static int[] heapSort1() { int[] sortedArr = new int[arrLength]; for
 * (int i = arrLength - 1; i >= 0; i--) { sortedArr[i] = pop(); } return
 * sortedArr; }
 */