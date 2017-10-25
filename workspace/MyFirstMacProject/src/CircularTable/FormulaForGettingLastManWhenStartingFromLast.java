package CircularTable;

import java.util.Scanner;

public class FormulaForGettingLastManWhenStartingFromLast {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of people sitting around a circular table:");
		double noOfPeople = scan.nextInt();
		double lastManStanding;
		
		double power = (Math.log(noOfPeople)/Math.log(2));
		double decimalPart = Math.floor(power);
		System.out.println(power-decimalPart);
		if(power-decimalPart == 0.0){
			lastManStanding =noOfPeople;
		}else{
		    lastManStanding = 2*(noOfPeople - Math.pow(2, (int)power));
		}
		System.out.println("Last man left: "+(int)lastManStanding);
		

	}


}
