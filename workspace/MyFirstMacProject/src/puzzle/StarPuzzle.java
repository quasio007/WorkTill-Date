package puzzle;

import java.util.Scanner;

public class StarPuzzle {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of stars in middle line :");
		int num = scan.nextInt();
		int loopCount = 2*(num-1) + 1;
		String space =null;
		String impPart = null;
		for(int i=1;i<=loopCount;i++){
//		loop for spaces:	
			if(i<=num){
					space ="";
				 impPart = "*";
				 for(int j=0;j<num-i;j++){
					 space=space+"#";
				 }
				 for(int k=1;k<i;k++){
					 impPart = impPart+"$*";
				 }
			}
			else{
				space ="";
				 impPart = "*";
				 for(int l=0;l<i-num;l++){
					 space=space+"#";
				 }
				 for(int m=num-1;m>i-num;m--){
					 impPart = impPart+"$*";
				 } 
			}
			System.out.println(space + impPart + space);
			
		}
		

	}

}


//System.out.println("Enter your Name: ");
//String name = scan.nextLine();
//
//System.out.println("Enter the Age:");
//int age = scan.nextInt();
//
//
//System.out.println(name + " is " + age + " years old");