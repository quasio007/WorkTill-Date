
public class Demo2 {
static int j =I.i;
	public static void main(String[] args) {
	
		I i =new B2();
		i.m1();
		
//		B1 b =new B1();
//		b.printClassName();
		
		

	}

}

class B1 extends  A implements I{
	B1(){
		System.out.println("In B");
	}
}

class Parent {
	static int i =setI();

	private static int setI() {
		System.out.println("From setI()");
		return 0;
	}
	
	static void printClassName() {
		System.out.println("Parent");
	}


	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class A extends Parent {
	static A a  =new A(2);
	public static final int i = getI();
	
	static void printClassName() {
		System.out.println("A");
	}

	static int getI() {
		System.out.println("In I");
		System.out.println(i);
		return i;
	}
	
	
	
	static int c = 12;
	
	A(){
		System.out.println("Normal constructor");
	}
	
	A(int i){
		System.out.println(i);
	}
	
	static void main() {
		A a  = new A();
	}
}






interface I{
	public static final int i = getI();
	public static final int j = getJ();

	public static int getI() {
		System.out.println("In I");
		System.out.println(i);
		return i;
	}

	public static int getJ() {
		System.out.println("In J");
		System.out.println(j);
		return j;
	}
	
	void m1();
//	default int d() {
//		System.out.println("");
//		return 0;
//	}
}

class B2 implements I{
	B2(){
		System.out.println("In B");
	}
	
	public int d() {
		System.out.println("From B2");
		return 0;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1()");
	}

}

/*
 
	public static void main(String[] args) {
		A.main();
		System.out.println("Check");
		B1 b1 = new B1();
		System.out.println("\n\n\n");
		B2 i =new B2();
	    System.out.println(i.i);
		System.out.println(I.i);
		System.out.println(I.i);
	    E1 e= E1.check;
	    System.out.println(e);

	}

}

enum E implements I{}


 */








