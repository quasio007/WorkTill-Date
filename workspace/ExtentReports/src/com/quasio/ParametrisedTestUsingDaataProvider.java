package com.quasio;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extent.ExtentManager;

public class ParametrisedTestUsingDaataProvider {
	ExtentReports rep =ExtentManager.getInstance();
	ExtentTest test ;
	int count =1;
	@BeforeMethod
	public void before(){
		test =rep.startTest("Parameterised Test: "+count);
		System.out.println("Before Methord");
		count++;
	}
	@AfterMethod
	public void after(){
		rep.endTest(test);
		rep.flush();
		System.out.println("After Methord");
		
	}
	
	@Test(dataProvider = "param")
	void f1(int input1,int input2,boolean result) throws Exception{
		test.log(LogStatus.INFO, "Starting the Parameterised test for f1");
		System.out.println("In ParametrisedTestUsingDaataProvider Test");
		System.out.println("In f1");
		Thread.sleep(3000);
		System.out.println("In f1 after");
		test.log(LogStatus.PASS, "Parameterised test Passed for f1");
	}
	@Test(dataProvider="param1")
	void f2(int input1,int input2) throws Exception{
		test.log(LogStatus.INFO, "Starting the Parameterised test for f2");
		System.out.println("In f2");
		Thread.sleep(3000);
		System.out.println("In f2 after");
		test.log(LogStatus.WARNING, "Parameterised test Passed for f2");
	}
	@Test(dataProvider = "param")
	void f3(int input1,int input2,boolean result) throws Exception{
		test.log(LogStatus.INFO, "Starting the Parameterised test for f3");
		System.out.println("In f3");
		Thread.sleep(3000);
		System.out.println("In f3 after");
		test.log(LogStatus.PASS, "Parameterised test Passed for f3");
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
