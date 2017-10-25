package array;

import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;


public class DeletingAnElement {

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
		System.out.println("Enter the element you want to delete :");
		term =scan.nextInt();
		
//		Finding location of the term in array:
		for(i=0;i<numOfTerms;i++){
			if(term==a[i]){
				b[l]=i;
				flag=true;
				l++;
			}
		}
		
		if(flag){
			int temp =0;
			for(int m=0;m<l;m++){
				a = ArrayUtils.remove(a, b[m]-temp);	
				temp++;
			}
			System.out.println(" ");
			System.out.println("Array after deleting elements: ");
			for(int x : a){
				System.out.print(x+" ");
			}
			
			
		}else{
			System.out.println("Elelent '"+term+"' not found in the array");
		}
		
/* Old Logic:
 	System.out.println("Position:"+pos);
		for(int k=0;k<numOfTerms-1;k++){
			if(k>=pos){
			a[k]=a[k+1];
			}
		}
 */

	}

}
