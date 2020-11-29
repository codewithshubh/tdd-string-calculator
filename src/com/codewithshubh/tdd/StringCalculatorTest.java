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
			assertEquals(7, StringCalculator.add("7"));
		}
		
		@Test
		public void testTwoNum(){
			assertEquals(15, StringCalculator.add("6,9"));
		}
		
		@Test
		public void testUnknownNum() {
			try {
				StringCalculator.add("3,4,5");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Unknown number count");
			}
		}
		
		@Test
	    public void testNewLine(){
	    	assertEquals(6, StringCalculator.add("1\n2,3"));
	    }
		
		@Test
	    public void testDifferentDelimiter(){
	    	assertEquals(5, StringCalculator.add("//;\n1;4"));
	    }

}
