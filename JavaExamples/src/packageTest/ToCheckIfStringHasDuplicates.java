package packageTest;

public class ToCheckIfStringHasDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String str = "Hackerearth";
//		char[] ch = str.toCharArray();
//		
//		boolean isNotDuplicate = false;
//		
//		for(int i=0; i<str.length(); i++) {
//			
//			boolean isDuplicate = false;
//			
//			for(int j=i+1; j<str.length(); j++) {
//				if(ch[i]==ch[j]) {
//					isDuplicate = true;
//				break;
//			}
//		}
//		if(isDuplicate) {
//			System.out.println(ch[i]);
//			isNotDuplicate = true;
//		}
//		}
//		if(!isNotDuplicate) {
//			System.out.println("no duplicatesisNotDuplicate");
//		}
		
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
