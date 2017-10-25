package CircularTable;

import java.util.Scanner;

public class FormulaForGettingLastManWhenStartingFromFirst {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of people sitting around a circular table:");
		double noOfPeople = scan.nextInt();

		// int power =(int) (Math.log(noOfPeople)/Math.log(2));
		// double lastManStanding = 2*(noOfPeople - Math.pow(2, power)) + 1;

		double lastManStanding = 2 * (noOfPeople - Math.pow(2, (int) (Math.log(noOfPeople) / Math.log(2)))) + 1;

		System.out.println("Last man left: " + (int) lastManStanding);
	}

}
