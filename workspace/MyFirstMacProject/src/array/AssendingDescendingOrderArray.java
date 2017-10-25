package array;

import java.util.Scanner;

public class AssendingDescendingOrderArray {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int i ,j=0 ,temp=0;
		System.out.println("Enter the number of terms in array :");
		int numOfTerms = scan.nextInt();
		int[] a = new int[numOfTerms];
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
		System.out.println(" ");
		
		for(i=0;i<numOfTerms-1;i++){
			for(j=0;j<numOfTerms-1;j++){
				if(a[j]>a[j+1]){
					temp=a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Assending order Array is: ");
		for(j=0;j<numOfTerms;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		temp=0;
		for(i=0;i<numOfTerms-1;i++){
			for(j=0;j<numOfTerms-1;j++){
				if(a[j]<a[j+1]){
					temp=a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending order Array is: ");
		for(j=0;j<numOfTerms;j++){
			System.out.print(a[j]+" ");
		}
	}

}
