
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		String[] s = new String[4];
		double[] d = new double[4];
//		for (int b : a) {
//			System.out.println(b);
//		}
//		System.out.println(a[4]);
		try {
//			System.out.println(100/0);
			System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Check1");
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			
			System.out.println("Check2");
//			e.getStackTrace();
			System.out.println("Check3");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Check4");
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
		}

		for (String b : s) {
			System.out.println(b);
		}

		for (double b : d) {
			System.out.println(b);
		}
	}

}
