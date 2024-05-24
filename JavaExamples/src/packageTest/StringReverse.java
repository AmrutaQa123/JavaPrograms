package packageTest;

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
		
		//Or we can do it from stringBuffer
		String reverse = new StringBuffer(n1).reverse().toString();
		System.out.println(reverse);

	}

}
