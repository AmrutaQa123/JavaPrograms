package packageTest;

public class PositiveAndNegative {

	public static void main(String[] args) {
		int a[] = { -1, 2, -3, 4, -5 };

		int positive = 0, negative = 0, zero = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				positive++;
			} else if (a[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println("count"+ positive);
		System.out.println("count"+ negative);
		System.out.println("count"+ zero);

	}

}
