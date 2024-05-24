package packageTest;

import java.util.Arrays;

public class ReplaceString {

	public static void main(String[] args) {
		
		//To remove white spaces from a string
		String str1 = "abc ABC";
		
		String newStr = str1.replace(" ", "");
		
		System.out.println(newStr);
		
		//To replace trailing and leading spaces from the string
		String str2 = " abc ABC1 ";
		
		String str2new = str2.replaceAll(" ", "");

		System.out.println(str2new);
		
		//To sort a given array
		
		int[] arr = new int[] {1, -2, 0, 9, 4, 3};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
