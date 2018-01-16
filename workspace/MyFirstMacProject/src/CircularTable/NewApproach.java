package CircularTable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewApproach {

	public static void main(String[] args) {
		int numOfpeople = 100;
		int skip =0;
		int step = skip + 1;
		int statringPosition =1;
		int remainder;
		List<Integer> list = Stream.iterate(1, i -> i + 1).limit(numOfpeople).collect(Collectors.toList());
		while (list.size() > step) {
			remainder = (list.size()-statringPosition)%step;
		}

	}

}


//  step - ((list.size() - startingPosition)%steps) 
// ans -1 : position