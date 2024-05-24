package packageTest;

import java.util.Scanner;

public class EvenOrdOdd {
	
	public static void main(String[] args) {
//		
//		int a = 3;
//		
//		if(a%2==0) {
//			System.out.println("even no.");
//		}
//		else {
//			System.out.println("odd no.");
//		}

		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			if(arr[i]%2==0) {
				System.out.println("even no.");
			}
			else {
				System.out.println("odd no.");
			}
		}
	}
}

