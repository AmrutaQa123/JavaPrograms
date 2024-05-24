package packageTest;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name1 = "This is Me";
		String name2 = "This is not Me";
		
		//Remove the 4th letter of name2 string
		
		
		//System.out.println(removeCharAt(name2, 4));
		StringBuffer str = new StringBuffer("This is not Me");
		str.deleteCharAt(3);
        System.out.println(str);
        
        System.out.println(removeCharAt(name1, 3));
        
        String n = "Hello World";
        String n2 = "world";
        
        //How to compare strings 
        System.out.println(n.compareTo(n2));
        
        String n3 = "Hello World";
        String n4 = "hello world";
        
        System.out.println(n3.compareTo(n4));
        
        
        //or
        
        System.out.println(n.compareToIgnoreCase(n2));
        
        //To check the lastindex of the string
        String word = "Hello last index test";
        
        int indexValue = word.lastIndexOf("index");
        
        if (indexValue == -1) {
        	System.out.println("Last index not found");
        }
        else {
        	System.out.println("Last index found : " + indexValue);
        }
        
        
        
	}

	private static String removeCharAt(String s, int pos) {
		// TODO Auto-generated method stub
		return s.substring(0, pos) + s.substring(pos+1);
	}

}
