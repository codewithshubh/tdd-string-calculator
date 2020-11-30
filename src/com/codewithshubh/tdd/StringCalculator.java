package com.codewithshubh.tdd;

import java.util.List;
import static java.util.stream.Collectors.joining;

public class StringCalculator {

	public static int add(String string) {
		if (string.equals("") || string.isEmpty()) {
			return 0;
		}

		/*
		 * else { String delimiter = ","; if(string.matches("//(.*)\n(.*)")) { delimiter
		 * = Character.toString(string.charAt(2)); string = string.substring(4);
		 * delimiter += "|\n"; String numList[] = split(string, delimiter); return
		 * sum(numList);
		 * 
		 * } else { Helper helper = new Helper(); List<String> numbersList =
		 * helper.getNumbers(string); checkForNegativeNumbers(numbersList); return
		 * sumArray(numbersList); }
		 * 
		 * 
		 * delimiter += "|\n"; String numList[] = split(string, delimiter); return
		 * sum(numList);
		 * 
		 * 
		 * 
		 * }
		 */


		Helper helper = new Helper(); 
		List<String> numbersList = helper.getNumbers(string); 
		checkForNegativeNumbers(numbersList); 
		return sumArray(numbersList);

	}

	private static void checkForNegativeNumbers(List<String> numbersList) {
		String negatives = numbersList.stream().filter(s -> s.contains("-")).collect(joining(","));
		if (!negatives.isEmpty()) {
			throw new IllegalArgumentException("Negatives not allowed: " + negatives);
		}
	}

	private static int sumArray(List<String> numbersList) {
		return numbersList.stream().filter(s -> Integer.parseInt(s) <= 1000).mapToInt(Integer::parseInt).sum();
	}


	/*
	 * private static String[] split(String numbers, String divider) { return
	 * numbers.split(divider); }
	 * 
	 * private static int sum(String[] numbers) { int sum = 0; String negative_str =
	 * "";
	 * 
	 * for (String number : numbers) { if (Integer.parseInt(number) < 0) { if
	 * (negative_str.equals("")) negative_str = number; else negative_str += ("," +
	 * number); } if (Integer.parseInt(number) <= 1000) sum +=
	 * Integer.parseInt(number); } if (!negative_str.equals("")) { throw new
	 * IllegalArgumentException("Negatives not allowed: " + negative_str); } return
	 * sum; }
	 */

}
