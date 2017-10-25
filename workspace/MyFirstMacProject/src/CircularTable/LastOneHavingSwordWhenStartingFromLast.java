package CircularTable;

import java.util.Scanner;

public class LastOneHavingSwordWhenStartingFromLast {
static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
	int a,l,swordWith,N,d,round;
	
System.out.println("Enter the number of people sitting around a circular table:");
int noOfPeople = scan.nextInt();
l=N=noOfPeople;
a=d=round=1;
swordWith =l;
//Initial Condition:
System.out.println("At the start:");
System.out.println("Person at first position is : "+a+"   "+"Person at last position is : "+l+"   "+"No. of people on table: "+N+"  "+" Sword with: "+swordWith);
System.out.println(" ");
while(N>1){
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
	System.out.println("After Round '"+round+"' :");
	System.out.println("Person at first position is : "+a+"   "+"Person at last position is : "+l+"   "+"No. of people on table: "+N+"  "+" Sword with: "+swordWith);
	System.out.println(" ");
	round++;
}
System.out.println("Last man left: "+swordWith);
	}


}
