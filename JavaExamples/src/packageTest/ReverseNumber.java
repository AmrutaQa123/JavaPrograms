package packageTest;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=123, reverseNumber=0, temp=0;
		
		while(number>0) {
			temp=number%10;
			
			reverseNumber=reverseNumber*10+temp;
			
			number=number/10;
		}
		System.out.println(reverseNumber);
	}

}
