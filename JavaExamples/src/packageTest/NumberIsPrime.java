package packageTest;

import java.util.Scanner;

public class NumberIsPrime {
	
public static void main(String[] args) {
	
	int num,temp=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for a");
	num = sc.nextInt();
	
	
	for(int i=2; i<num; i++ ) {
		if(num%i==0) {
			temp=temp+1;
			break;
		}
	}
	if(temp==0) {
		
		System.out.println("This is  a prime number");
	}
	else {
		System.out.println("This is not a prime number");
	}
	
//	int temp=0;
//	for(int i=1; i<=20; i++) {
//		for(int j=2; j<=i-1; j++) {
//			if(i%j==0) {
//			    temp = temp+1;	
//			}
//	}
//		if(temp==0) {
//			System.out.println(i);
//		}
//		else {
//			temp=0;
//		}
//	
//	
// }	
	
	int flag =0;
	
	int a[] = {1,2,3,4,5,6,7,8,9};
	
	for(int i=0; i<a.length; i++) {
		flag=0;
		for(int j=2; j<a[i]/2; j++) {
			if(a[i]%j == 0) {
			flag=1;
			break;
		}
	}
	System.out.println(a[i]+ " "+ (flag==0?"prime":"not prime"));
}
}
}