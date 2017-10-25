
public class Error {
	public static void main(String[] args) throws Throwable {
		f1();
	}
	static void f1() throws Exception{
		double a =100/0;
		System.out.println(a);
	}
}
