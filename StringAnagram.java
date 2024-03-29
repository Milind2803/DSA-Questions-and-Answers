package maccess;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {

		String s1 = "Race";
		String s2 = "Care";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if (s1.length() == s2.length()) {
			char[] myArray1 = s1.toCharArray();
			char[] myArray2 = s2.toCharArray();
			Arrays.sort(myArray1);
			Arrays.sort(myArray2);
			boolean result = Arrays.equals(myArray1, myArray2);
			if (result) {
				System.out.println("the string is anagram");
			} else {
				System.out.println("String is not anagram");
			}
		} else {
			System.out.println("string not a anagram");
		}
	}
}
