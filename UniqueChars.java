//Implement an algorithm to determine if a string has all unique characters.

import java.util.HashSet;

public class UniqueChars {


	public static boolean UniqueCharChecker(String s) {

		HashSet <Character> hash = new HashSet<>();
		boolean result = false;
		s = s.replaceAll("\\s+","");
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; ++i) {
			result = hash.add(chars[i]);
			if (result == false) {
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Test 1. 'Hello' ");
		if (UniqueCharChecker("Hello"))
			System.out.println ("All Unique");
		else
			System.out.println("Not Unique");
			System.out.println();

		System.out.println("Test 2. 'The dog barn' ");
		if (UniqueCharChecker("The dog barn"))
			System.out.println ("All Unique");
		else
			System.out.println("Not Unique");
			System.out.println();

		System.out.println("Test 3. 'AAbcde' ");
		if (UniqueCharChecker("AAbcde"))
			System.out.println ("All Unique");
		else
			System.out.println("Not Unique");
			System.out.println();

		System.out.println("Test 4. '' ");
		if (UniqueCharChecker(""))
			System.out.println ("All Unique");
		else
			System.out.println("Not Unique");
			System.out.println();

	}
}
