package amazon;

public class MaxSumOfTwoIntegersInArray {

	private static int[] arr = new int[10];

	public static void main(String[] args) {
		populateValuesInArray();
		displayArray();
		System.out.println(maxSumOfTwoNumbers());
	}

	private static int maxSumOfTwoNumbers() {
		if (arr.length < 2) {
			System.out.println("Array has less than 2 items");
			return -1;
		}
		int sum = arr[0] + arr[1];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tempSum = arr[i] + arr[j];
				if (sum < tempSum) {
					sum = tempSum;
				}
			}
		}
		return sum;
	}

	private static void populateValuesInArray() {
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 30 - 15);
			arr[i] = random;
		}

	}

	private static void displayArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}

}
