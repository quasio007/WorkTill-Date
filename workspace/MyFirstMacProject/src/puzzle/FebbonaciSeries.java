package puzzle;

import java.util.Scanner;

public class FebbonaciSeries {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of terms you want in series: ");
		int num = scan.nextInt();
		System.out.println("Below is the Febonnaci Series with "+num+" terms");
		int seriesNum =0 , lastTerm =1 ,temp = 0;
		System.out.print(seriesNum);
		
		for(int i=1; i<num;i++){
			temp = seriesNum;
			seriesNum =seriesNum + lastTerm;
			lastTerm =temp;
			System.out.print(", "+seriesNum);
		}
	}

}
