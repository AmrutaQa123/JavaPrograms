package packageTest;

import java.util.HashMap;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n1 = "Amruta";
		String n2 = "";
		
		for(int i=n1.length()-1; i>=0; i--) {
			n2 = n2+n1.charAt(i);
		}
		System.out.println(n2);
		System.out.println(n1);
		if(n1.equals(n2)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		
		//To reverse a word from the sentence
		String str1 = "Amruta is my name";
		String str2[] = str1.split(" ");
		
//		for(int i=0; i<str2.length; i++) {
//			System.out.print(str2[i]+ " ");
//		}
		
//		System.out.println("");
		
		for(int i=str2.length-1; i>=0; i--) {
			System.out.print(str2[i]+ " ");
		}
}
	

}
