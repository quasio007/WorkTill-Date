package benison;

import java.util.Scanner;

public class ReversingNumber {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the nmber :");
	int num = scan.nextInt();
	int rNum =0;
	int temp = num;
	while(temp !=0) {
		rNum = rNum*10 + temp%10;
		temp /= 10;
	}
	
	
	System.out.println("Reverse of "+num+" is: "+rNum);

	}

}
