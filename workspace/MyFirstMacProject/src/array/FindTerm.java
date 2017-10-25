package array;

import java.util.Scanner;

public class FindTerm {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int i ,j ,term,l=0;
		boolean flag =false;
		
		System.out.println("Enter the number of terms in array :");
		int numOfTerms = scan.nextInt();
		int[] a = new int[numOfTerms];
		int[] b =new int[numOfTerms];
		System.out.println("Enter the elements of array :");
		
		for(i=0;i<numOfTerms;i++){
			System.out.println(i+1+"term : ");
			 a[i] = scan.nextInt();
		}
		System.out.println("Entered array is : ");
		for(j=0;j<numOfTerms;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println(" ");
		System.out.println("Enter the element you find to find :");
		term =scan.nextInt();
		for(i=0;i<numOfTerms;i++){
			if(term==a[i]){
				b[l]=i;
				flag=true;
				l++;
			}
		}
		

		if(flag){
			System.out.print("Elelent '"+term+"' found at ");
			for(int m=0;m<l;m++){
				System.out.print("a["+b[m]+ "] ");
			}
			System.out.println(" ");
		}else{
			System.out.println("Elelent '"+term+"' not found");
		}
	}

}
