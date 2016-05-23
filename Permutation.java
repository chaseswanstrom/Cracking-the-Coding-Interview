//Given two strings, write a method to decide if one is a permutation of the other.

//not case sensitive
//white space sensitive to ignore replace whitespace i.e. replaceAll("\\s+,"")

import java.util.Arrays;
public class Permutation {

	public static boolean isPermutation(String strOne, String strTwo) {

		strOne = strOne.toLowerCase();
		strTwo = strTwo.toLowerCase();

		if (strOne.length() != strTwo.length()) {
			return false;
		}

		char[] charsOne = strOne.toCharArray();
		char[] charsTwo = strTwo.toCharArray();
		Arrays.sort(charsOne);
		Arrays.sort(charsTwo);

		return Arrays.equals(charsOne, charsTwo);

	}

	public static void main(String[] args) {

		System.out.println("Test 1. 'Hello', 'olleh' ");
		if (isPermutation("Hello", "olleh"))
			System.out.println ("is permutation");
		else
			System.out.println("not permutation");
			System.out.println();

		System.out.println("Test 2. 'Hello', 'World' ");
		if (isPermutation("Hello", "World"))
			System.out.println ("is permutation");
		else
			System.out.println("not permutation");
			System.out.println();

		System.out.println("Test 3. 'Hello', '' ");
		if (isPermutation("Hello", ""))
			System.out.println ("is permutation");
		else
			System.out.println("not permutation");
			System.out.println();

		System.out.println("Test 4. 'Hello World', 'helloworld' ");
		if (isPermutation("Hello World", "helloworld"))
			System.out.println ("is permutation");
		else
			System.out.println("not permutation");
			System.out.println();
	}
}