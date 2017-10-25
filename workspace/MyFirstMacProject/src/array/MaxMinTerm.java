package array;

import java.util.Scanner;

public class MaxMinTerm {
static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int i ,j ,max =0,min=0;
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
		max=a[0];
		min=a[0];
		for(i=0;i<numOfTerms-1;i++){
			if(a[i+1]>max){
				max=a[i+1];
			}
			if(a[i+1]<min){
				min=a[i+1];
			}
		}
		

		System.out.println(" ");
		System.out.println("Maximum term in array is : " +max);
		System.out.println("Minimum term in array is : " +min);
	}

}
