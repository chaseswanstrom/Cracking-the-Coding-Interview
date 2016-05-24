//Given a string, write a function to check if it is a permutation of a palindrome.
import java.util.HashMap;
import java.util.Map;

public class PermutationPalindrome {

	public static boolean isPermutationPalindrome (String s) {

		s = s.replaceAll("\\s+","").toLowerCase();
		int oddCount = 0;
		boolean result = false;

		Map<Character,Integer> charCount = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (charCount.containsKey(c))
				charCount.put(c, charCount.get(c) + 1);
			else
				charCount.put(c,1);
		}

		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			Character c = entry.getKey();
			int value = entry.getValue();
			if ((value % 2) != 0)
				++oddCount;
			else if (oddCount > 1)
				break;
		}

		if (oddCount <= 1)
			result = true;

		return result;
	}

	public static void main(String[] args) {

		System.out.println("Test 1: 'Tact Coa");
		if (isPermutationPalindrome("Tact Coa"))
			System.out.println("True");
		else
			System.out.println("False");
		
		System.out.println("Test 2: 'RRRRRRRR");
		if (isPermutationPalindrome("RRRRRRRR"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Test 3: 'abccdee");
		if (isPermutationPalindrome("Rabccdee"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Test 4: 'cccaaa1");
		if (isPermutationPalindrome("cccaaa1"))
			System.out.println("True");
		else
			System.out.println("False");

		System.out.println("Test 5: 'xxx1xxx");
		if (isPermutationPalindrome("xxx1xxx"))
			System.out.println("True");
		else
			System.out.println("False");


	}

}