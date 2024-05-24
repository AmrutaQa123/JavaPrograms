package packageTest;

import java.util.*;

public class Practice3 {

	public static void main(String[] args) {
				
		System.out.println(sum("abc12k4k56"));
				
	}
	
	static int sum(String str) {
		
		String temp = "0";
		
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				temp+=ch;
			}
			else {
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum+Integer.parseInt(temp);
	}
	
//	public static void main(String[] args) {
//	String str = "Amruta";
//	
//	System.out.println(str.length());
//	}
}
