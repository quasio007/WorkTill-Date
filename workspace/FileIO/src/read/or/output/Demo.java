package read.or.output;

public class Demo {
public static void main(String... args) {
A a =new A();
}

}

class A{
	
	static A a1 =new A(2);
	
	 A(int id){
		System.out.println(id);
	}
	
	A(){
		System.out.println("Normal Constructor");
	}
}






/*
 	public static void main(String[] args) {
	System.out.println(get());

	}
	
	@SuppressWarnings("finally")
	public static int get() {
	try {
		return 0;
		} catch (Exception e) {
			
		}finally {
			return 1;
		}
	}

 */