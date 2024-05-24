package packageTest;

public class palindromeNumber {

	public static void main(String[] args) {

		int num = 1234;
		int temp = num;
		int rev = 0;

		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		System.out.println(rev);
		if (temp == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
	}

}
