package packageTest;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
//		
//		int[] numbers = new int[] {2,5,9,12,16};
//		
//		int largest = numbers[0];
//		int smallest = numbers[1];
//		
//		for(int i=1; i<numbers.length; i++) {
//			if(numbers[i]>largest) {
//				largest=numbers[i];
//			}
//			else if(numbers[i]<smallest) {
//				smallest=numbers[i];
//			}
//		}
//		System.out.println("Smallest number is:" +smallest);
//		System.out.println("Largest number is:" +largest);
		
       //OR
		
		int a,b,c,temp,largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		
		a = sc.nextInt();
		System.out.println("enter the value of b");
		b = sc.nextInt();
		System.out.println("enter the value of c");
		c = sc.nextInt();
		
		temp=a>b?a:b;
		
		largest = c>temp?c:temp;
		
		System.out.println("largest: " +largest);
		
//		int a=10, b=5;
//		
//		if(a>b) {
//			System.out.println("a is larger:" +a);
//		}
//		else if(b>a) {
//			System.out.println("b is larger" +b);
//		}
	}

}
