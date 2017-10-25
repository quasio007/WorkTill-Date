package list.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListRevision {

	public static void main(String... args) {
		Object[] object = {"Hi"};
		List<Integer> intList = new ArrayList<>(); intList.add(2);  intList.add(3);
	 List list =  new ArrayList<>();
	   list.addAll(Arrays.asList(new Object[] {"Start...",1,2,3,4,'A',intList,"Ends"}));
	   
	   for (Object o : list)
	System.out.println(o);
	

	}

}
