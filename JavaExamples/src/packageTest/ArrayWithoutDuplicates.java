package packageTest;

public class ArrayWithoutDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6 };

		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == x) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(x);
			}

		}

	} //output: [1,3,5,6]

}
