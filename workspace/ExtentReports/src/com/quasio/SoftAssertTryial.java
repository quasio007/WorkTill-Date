package com.quasio;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extent.ExtentManager;

public class SoftAssertTryial {
	SoftAssert soft = new SoftAssert();
	ExtentReports rep =ExtentManager.getInstance();
	ExtentTest test ;
	@BeforeMethod
	public void before(){
		test =rep.startTest("SoftAssert Test");
	}
	@AfterMethod
	public void after(){
		rep.endTest(test);
		rep.flush();
		
	}
	@Test
	public void trySoftAssert1() {
		test.log(LogStatus.INFO, "Starting the SoftAssertion test");
		System.out.println("In SoftAssertTryial Test");
		System.out.println(1);
		soft.assertEquals(2, 2);
		System.out.println(2);
		soft.assertEquals(3, 3);
		System.out.println(3);
		// soft.fail("Soft Assert Failed");
		System.out.println(4);
		soft.assertAll();
		System.out.println(5);
		soft.assertEquals(2, 2);
		System.out.println(6);
		soft.assertEquals(3, 3);
		System.out.println(7);
		// soft.fail("Soft Assert Failed");
		System.out.println(8);
		soft.assertAll();
		System.out.println(9);
		test.log(LogStatus.PASS, "SoftAssertion test Passed");
	}
	// @Test
	// public void trySoftAssert2() {
	// }
}
