package maccess;

public class ReverseAlternateChar {
	public static void main(String[] args) {
		String str = "java is the best";
		for (int i = str.length() - 1; i > 0; i -= 2) {
			System.out.print(str.charAt(i));
		}
	}
}
