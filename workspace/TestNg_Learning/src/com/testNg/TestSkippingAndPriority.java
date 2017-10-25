package com.testNg;



//import static org.testng.Assert.assertFalse;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkippingAndPriority {
@Test(priority=1)
public void testTestNg1(){
	System.out.println("In TestSkippingAndPriority Test");
//	assertFalse(true);
	throw new SkipException("Skipping this one");
//	System.out.println("first");
}
@Test(priority=2,dependsOnMethods={"testTestNg1"})
public void testTestNg0(){
	System.out.println("second");
}
}
