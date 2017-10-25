import org.apache.commons.lang.ArrayUtils;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = {1,5,3,8,34,1,3};
		System.out.println("Before :");
		for(int i :arr)
			System.out.println(i);
		
//		Arrays.sort(arr);
//		
//		System.out.println("\n After Sort : ");
//		for(int i :arr)
//			System.out.println(i);
		
		ArrayUtils.remove(arr, 1);
		
		System.out.println("After :");
		for(int i :arr)
			System.out.println(i);
	}

}
