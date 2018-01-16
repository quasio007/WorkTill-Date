package list.Interface;

import java.util.Arrays;
import java.util.List;

public class Aditya {

	public static void main(String[] args) {
List<Integer> list1 = Arrays.asList(1,2,3,4,5);

List<Integer> list2 = Arrays.asList(2,7);
list1.retainAll(list2);

System.out.println(list1);

	}

}
