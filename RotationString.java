package maccess;

public class RotationString {
	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "cdab";
		if (s1.length() != s2.length()) {
			System.out.println("The String not rotation");
		}
		String s3 = s1 + s1;
		if (s3.indexOf(s2) != -1) {
			System.out.println("string is rotation");
		} else {
			System.out.println("not a rotation");
		}
	}
}
