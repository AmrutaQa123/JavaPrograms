package packageTest;

public class isVowel {

	public static void main(String[] args) {
		System.out.println(isVowel("ssss"));
	}
	public static boolean isVowel(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
}
