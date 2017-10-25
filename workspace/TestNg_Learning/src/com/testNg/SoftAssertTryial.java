package com.testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTryial {
	SoftAssert soft =new SoftAssert();
  @Test
  public void trySoftAssert1() {
	  System.out.println("In SoftAssertTryial Test");
	  System.out.println(1);
	  soft.assertEquals(2, 3,"Check1");
	  System.out.println(2);
	  soft.assertEquals(3, 3);
	  System.out.println(3);
//	  soft.fail("Soft Assert Failed");
	  System.out.println(4);
//	  soft.assertAll();
	  System.out.println(5);
	  soft.assertEquals(2, 2);
	  System.out.println(6);
	  soft.assertEquals(3, 4,"Failes Here");
	  System.out.println(7);
//	  soft.fail("Soft Assert Failed");
	  System.out.println(8);
	  soft.assertAll();
	  System.out.println(9);
	  
  }
//  @Test
//  public void trySoftAssert2() {
//  }
}
