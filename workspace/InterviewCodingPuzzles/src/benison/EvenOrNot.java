package benison;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		final Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if ((num & 1) == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		scan.close();
	}
	
	
	

}
