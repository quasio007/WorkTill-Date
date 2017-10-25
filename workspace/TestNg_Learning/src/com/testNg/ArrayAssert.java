package com.testNg;



import static org.testng.AssertJUnit.assertArrayEquals;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.Arrays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayAssert {

	@Test
	public void f1(){
		System.out.println("In ArrayAssert Test");
		assertEquals(5,5,"Print this line");
		int[] a ={6,2,7,4,9,6};
		Arrays.sort(a);
		int[] b ={2,4,6,6,7,9};
		
		assertArrayEquals(b, a);
		assertFalse( 2>3,"Check");
		System.out.println(2);
		System.out.println(true);
	} 
	
	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BeforeMethod from ArrayAssert");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AfterMethod from ArrayAssert");
	  }
}
