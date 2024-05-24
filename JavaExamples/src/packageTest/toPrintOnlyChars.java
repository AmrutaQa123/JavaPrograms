package packageTest;

public class toPrintOnlyChars {

	public static void main(String[] args) {
		
		String s = "2Hrge13fg";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(!Character.isDigit(ch)) {
				System.out.print(ch);
			}
		}

	}

}
