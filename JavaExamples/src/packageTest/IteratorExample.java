package packageTest;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		for(int i=0; i<=10; i++) {
			al.add(i);
		}
		
		Iterator<Object> itr = al.iterator();
		
		while(itr.hasNext()) {
			int y = (int) itr.next();
			
			if(y%2==1) {
				System.out.println(y);
			}
			else {
				itr.remove();
			}
			
		}
		System.out.println(al);
	
		
		

	}

}
