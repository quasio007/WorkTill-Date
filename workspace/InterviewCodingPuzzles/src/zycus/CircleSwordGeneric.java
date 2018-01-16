package zycus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CircleSwordGeneric {
public static void main(String...str) {
	int step = 1;
	int totalNumberOfPeople =100;
	int initiallySwordWith =0;
	List<Integer> list =Stream.iterate(1,i->i+1).limit(totalNumberOfPeople).collect(Collectors.toList());
	System.out.println(lastSurvivor(list,step,initiallySwordWith));
}

private static int lastSurvivor(List<Integer> list, int step, int swordWith) {
//	int skip =step-1;
	
	while(list.size() > 1) {
		int nextIterationStartingPosition = swordWith;
		
		
	}
	
	
	
	return 0;
}
}
