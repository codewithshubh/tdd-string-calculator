package com.codewithshubh.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("com.codewithshubh.tdd.StringCalculatorTest");
	    }

		@Test
		public void testEmpty() {
			assertEquals(0, StringCalculator.add(""));
		}
		
		@Test
		public void testOneNum() {
			assertEquals(2, StringCalculator.add("2"));
		}

}
