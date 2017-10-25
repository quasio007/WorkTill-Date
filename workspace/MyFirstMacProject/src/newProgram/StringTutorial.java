package newProgram;

public class StringTutorial {

	

	public static void main(String[] args) {
		String test="Hello";
//		char[] c= test.toCharArray();
//		for(char t : c){
//			System.out.println(t);
//		}
//		int[] in={1,2,3,4};
//		System.out.println(" ");
//		for(int t : in){
//			System.out.println(in);
//		}
		try{
			test.wait();
		} catch(Exception e){
			System.out.println(e.getStackTrace());
			System.out.println("Error found");
			System.out.println(e.getMessage());
		}
		try {
			test.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
