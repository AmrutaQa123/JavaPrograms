package packageTest;

public class StringOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to replace character or substring by new one
		String name = "This is ME";
		
		System.out.println(name.replace("This", "Which"));
		System.out.println(name.replaceAll("This", "This is not Me"));
		System.out.println(name.replaceFirst("Th", "H"));
		
		//How to find a char or substring from a string
		System.out.println(name.contains("is"));
		
		//How to split a string
		
		String nameSplit = "This is Me";
		String delimeter = " ";
		String[] temp = nameSplit.split(delimeter);
		
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		//How to convert string to uppercase
		
		String nameLower = "amruta";
		String nameUpper = nameLower.toUpperCase();
		
		System.out.println(nameUpper);
		
		//How to format string
		
		int[] arr = { 10, 20, 30 };
	      System.out.println(Arrays.toString(arr));

	      arr = Arrays.copyOf(arr, arr.length + 1);
	      arr[arr.length - 1] = 40; // Assign 40 to the last element
	      System.out.println(Arrays.toString(arr));
		
		
		//How to concat two strings
		String old = "Amruta";
		String New = old.concat("Pavi");
		System.out.println(New);
		
		
		
		
		
		
	}

}
