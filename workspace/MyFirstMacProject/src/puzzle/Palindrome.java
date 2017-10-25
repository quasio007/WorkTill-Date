package puzzle;

import java.util.Scanner;

public class Palindrome {
	public static Scanner scan =new Scanner(System.in);
public static void main(String[] args){
	System.out.println("Enter the name which you want to check is a palindrome or not : ");
	String value = scan.nextLine();
	int length =value.length();
	int i= length/2;
	int lp = length-1;
	boolean flag =true;
	System.out.println("Entered value is '"+value+"' which is of lenght :"+length);

	
//	if(!(length%2==0)){
		
		for(int j=0;j<i;j++){
			if(!(value.charAt(j) == value.charAt(lp))){
				System.out.println("Entered '"+value+"' is not a palindrome");
				flag = false;
				break;
				
			}
			lp--;
		}
		if(flag){
			System.out.println("Entered '"+value+"' is  a palindrome");
		}
//	}
	
}
}
