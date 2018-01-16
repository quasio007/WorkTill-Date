import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 2 };
		System.out.println(solution(a));

	}

	public static int solution(int[] A) {
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			if (A[i] > max)
				max = A[i];
		}

		if (max <= 0)
			return 1;

		Integer[] arr = new Integer[A.length];
		for (int i = 0; i < A.length; i++) {
			arr[i] = A[i];
		}

		Set<Integer> set = new HashSet<>(Arrays.asList(arr));

		int minimumInt = max + 1;

		int count = 1;
		while (count < max) {
			if (!set.contains(count))
				return count;
			count++;
		}
		return minimumInt;
	}

}
