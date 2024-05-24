package packageTest;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
		int x, y, temp = 0;
		System.out.println("Enter the values of x and y");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		//without using 3rd variable
//		x = x+y;
//		y = x-y;
//		x = x-y;
		
		//using 3rd variable
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping the values of \n x is : " +x+ "and \n y is :" +y);
		
		
	}

}
