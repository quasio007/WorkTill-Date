package threeDplm;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String... str) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a string in which you want to find first non repeating character");
		String userInput = scan.nextLine();
		System.out.println(firstNonRepeatingCharacter(userInput));
		scan.close();
	}

	public static Character firstNonRepeatingCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean isRepeating = false;
			String current = str.substring(i, i + 1);
			for (int j = 0; j < str.length(); j++) {
				if (i != j) {

					String temp = str.substring(j, j + 1);
					if (current.equalsIgnoreCase(temp)) {
						isRepeating = true;
					}

				}
			}
			if (!isRepeating) {
				return current.charAt(0);
			}
		}
		System.out.println("All character are repeating");
		return null;
	}

}