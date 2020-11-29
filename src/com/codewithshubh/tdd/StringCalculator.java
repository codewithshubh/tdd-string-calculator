package com.codewithshubh.tdd;

public class StringCalculator {
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			return Integer.parseInt(text);
		}
	}
}
