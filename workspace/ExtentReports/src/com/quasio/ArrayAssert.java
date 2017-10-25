package com.quasio;

import static org.testng.AssertJUnit.assertArrayEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extent.ExtentManager;

public class ArrayAssert {
ExtentReports rep =ExtentManager.getInstance();
ExtentTest test ;
@BeforeMethod
public void before(){
	test =rep.startTest("Array Test");
}
@AfterMethod
public void after(){
	rep.endTest(test);
	rep.flush();
	
}
	@Test
	public void f1() {
		test.log(LogStatus.INFO, "Starting the Array test");
		System.out.println("In ArrayAssert Test");
		test.log(LogStatus.INFO, "Initiating Array Validation");
		assertEquals(5, 5, "Print this line");
		int[] a = { 6, 2, 7, 4, 9, 6 };
		Arrays.sort(a);
		int[] b = { 2, 4, 6, 6, 7, 9 };

		assertArrayEquals(b, a);
		test.log(LogStatus.INFO, "Array Validation Completes");
		assertFalse(2 > 3, "Check");
		System.out.println(2);
		System.out.println(true);
		test.log(LogStatus.PASS, "Test Passed Successfully");
	}
	
}
