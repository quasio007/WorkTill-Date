package threeDplm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenString3DPLMCodingQuestion {

	public static void main(String... args) {
		String str = "aaabaabbbb";

		System.out.println(isEven(str));

	}

	private static boolean isEven(String str) {
		Map<Character, List<Integer>> map = new HashMap<>();

		if (str.length() == 0) {
			System.out.println("Please send a valid string of length >0");
			return false;
		}
		if (str.length() == 1) {
			return true;
		}

		for (int i = 0; i < str.length(); i++) {
			List<Integer> list = new ArrayList<>();
			int position = i;
			Character c = str.charAt(i);
			if (!map.keySet().contains(c)) {
				list.add(position);
				map.put(c, list);
			} else {
				map.get(c).add(position);
			}
		}
		int listSize = 0, finalListSize = 0;
		boolean isEven = true;
		for (Character c : map.keySet()) {
			listSize = map.get(c).size();
			if (finalListSize == 0) {
				finalListSize = listSize;
			} else {
				if (finalListSize != listSize) {
					isEven = false;
				}
			}
		}
		return isEven;
	}
}

