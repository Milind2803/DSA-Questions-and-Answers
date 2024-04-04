package maccess;

public class SearchWord {
	public static void main(String[] args) {
		String str = "This is orange juice";
		// find orange keyword
		str = str.toLowerCase();
		String[] words = str.split(" ");
		boolean isOrangePresent = false;
		for(String word : words) {
			if(word.equals("orange")) {
				isOrangePresent = true;
			}
		}
		if(isOrangePresent) {
			System.out.println("orange is present");
		}else {
			System.out.println("orange is not present");
		}
	}
}
