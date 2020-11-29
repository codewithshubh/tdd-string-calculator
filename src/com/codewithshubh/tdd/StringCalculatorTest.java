package com.codewithshubh.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("com.codewithshubh.tdd.StringCalculatorTest");
	    }

		@Test
		public void testEmptyString() {
			assertEquals(0, StringCalculator.add(""));
		}

}
