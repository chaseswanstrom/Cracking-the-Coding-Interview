//3 types of edits that can be performed on a strins: Insert a character,
//remove a character, or replace a character. Given two strings, write a function
//to check if they are one edit (or zero edits) away.

public class StringEdits {

	static boolean stringEdit(String str1, String str2) {

		if (str1.equals(str2)) 
			return true;

		if (Math.abs(str1.length() - str2.length()) > 1)
			return false;

		String s1  = str1.length() < str2.length() ? str1 : str2;
		String s2 = str1.length() < str2.length() ? str2 : str1;

		int i = 0, j = 0;
		boolean different = false;

		while (j < s2.length() && i < s1.length()) {
			if(s1.charAt(i) != s2.charAt(j)){
				if (different)
					return false;
				different = true;

				if (s1.length() == s2.length()) {
					++i;
				}
			} else {
				++i;
			}
			++j;
		}	
		return true;		

	}

	public static void main(String[] args) {

		System.out.println("Test 1: pale, ple");
		if (stringEdit("pale", "ple"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Test 2: poly, ple");
		if (stringEdit("poly", "ple"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Test 3: pale, kale");
		if (stringEdit("pale", "kale"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}

//solution derived from cracking the coding interview page 201