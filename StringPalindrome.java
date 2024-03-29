package maccess;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = rev + str.charAt(i);
		}
		if (str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
	}
}
