package packageTest;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) throws FileNotFoundException {
		
		//To find sum of all the integers in an array
		int sum=0;
		int[] arr = {1,2,3,4,5};
		
		for(int i:arr) {
			sum += i;
		}
		System.out.println(sum);
		
		//To find the second highest in an array
		
		int[] array2 = {10, 2, 3, 40};
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int i:array2) {
			if(i>highest) {
				secondHighest = highest;
				highest = i;
			}
			else if(i>secondHighest) {
				secondHighest=i;
			}
		}
		System.out.println(secondHighest);
		
		//If the file has string or not
		
		
//		String filepath = "C:\\Users\\ACCESS\\Documents\\AGILE METHODOLOGY_STLC_DEFECT CYCLE.docs";
//		File file = new File(filepath);
//		String str = "abc";
//		
//		Scanner sc = new Scanner(file);
//		
//		while(sc.hasNextLine()) {
//			String line = sc.nextLine();
//			if(line.contains(str)) {
//				sc.close();
//				System.out.println("true");;
//			}
//		}
//		sc.close();
//		System.out.println("false");
		
		String pattern = "mm-dd-yyyy";
		
		SimpleDateFormat simpleDate = new SimpleDateFormat();
		
		String date = simpleDate.format(new Date());
		
		System.out.println(date);
		
		
		//Merge two lists
		
//		List<String> list1 = new ArrayList<>();
		
		String str =" abc add ";
		
		System.out.println(str.strip());
		System.out.println(str.replaceAll(" ",""));
		
		//To check if the string contains vowels or numbers
		String string = "mrt123";
		System.out.println(string.matches(".*[aeiou].*"));
		System.out.println(string.matches(".*[0-9].*"));
		
	}

}
