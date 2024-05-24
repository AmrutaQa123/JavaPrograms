package packageTest;

public class SumOfNumbersInString {

	public static void main(String[] args) {

		String str = "1abc23";

		String temp = "0";

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				sum += Integer.parseInt(temp);
				temp = "0";
			}
		}
		sum = sum + Integer.parseInt(temp);

		System.out.println(sum);
	}

}
