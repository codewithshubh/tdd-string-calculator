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
		public void testUnknownNum() {
			assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
		}
		
		@Test
		public void testTwoNum(){
			assertEquals(15, StringCalculator.add("6,9"));
		}
		
		@Test
	    public void testNewLine(){
	    	assertEquals(6, StringCalculator.add("1\n2\n3"));
	    }
		
		@Test
	    public void testSameDelimiterSingle(){
	    	assertEquals(5, StringCalculator.add("//[;]\n1;4"));
	    }
		
		@Test
	    public void testNegativeNum(){
	    	try {
				StringCalculator.add("1,-2");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Negatives not allowed: -2");
			}
	    	
	    	try {
	    		StringCalculator.add("-4,-5,2");
			}
			catch (IllegalArgumentException e){
				assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
			}
	    }
		
	    @Test
	    public void testMoreThan1000() {
	        assertEquals(1009, StringCalculator.add("4,1000,1001,5,1284"));
	    }
	    
	    @Test
	    public void testSameAnyLengthDelimiter() {
	        assertEquals(6, StringCalculator.add("//[***]\n1***2***3"));
	        assertEquals(3 + 2 + 4, StringCalculator.add("//[ddd]\n3ddd2ddd4"));
	    }
	    
	    @Test
	    public void testDiffDelimiterSingle() {
	        assertEquals(6, StringCalculator.add("//[*][%]\n1*2%3"));
	    }
	    
	    @Test
	    public void testDiffDelimiterAnyLength() {
	        assertEquals(6, StringCalculator.add("//[**][%%]\n1**2%%3"));
	    }
	    
}
