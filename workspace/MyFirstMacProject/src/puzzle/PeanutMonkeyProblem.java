package puzzle;

public class PeanutMonkeyProblem {

	public static void main(String[] args) {
//		double x=0;
//		boolean flag =false;
		for(double y=0;y<900000;y++){
			double temp = 279936*y;
			temp =temp + 186186;
			if(temp%15625 ==0){
				System.out.println(y);
			}
		}	
		System.out.println("check");
	}

}
