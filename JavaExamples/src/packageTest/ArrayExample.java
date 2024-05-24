package packageTest;

public class ArrayExample {
	
	public static void main(String[] args) {
		int num[] = new int[4];
		num[0]=6;
		num[1]=7;
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		int[] num2 = {1,2,3,4};
		for(int i=0; i<num.length; i++) {
		System.out.println(num2[i]);
		}
		num2[2]=1;
		for(int i=0; i<num.length;i++) {
		System.out.println(num2[i]);
		}
	}
}
