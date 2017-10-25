package CircularTable;

import java.util.Scanner;

public class Trial {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
	int a,l,swordWith,N,d;
	for(int i=1;i<800;i++){
//System.out.println("Enter the number of people sitting around a circular table:");
//int noOfPeople = scan.nextInt();
l=N=i;
a=d=1;
swordWith =l;
while(N>1){
	
//	System.out.println("Person at first position is : "+a+);
	if(N%2==0){
		if(swordWith==a){
			l= a + ((N-2)*d) ;
			d=d*2;
			N=N/2;
			swordWith=a;
		}else{
			a= a + d ;
			d=d*2;
			N=N/2;
			swordWith=l;
		}
	}else{
		if(swordWith==a){

			d=d*2;
			N=N/2+1;
			swordWith=l;
		}else{
			l= a + ((N-2)*d) ;
			a= a + d ;
			d=d*2;
			N=N/2;
			swordWith=a;
		}
	}
	
}
int power =(int) (Math.log(i)/Math.log(2));
double lastManStanding = 2*(i - Math.pow(2, power) +1) - 1;
//System.out.println("Last man left: "+swordWith+", when total no. of people on table is: "+i);
System.out.println(i+"   "+(int)lastManStanding+"   "+swordWith);
	}
	}
}
