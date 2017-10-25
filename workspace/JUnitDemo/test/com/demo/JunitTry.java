package com.demo;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTry {
Sum s;
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		System.out.println("Before Class");
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		System.out.println("After Class");
//	}

	@Before
	public void setUp() throws Exception {
		s=new Sum();
	
//		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		s=null;
//		System.out.println("After");
	}

	@Test
	public void test0() {
		assertEquals("Print this line",5,s.sum(2, 3));
//		System.out.println(assertThat(12,Is<12>));
		int[] a ={6,2,7,4,9,6};
		Arrays.sort(a);
		int[] b ={2,4,6,6,7,9};
		
		assertArrayEquals(b, a);
		assertFalse("Check", 2>3);
		System.out.println(2);
		System.out.println(true);
//		System.out.println("In test2");
	}

	@Test
	public void test1() {
		System.out.println("In test2");
	}

	@Before
	public void before()  {
	
	
		System.out.println("Before from JunitTry");
	}

	@After
	public void after() {
		
		System.out.println("After from JunitTry");
	}
	
	@BeforeClass
	public static void beforeClass()  {
	
	
		System.out.println("BeforeClass from JunitTry");
	}

	@AfterClass
	public static void afterClass() {
		
		System.out.println("AfterClass from JunitTry");
	}

	
	
}
