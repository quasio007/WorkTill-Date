package newProgram;

public class RecurrenceFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
//System.out.println(factorial(n));
System.out.println(three(n));
	}
public static int factorial(int n){
	
	if(n==0){
		return 1;
	}else 
		return n*factorial(n-1);
}
public static int three(int n){
	int x;
	if(n==0){
		return 1;
	}else if(n%2==0){
		x= three(n/2);
		return x*x;
	}else{
		return 3*three(n-1);
	}
}
}
