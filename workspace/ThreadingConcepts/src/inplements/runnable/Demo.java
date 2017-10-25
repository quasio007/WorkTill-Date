package inplements.runnable;

public class Demo {

	public static void main(String[] args) {
	Thread t1 =new Thread(new Myclass());
	Thread t2 =new Thread(new Myclass());
	t1.start();
	t2.start();
	

	}

}
