package CircularTable;

import java.util.Scanner;

public class Trial2 {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
	int a,l,swordWith,N,d;
	for(int i=1;i<30;i++){
//System.out.println("Enter the number of people sitting around a circular table:");
//int noOfPeople = scan.nextInt();
l=N=i;
a=d=1;
swordWith =a;
while(N>2){
	
//	System.out.println("Person at first position is : "+a+);
	if(N%2==0){
		if(swordWith==a){
			l= a + ((N-2)*d) ;
			d=d*3;
			N=N/2;
			swordWith=a;
		}else{
			a= a + d ;
			d=d*3;
			N=N/2;
			swordWith=l;
		}
	}else{
		if(swordWith==a){

			d=d*3;
			N=N/2+1;
			swordWith=l;
		}else{
			l= a + ((N-2)*d) ;
			a= a + d ;
			d=d*3;
			N=N/2;
			swordWith=a;
		}
	}
	
}
//System.out.println("Last man left: "+swordWith+", when total no. of people on table is: "+i);
System.out.println(i+"  "+swordWith);
	}
	}
}
