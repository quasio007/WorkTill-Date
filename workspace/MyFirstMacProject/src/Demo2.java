
public class Demo2 {

	public static void main(String[] args) {
//		A.main();
//		System.out.println("Check");
//		B1 b1 = new B1();
//		System.out.println("\n\n\n");
		B2 i =new B2();
//	    System.out.println(i.i);
//		System.out.println(I.i);
//		System.out.println(I.i);
//	    E1 e= E1.check;
//	    System.out.println(e);

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
	default int d() {
		System.out.println("");
		getI();
		return 0;
	}
//	public static void main(String... args) {
//		
//	}
}

class B2 implements I{
	B2(){
		System.out.println("In B");
	}
	
	
}

//class B1 extends  A{
//	B1(){
//		System.out.println("In B");
//	}
//}

//class A {
//	static A a  =new A(2);
//	public static final int i = getI();
//	
//
//	static int getI() {
//		System.out.println("In I");
//		System.out.println(i);
//		return i;
//	}
//	
//	
//	
//	static int c = 12;
//	
//	A(){
//		System.out.println("Normal constructor");
//	}
//	
//	A(int i){
//		System.out.println(i);
//	}
//	
//	static void main() {
//		A a  = new A();
//	}
//}
//
//enum E implements I{}
//








