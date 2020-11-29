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
 	    int total = 0; 
        for(String number : numbers){
        	total+=Integer.parseInt(number);
		}
		return total;
    }
}
