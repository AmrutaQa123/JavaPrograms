package packageTest;

import java.util.HashSet;

public class ToRemoveDuplicatesFromString {
public static void main(String[] args) {
//	public static String removeDuplicates(String name) {
//		// TODO Auto-generated method stub
//
//		String str = name.toLowerCase();
//		char[] ch = str.toCharArray();
//
//		HashSet<Character> uniqueValues = new HashSet<>();
//
//		for (char c : ch) {
//			if (!uniqueValues.contains(c)) {
//				uniqueValues.add(c);
//			}
//		}
//
//		StringBuilder builder = new StringBuilder();
//
//		for (char c : uniqueValues) {
//			builder.append(c);
//		}
//
//		return builder.toString();
		String str = "Hackerearth";
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			int count=0;
			
			for(int j=0; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch[i]);
			}
		}
		

	}
}
//	public static void main(String[] args) {
//		System.out.println(removeDuplicates("hackerearth"));
//	}
//}