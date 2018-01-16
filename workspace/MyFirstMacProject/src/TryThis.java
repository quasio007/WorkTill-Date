import java.util.ArrayList;
import java.util.List;

public class TryThis {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		list1.add(3);

		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(2);
		list2.add(2);
		list2.add(2);
		list2.add(3);
		
		System.out.println(list1);
	for(int i =0 ; i<list1.size();i++) {
		System.out.println(list1.get(i));
		list1.remove(i);
	
	}


//		list2.retainAll(list1);
//		System.out.println(list2);

		//list1.stream().filter(i-> list2.contains(i)).collect(Collectors.toSet()).forEach(System.out::println);

		

	}

}
