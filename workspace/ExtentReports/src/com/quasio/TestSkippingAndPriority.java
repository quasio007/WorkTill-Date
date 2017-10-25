package com.quasio;

//import static org.testng.Assert.assertFalse;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extent.ExtentManager;

public class TestSkippingAndPriority {
	
	ExtentReports rep =ExtentManager.getInstance();
	ExtentTest test ;
	@BeforeMethod
	public void before(){
		test =rep.startTest("Skipping Test");
	}
	@AfterMethod
	public void after(){
		rep.endTest(test);
		rep.flush();
		
	}
	@Test(priority = 1)
	public void testTestNg1() {
		test.log(LogStatus.INFO, "Starting the Skipping test");
		System.out.println("In TestSkippingAndPriority Test");
		// assertFalse(true);
		throw new SkipException("Skipping this one");
		// System.out.println("first");
	}

	@Test(priority = 2, dependsOnMethods = { "testTestNg1" })
	public void testTestNg0() {
		System.out.println("second");
	}
}
