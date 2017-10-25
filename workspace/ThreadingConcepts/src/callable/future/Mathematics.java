package callable.future;

public class Mathematics {

	private int b;
	private int a = b = 0;
	public Mathematics(int b, int a) {
		super();
		this.b = b;
		this.a = a;
	}
	public void sum(){
		System.out.println("Sum is:"+(a+b));
	}



}
