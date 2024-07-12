package com.nt.test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;


public class AppTest {
	
	@Test
	public void testWithPositive() {
		Arithmetic ar=new Arithmetic();

		int expected=50;
		int actual=ar.sum(30, 20);
			assertEquals(expected, actual);
	}
	
	@Test
	public void testWithNegative() {
		Arithmetic ar=new Arithmetic();
		int expected=-100;
		int actual=ar.sum(-50, -50);
		assertEquals(expected, actual);
	}
	@Test
	public void testWithZero() {
		Arithmetic ar=new Arithmetic();
		int expected=0;
		int actual=ar.sum(0, 0);
		assertEquals(expected, actual);
	}

}
