package roughWork;

import java.util.ArrayList;
import java.util.List;

public class RoughWork {

	public static void main(String[] args) {
		// short s = 12;
		// char c = 122;
		// byte b = 12;
//		m(new Integer(1));
//		TreeMap<K, V>
//		int i =5, j;
//
//	for(int i: m())
//		System.out.println(i);
	try {
	System.out.println("hi");
		System.out.println("Hello"+" \n"+1/0);
	} catch (ArithmeticException e) {
		System.out.println("World");
	}

	}
	
	
	public static int[] m() {
		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(3);
		list.add(5);

		
	
		Object[] arr1 = 	list.stream().toArray();
		 int[] arr = new int[arr1.length];
		 
		 for(int i =0; i<arr1.length;i++) {
			 arr[i] = (int)arr1[i];
		 }
		 return arr;
		
		/*
		Integer[] arr1 = list.toArray(new Integer[3]);
		 int[] arr = new int[arr1.length];
		 
		 for(int i =0; i<arr1.length;i++) {
			 arr[i] = arr1[i];
		 }
		 return arr;
		*/ 
		 
		 
	}

	public static void m(byte d) {
		System.out.println("byte");
	}

	public static void m(char d) {
		System.out.println("char");
	}

	public static void m(short d) {
		System.out.println("short");
	}

	 public static void m(int d) {
	 System.out.println("int");
	 }

	public static void m(Integer d) {
		System.out.println("Integer");
	}
	 public static void m(long d) {
	 System.out.println("long");
	 }

	 public static void m(float d) {
	 System.out.println("float");
	 }
	
	 public static void m(double d) {
	 System.out.println("double");
	 }
}

abstract class Ab {
	abstract int m1();
}

interface I {
	int m1();
}

interface J extends I {
	int m2();
}

class A extends Ab {

	@Override
	protected int m1() {

		return 0;
	}

}

class B implements I {
public B(int data) {
	// TODO Auto-generated constructor stub
}
	@Override
	public int m1() {

		return 0;
	}

}



