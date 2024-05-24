package packageTest;

public class DuplicatesInArray {

	public static void main(String[] args) {

		// To find duplicates in the integer

		int[] arr = { 1, 2, 3, 3, 4, 5, 5 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates in the array :" + arr[j]);
				}
			}
		}

		// To find duplicates in the string

		String[] str = { "am", "am", "ab", "ac", "ac" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[j]);
				}
			}
		}

	}

}
