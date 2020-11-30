package com.codewithshubh.tdd;

public class StringCalculator {
	public static int add(String string){
		if(string.equals("")){
			return 0;
		}
		else {
			String delimiter = ",";
			if(string.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(string.charAt(2));
				string = string.substring(4);
			}
			
			String numList[] = split(string, delimiter + "|\n");
			return sum(numList);
		}
	}
	
	private static String[] split(String numbers, String divider){
	    return numbers.split(divider);
	}
	
	private static int sum(String[] numbers){
		int sum = 0;
 	    String negative_str = "";

        for(String number : numbers){
        	if(Integer.parseInt(number) < 0){
        		if(negative_str.equals(""))
        			negative_str = number;
        		else
        			negative_str += ("," + number);
        	}
        	if(Integer.parseInt(number) <= 1000)
		    	sum += Integer.parseInt(number);
		}

		if(!negative_str.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negative_str);
		}
		return sum;
    }
}
