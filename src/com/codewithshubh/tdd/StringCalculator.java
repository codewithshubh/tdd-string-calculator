package com.codewithshubh.tdd;

public class StringCalculator {
	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else {
			//return Integer.parseInt(text);
			String delimiter = ",";
			String numList[] = split(text, delimiter + "|\n");
			if(numList.length>2)
			{
				throw new IllegalArgumentException("Unknown number count");
			}
			return sum(numList);
		}
	}
	
	private static String[] split(String numbers, String divider){
	    return numbers.split(divider);
	}
	
	private static int sum(String[] numbers){
 	    int total = 0; 
        for(String number : numbers){
        	total+=Integer.parseInt(number);
		}

		return total;
    }
}
