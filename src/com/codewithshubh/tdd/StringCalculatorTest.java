package com.codewithshubh.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import is.ru.stringcalculator.Calculator;

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
		
		@Test
		public void testTwoNum(){
			assertEquals(3, StringCalculator.add("1,2"));
		}
		
		@Test
		public void testUnknownNum() {
			try {
				StringCalculator.add("1,2,3");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Unknown number count");
			}
		}

}
