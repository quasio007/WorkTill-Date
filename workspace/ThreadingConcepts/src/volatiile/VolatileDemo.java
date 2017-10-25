package volatiile;

import java.util.Scanner;

public class VolatileDemo {

	public static void main(String[] args) {
		Myclass t1 =new Myclass();
		
		t1.start();
		System.out.println("Enter any Key to stop");
		Scanner scan =new Scanner(System.in);
		scan.nextLine();
		t1.shutDown();
		scan.close();
		
		

	}

}
