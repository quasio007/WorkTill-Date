package zycus;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		/*
		Class j =E.class;
		System.out.println(j.getSuperclass().getSuperclass());
*/
		
		int[] i1 = {1,2,3};
		int[] i2 = {4,2,3};
		int[] i3 = {6,2,3};
		int[] arr[] = {i1,i2,i3};
		
		List<int[]> list = Arrays.asList(i1,i2,i3);
		
		abs(new AB() {
		});
		
	}
	
	static void abs(AB a) {}
	
	static void methord1() throws MyException {
		throw new MyException();
	}
	
    static void methord2() {
    	throw new MyRunTimeException();
	}
	
	
	static class  MyException extends Exception{
		
	}
	
	static class MyRunTimeException extends RuntimeException{
		
	}

}



abstract class AB{}






interface I{}

interface J extends I{}

class C implements I{}

enum E implements I{}
