package com.testNg;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrisedTestUsingDaataProvider {

	@Test(dataProvider = "param")
	void f1(int input1,int input2,boolean result) throws Exception{
		System.out.println("In ParametrisedTestUsingDaataProvider Test");
		System.out.println("In f1");
//		Thread.sleep(3000);
//		System.out.println("In f1 after");
	}
	@Test(dataProvider="param1")
	void f2(int input1,int input2) throws Exception{
		System.out.println("In f2");
//		Thread.sleep(3000);
//		System.out.println("In f2 after");
	}
	@Test(dataProvider = "param")
	void f3(int input1,int input2,boolean result) throws Exception{
		System.out.println("In f3");
//		Thread.sleep(3000);
//		System.out.println("In f3 after");
	}
//	In order to run tests with different data paralley we can use attribute parallel =true in @DataProvider
	@DataProvider(parallel =true)
	public static Object[][] param(){
		Object[][] par ={{3,3,true},{2,3,false},{5,3,false}};
		return  par;
	}
	
	@DataProvider
	public static Integer[][] param1(){
		Integer[][] par ={{3,2},{2,2}};
		return  par;
	}
}
