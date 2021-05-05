package com.myApp.com.myFirstApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
		@Test
		public void test_Sum() {
			Calculator c = new Calculator();
			int result = c.sum(5, 2);
			assertEquals(7, result);

	}

}
