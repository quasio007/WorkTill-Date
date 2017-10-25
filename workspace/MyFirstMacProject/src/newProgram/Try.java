package newProgram;

import java.util.Scanner;

import org.apache.commons.lang.ArrayUtils;

public class Try {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int[] b ;
//		int[] a= new int[6];
//		a[0]=1;
//		a[1]=1;
//		a[2]=1;
//		a[3]=1;
//		a[4]=1;
//		a[5]=1;
////		a[6]=1;
		System.out.println("a[]="+a[0]);
		for(int x:a){
			System.out.println(x);}
		System.out.println(" ");
	  b =ArrayUtils.remove(a, 0);
		b =ArrayUtils.remove(b, 0);
		b =ArrayUtils.remove(b, 0);
		for(int x:b)
		System.out.println(x);
		
		
		
//		boolean flag =false ;
//	System.out.println("Enter: ");
//	 String ch = scan.next();
////	 flag=scan.hasNext();
//	System.out.println(ch);
//	System.out.println("flag: "+flag);
		
//	String a[] = {"hello","hi","hey","Mohit"};
//	for(String c : a){
//		if(c.endsWith("i") || c.endsWith("t")){
//			System.out.println(c);
//		}
//		
//	}
		
//	for(int i=0;i<6;i++){
//		for(int j=0;j<5;j++){
//			System.out.println("j= "+j);
//			if(j>2){
//				System.out.println("breaking");
//				break;
//			}
//		}
//		System.out.println("i= "+i);
//	}
//	
}
}
