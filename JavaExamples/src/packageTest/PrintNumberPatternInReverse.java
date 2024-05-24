package packageTest;

public class PrintNumberPatternInReverse {

	public static void main(String[] args) {
		
		int num=8;
		int k=1;
		for(int row=1; row<=num; row++) {
			for(int col=num; col>=row; col--) {
				System.out.print(col+ " ");
			}
			System.out.print("\n");
		}

	}

}
