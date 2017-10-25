package extend.thread;

public class Demo {

	public static void main(String[] args) {
		Myclass t1 =new Myclass();
		Myclass t2 =new Myclass();
		t1.start();
		t2.start();
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());

	}

}
