package list.Interface;

public class VeryImpLambdaExample {
static Dem1 d =new Dem1();
	public static void main(String[] args) {
		
	System.out.println("Multiplication value is : '"+ d1(VeryImpLambdaExample::multiply) + "'");
	
	System.out.println("\n");
	System.out.println("Addition value is : '"+ d1(VeryImpLambdaExample.d::sum) + "'");

	System.out.println("\n");
	System.out.println("Subtraction value is : '"+ d1(VeryImpLambdaExample.d::diff) + "'");


	}
	
	static int  d1(Calculate cal) {
	return cal.calci(2, 3);	
	}
	
	static int  multiply(int a,int b) {
		return a*b;
	}

}

class Dem1{
	int sum(int a,int b) {
		return a+b;
	}
	int diff(int a,int b) {
		return a-b;
	}
}

interface Calculate{
	int calci(int a, int b);
}
