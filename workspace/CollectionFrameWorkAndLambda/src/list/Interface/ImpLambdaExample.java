package list.Interface;

import java.util.function.BiConsumer;

public class ImpLambdaExample {
static Dem d =new Dem();
	public static void main(String[] args) {
		
	d1(ImpLambdaExample::multiply);
	System.out.println("\n");
	d1(ImpLambdaExample.d::sum);
	System.out.println("\n");
	d1(ImpLambdaExample.d::diff);

	}
	
	static void  d1(BiConsumer<Integer, Integer> con) {
	con.accept(2, 3);	
	}
	
	static void  multiply(int a,int b) {
		System.out.println("Multiplication is "+(a*b));
	}

}

class Dem{
	void sum(int a,int b) {
		System.out.println("Sum is "+(a+b));
	}
	void diff(int a,int b) {
		System.out.println("Difference is "+(a-b));
	}
}
