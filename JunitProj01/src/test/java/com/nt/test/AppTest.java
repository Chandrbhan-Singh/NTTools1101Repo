package com.nt.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class AppTest{
	
	private static Arithmetic ar;
	@BeforeAll
	public static void setupBeforeAll() {
		System.out.println("AppTest.setupBeforeAll()");
		ar=new Arithmetic();
		
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("AppTest.setUp()");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("AppTest.tearDown()");
	}
	
	@Test
	public void testWithPositives() {
		System.out.println("AppTest.testWithPositives()");
		float expected=300.0f;
		float actual=ar.sum(100.0f, 200.0f);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithNagetives() {
		System.out.println("AppTest.testWithNagetives()");
		float expected=-500.0f;
		float actual=ar.sum(-200.0f, -300.0f);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testWithMixedValues() {
		System.out.println("AppTest.testWithMixedValues()");
		float expected=-200.0f;
		float actual=ar.sum(200.0f, -400.0f);
		assertEquals(expected, actual);
	}
	
	@AfterAll
	public static void tearDownAll() {
		System.out.println("AppTest.tearDownAll()");
		ar=null;
	}
}